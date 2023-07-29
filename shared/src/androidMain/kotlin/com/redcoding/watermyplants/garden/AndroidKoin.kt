package com.redcoding.watermyplants.garden

import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.driver.android.AndroidSqliteDriver

import com.redcoding.watermyplants.GardenDatabase

import org.koin.core.module.Module
import org.koin.dsl.module

actual val platformModule: Module = module {
    single<SqlDriver> {
        AndroidSqliteDriver(
            schema = GardenDatabase.Schema,
            context = get(),
            name = "garden.db",
        )
    }
}
