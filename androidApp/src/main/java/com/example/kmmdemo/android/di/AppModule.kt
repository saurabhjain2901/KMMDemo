package com.example.kmmdemo.android.di

import android.app.Application
import com.example.kmmdemo.data.local.DatabaseDriverFactory
import com.example.kmmdemo.data.note.SqlDelightNoteDataSource
import com.example.kmmdemo.database.NoteDatabase
import com.example.kmmdemo.domain.note.NoteDataSource
import com.squareup.sqldelight.db.SqlDriver
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideSqlDriver(app:Application) : SqlDriver{
        return DatabaseDriverFactory(app).createDriver()
    }

    @Provides
    @Singleton
    fun provideNoteDataSource(sqlDriver: SqlDriver) : NoteDataSource{
        return SqlDelightNoteDataSource(NoteDatabase(sqlDriver))
    }
}