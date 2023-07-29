package com.redcoding.watermyplants.garden.data.sqldelight

import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.driver.native.NativeSqliteDriver

import com.redcoding.watermyplants.GardenDatabase

actual class DriverFactory {
    actual fun createDriver(): SqlDriver {
        return NativeSqliteDriver(GardenDatabase.Schema, "garden.db")
    }
}
