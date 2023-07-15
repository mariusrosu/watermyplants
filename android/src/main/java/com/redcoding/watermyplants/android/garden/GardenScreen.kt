package com.redcoding.watermyplants.android.garden

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel

import com.redcoding.watermyplants.android.uilibrary.components.CheckBoxText
import com.redcoding.watermyplants.android.uilibrary.components.Page
import com.redcoding.watermyplants.android.uilibrary.components.Title
import com.redcoding.watermyplants.garden.ui.GardenUiState
import com.redcoding.watermyplants.uilibrary.components.TitleState

@Composable
internal fun GardenScreen(
    // TODO: Provide view model
    viewModel: GardenViewModel = viewModel()
) {
    val uiState by viewModel.uiState.collectAsState()
    GardenScreen(uiState = uiState)
}

@Composable
private fun GardenScreen(uiState: GardenUiState) {
    Page {
        LazyColumn {
            when (uiState) {
                is GardenUiState.Loading -> loadingSection()
                is GardenUiState.Content -> gardenSection(uiState)
            }
        }
    }
}

private fun LazyListScope.gardenSection(uiState: GardenUiState.Content) {
    item {
        Title(state = uiState.titleState)
    }
    uiState.plantStates.forEach {
        item { CheckBoxText(state = it) }
    }
}

private fun LazyListScope.loadingSection() {
    item {
        Title(state = TitleState("Loading"))
    }
}


// region GardenScreen Previews
@Preview
@Composable
internal fun GardenScreenPreview() {
    GardenScreen()
}
// endregion
