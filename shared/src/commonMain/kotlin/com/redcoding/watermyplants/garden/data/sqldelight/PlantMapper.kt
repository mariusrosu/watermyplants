package com.redcoding.watermyplants.garden.data.sqldelight

import com.redcoding.watermyplants.PlantEntity
import com.redcoding.watermyplants.garden.domain.Plant

internal fun PlantEntity.toDomain() = Plant(id = id, name = name)

internal fun List<PlantEntity>.toDomain() = map(PlantEntity::toDomain)
