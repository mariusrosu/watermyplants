package com.redcoding.watermyplants.garden.data.di

import com.redcoding.watermyplants.GardenDatabase
import org.koin.dsl.module

internal val gardenDataModule = module {
    single {
        GardenDatabase(driver = get())
    }
}
