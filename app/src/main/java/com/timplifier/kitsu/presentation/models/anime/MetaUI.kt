package com.timplifier.kitsu.presentation.models.anime

import com.timplifier.kitsu.domain.models.anime.MetaModel

data class MetaUI(
    val dimensions: DimensionsUI
)

fun MetaModel.toUI() = MetaUI(
    dimensionsModel.toUI()
)