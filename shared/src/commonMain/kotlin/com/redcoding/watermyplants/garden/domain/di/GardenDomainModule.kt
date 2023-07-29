package com.redcoding.watermyplants.garden.domain.di

import com.redcoding.watermyplants.garden.data.sqldelight.SqlGardenDataSource
import com.redcoding.watermyplants.garden.domain.AddPlantEntryPoint
import com.redcoding.watermyplants.garden.domain.GardenDataSource
import com.redcoding.watermyplants.garden.domain.GetGardenStateEntryPoint

import org.koin.dsl.module

internal val gardenDomainModule = module {

    single<GardenDataSource> {
        SqlGardenDataSource(database = get())
    }

    single {
        GetGardenStateEntryPoint(dataSource = get())
    }

    single {
        AddPlantEntryPoint(dataSource = get())
    }
}
