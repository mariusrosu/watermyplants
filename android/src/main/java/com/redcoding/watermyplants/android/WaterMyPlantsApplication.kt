package com.redcoding.watermyplants.android

import android.app.Application
import android.content.Context

import com.redcoding.watermyplants.android.garden.GardenViewModel
import com.redcoding.watermyplants.initKoin

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

class WaterMyPlantsApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin(
            module {
                single<Context> { this@WaterMyPlantsApplication }
                viewModel { GardenViewModel(getGardenStateEntryPoint = get()) }
            }
        )
    }
}
