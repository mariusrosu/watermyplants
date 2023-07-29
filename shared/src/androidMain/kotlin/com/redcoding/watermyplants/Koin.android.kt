package com.redcoding.watermyplants

import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.driver.android.AndroidSqliteDriver

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
