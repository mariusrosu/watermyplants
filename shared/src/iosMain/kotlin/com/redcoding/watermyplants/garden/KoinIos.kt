package com.redcoding.watermyplants.garden

import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.driver.native.NativeSqliteDriver

import com.redcoding.watermyplants.GardenDatabase
import com.redcoding.watermyplants.garden.ui.SharedGardenViewModel

import org.koin.core.Koin
import org.koin.core.KoinApplication
import org.koin.core.component.KoinComponent
import org.koin.core.logger.Logger
import org.koin.core.parameter.parametersOf
import org.koin.dsl.module

import platform.Foundation.NSUserDefaults

fun initKoinIos(userDefaults: NSUserDefaults, doOnStartup: () -> Unit): KoinApplication = initKoin(
    module {
        single { doOnStartup }
    }
)

actual val platformModule = module {
    single<SqlDriver> { NativeSqliteDriver(schema = GardenDatabase.Schema, name = "garden.db") }
}

@Suppress("unused") // Called from Swift
object KotlinDependencies : KoinComponent {
    fun getSharedGardenViewModel() = getKoin().get<SharedGardenViewModel>()
}
