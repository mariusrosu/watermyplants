package com.redcoding.watermyplants.android.application

import android.app.Application
import android.content.Context

import com.redcoding.watermyplants.android.garden.GardenViewModel
import com.redcoding.watermyplants.initKoin

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

class WaterMyPlantsApplication : Application() {

    private val appModule = module {
        single<Context> { this@WaterMyPlantsApplication }
        viewModel { GardenViewModel(getGardenStateEntryPoint = get(), addPlantEntryPoint = get()) }
    }

    override fun onCreate() {
        super.onCreate()
        initKoin(appModule)
    }
}
