package com.gdsciist.composecamp.ui.screens.home

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.gdsciist.composecamp.ui.components.ContactItem
import com.gdsciist.composecamp.data.ContactList.contactsList

@Composable
fun ChatTab() {

    LazyColumn(modifier = Modifier.fillMaxSize()) {
        items(contactsList) { contactsList ->
            ContactItem(contactsList)
        }
    }
}
