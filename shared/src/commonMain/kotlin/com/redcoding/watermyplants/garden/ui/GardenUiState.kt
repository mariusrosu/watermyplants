package com.redcoding.watermyplants.garden.ui

import com.redcoding.watermyplants.uilibrary.components.CheckBoxTextState
import com.redcoding.watermyplants.uilibrary.components.TitleState

sealed class GardenUiState {

    open val titleState: TitleState = TitleState("Water my plants")

    object Loading : GardenUiState() {

        override val titleState: TitleState = TitleState("Loading")
    }

    object Empty : GardenUiState()

    data class Content(
        val plantStates: List<CheckBoxTextState>,
    ) : GardenUiState()
}
