package com.saurabh.kmmdemo.data.note

import com.saurabh.kmmdemo.database.NoteDatabase
import com.saurabh.kmmdemo.domain.note.Note
import com.saurabh.kmmdemo.domain.note.NoteDataSource
import com.saurabh.kmmdemo.domain.time.DateTimeUtil

class SqlDelightNoteDataSource(db: NoteDatabase): NoteDataSource {
    private val queries= db.noteQueries

    override suspend fun insertNote(note: Note) {
        queries.insertNote(
            id = note.id,
            title = note.title,
            content = note.content,
            colorHex = note.colorHex,
            createdOn = DateTimeUtil.toEpochMillis(note.createdOn)
        )
    }

    override suspend fun getNoteById(id: Long): Note? {
        return queries.getNoteById(id)
            .executeAsOneOrNull()
            ?.toNote()
    }

    override suspend fun getAllNotes(): List<Note> {
        return queries.getAllNotes()
            .executeAsList()
            .map { it.toNote() }
    }

    override suspend fun deleteNoteById(id: Long) {
        queries.deleteNoteById(id)
    }
}