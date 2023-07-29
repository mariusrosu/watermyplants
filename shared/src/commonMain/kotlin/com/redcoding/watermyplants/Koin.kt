package com.redcoding.watermyplants

import com.redcoding.watermyplants.garden.data.di.gardenDataModule
import com.redcoding.watermyplants.garden.domain.di.gardenDomainModule

import org.koin.core.context.startKoin
import org.koin.core.module.Module

fun initKoin(appModule: Module) = startKoin {
    modules(
        appModule,
        platformModule,
        gardenDataModule,
        gardenDomainModule,
    )
}

expect val platformModule: Module
