package com.saurabh.kmmdemo.di

import com.saurabh.kmmdemo.data.local.DatabaseDriverFactory
import com.saurabh.kmmdemo.data.note.SqlDelightNoteDataSource
import com.saurabh.kmmdemo.database.NoteDatabase
import com.saurabh.kmmdemo.domain.note.NoteDataSource

class DatabaseModule {

    private val factory by lazy { DatabaseDriverFactory() }
    val noteDataSource: NoteDataSource by lazy {
        SqlDelightNoteDataSource(NoteDatabase(factory.createDriver()))
    }
}