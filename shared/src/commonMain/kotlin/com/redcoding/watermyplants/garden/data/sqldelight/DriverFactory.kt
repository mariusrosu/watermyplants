package com.redcoding.watermyplants.garden.data.sqldelight

import app.cash.sqldelight.db.SqlDriver
import com.redcoding.watermyplants.GardenDatabase

expect class DriverFactory {
    fun createDriver(): SqlDriver
}

fun createDatabase(driverFactory: DriverFactory) =
    GardenDatabase(driver = driverFactory.createDriver())

