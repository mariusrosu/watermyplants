package com.redcoding.watermyplants.android.plantdetails

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

import com.redcoding.watermyplants.android.uilibrary.components.Page
import com.redcoding.watermyplants.android.uilibrary.components.Title
import com.redcoding.watermyplants.uilibrary.components.TitleState

@Composable
internal fun PlantDetailsScreen() {
    Page {
        Title(state = TitleState("Plant details"))
    }
}

// region PlantDetailsScreen previews
@Preview
@Composable
internal fun PlantDetailsScreenPreview() {
    PlantDetailsScreen()
}
// endregion