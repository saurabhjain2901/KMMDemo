package com.saurabh.kmmdemo.android.note_list

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
@Preview
fun NoteEditScreen(){
    var titleValue = remember { "" }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
            .padding(10.dp)
    ) {
        OutlinedTextField(
            value = titleValue,
            onValueChange = {
                titleValue = it
            },
            modifier = Modifier
                .fillMaxWidth(),
            placeholder = { Text(text = "Enter note title")},
            maxLines = 1
        )
        OutlinedTextField(
            value = titleValue,
            onValueChange = {
                titleValue = it
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
                .padding(top = 10.dp),
            placeholder = { Text(text = "Enter note details")},
        )

        Button(
            onClick = {  },
            modifier = Modifier.fillMaxWidth()
                .height(50.dp)
                .padding(top = 10.dp)
                .background(color = Color.Blue),
            shape = RoundedCornerShape(10.dp)
        ) {
            Text(text = "Save")
        }
    }
}