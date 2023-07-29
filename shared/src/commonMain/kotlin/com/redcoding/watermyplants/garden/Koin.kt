package com.redcoding.watermyplants.garden

import com.redcoding.watermyplants.garden.data.sqldelight.SqlGardenDataSource
import com.redcoding.watermyplants.garden.domain.GardenDataSource
import com.redcoding.watermyplants.garden.domain.GetGardenStateEntryPoint

import org.koin.core.KoinApplication
import org.koin.core.context.startKoin
import org.koin.core.module.Module
import org.koin.dsl.module

fun initKoin(appModule: Module): KoinApplication {
    val koinApplication = startKoin {
        modules(
            appModule,
            platformModule,
            coreModule,
        )
    }
    return koinApplication
}

private val coreModule = module {

    single<GardenDataSource> {
        SqlGardenDataSource(database = get())
    }

    single {
        GetGardenStateEntryPoint(dataSource = get())
    }
}

expect val platformModule: Module
