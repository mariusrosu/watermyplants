package com.redcoding.watermyplants.garden.ui

import com.redcoding.watermyplants.uilibrary.components.CheckBoxTextState
import com.redcoding.watermyplants.uilibrary.components.TitleState

sealed interface GardenUiState {
    object Loading : GardenUiState

    data class Content(
        val titleState: TitleState,
        val plantStates: List<CheckBoxTextState>,
    ) : GardenUiState
}
