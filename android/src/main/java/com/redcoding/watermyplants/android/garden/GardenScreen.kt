package com.redcoding.watermyplants.android.garden

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.tooling.preview.Preview

import com.redcoding.watermyplants.android.uilibrary.components.CheckBoxText
import com.redcoding.watermyplants.android.uilibrary.components.CheckBoxTextState
import com.redcoding.watermyplants.android.uilibrary.components.Page
import com.redcoding.watermyplants.android.uilibrary.components.Title
import com.redcoding.watermyplants.android.uilibrary.components.TitleState
import com.redcoding.watermyplants.android.uilibrary.foundations.CheckBoxState
import com.redcoding.watermyplants.garden.ui.SharedGardenViewModel
import com.redcoding.watermyplants.garden.ui.UiState

@Composable
internal fun GardenScreen(
    // TODO: Provide view model
    viewModel: SharedGardenViewModel = SharedGardenViewModel()
) {
    val uiState by viewModel.uiState.collectAsState()
    GardenScreen(uiState = uiState)
}

@Composable
private fun GardenScreen(uiState: UiState) {
    Page {
        LazyColumn {
            item {
                Title(
                    state = TitleState(text = "Water my plants")
                )
            }
            uiState.plants.forEach {
                item {
                    CheckBoxText(
                        state = CheckBoxTextState(
                            checkBoxState = CheckBoxState(isChecked = true),
                            text = it.name,
                        )
                    )
                }
            }
        }
    }
}

// region GardenScreen Previews
@Preview
@Composable
internal fun GardenScreenPreview() {
    GardenScreen()
}
// endregion
