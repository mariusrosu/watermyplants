package com.redcoding.watermyplants.android.plantadd

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

import com.redcoding.watermyplants.android.uilibrary.components.Page

@Composable
internal fun PlantAddScreen() {
    Page {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color.Blue)
        )
    }
}

// region PlantAddScreen previews
@Preview
@Composable
internal fun PlantDetailsScreenPreview() {
    PlantAddScreen()
}
// endregion
