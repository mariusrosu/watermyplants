package com.redcoding.watermyplants.android.garden

import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

import com.redcoding.watermyplants.android.uilibrary.components.CheckBoxText
import com.redcoding.watermyplants.android.uilibrary.components.Page
import com.redcoding.watermyplants.android.uilibrary.components.Title
import com.redcoding.watermyplants.garden.ui.GardenUiAction
import com.redcoding.watermyplants.garden.ui.GardenUiState

import org.koin.androidx.compose.koinViewModel

@Composable
internal fun GardenScreen(
    viewModel: GardenViewModel = koinViewModel(),
    //onPlantDetailsClicked: () -> Unit,
) {
    val uiState by viewModel.uiState().collectAsState()
    GardenScreen(
        uiState = uiState,
        onPlantDetailsClicked = remember { { viewModel.onUiAction(GardenUiAction.AddPlantClicked) } },
    )
}

@Composable
private fun GardenScreen(
    uiState: GardenUiState,
    onPlantDetailsClicked: () -> Unit,
) {
    Page {
        LazyColumn {
            when (uiState) {
                is GardenUiState.Loading -> loadingSection(uiState)
                is GardenUiState.Empty -> emptySection(uiState)
                is GardenUiState.Content -> gardenSection(uiState)
            }
        }
        Button(
            modifier = Modifier.wrapContentSize(),
            onClick = onPlantDetailsClicked,
        ) {
            Text(text = "Click")
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

private fun LazyListScope.loadingSection(uiState: GardenUiState.Loading) {
    item {
        Title(state = uiState.titleState)
    }
}

private fun LazyListScope.emptySection(uiState: GardenUiState.Empty) {
    item {
        Title(state = uiState.titleState)
    }
}

// region GardenScreen Previews
@Preview
@Composable
internal fun GardenScreenPreview() {
    //GardenScreen(onPlantDetailsClicked = {})
}
// endregion
