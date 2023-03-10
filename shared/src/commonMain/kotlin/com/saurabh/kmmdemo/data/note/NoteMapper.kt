package com.saurabh.kmmdemo.data.note

import com.saurabh.kmmdemo.domain.note.Note
import database.NoteEntity
import kotlinx.datetime.Instant
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime

fun NoteEntity.toNote(): Note {
    return Note(
        id = id,
        title = title,
        content = content,
        colorHex = colorHex,
        createdOn = Instant.fromEpochMilliseconds(createdOn).toLocalDateTime(TimeZone.currentSystemDefault())
    )
}