package com.gdsciist.composecamp.ui.screens.home

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gdsciist.composecamp.ui.components.CallsItem
import com.gdsciist.composecamp.data.CallList.callList

@Composable
@Preview(showBackground = true)
fun CallTab() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        items(callList) { callList ->
            CallsItem(call = callList)
        }
    }
}