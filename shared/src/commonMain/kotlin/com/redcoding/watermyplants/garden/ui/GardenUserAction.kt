package com.redcoding.watermyplants.garden.ui

sealed interface GardenUiAction {
    object AddPlantClicked : GardenUiAction
}
