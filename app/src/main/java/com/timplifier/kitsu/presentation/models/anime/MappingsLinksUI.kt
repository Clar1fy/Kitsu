package com.timplifier.kitsu.presentation.models.anime

import com.timplifier.kitsu.domain.models.anime.LinksXXXXXModel

data class LinksXXXXXUI(
    val self: String,
    val related: String
)

fun LinksXXXXXModel.toUI() = LinksXXXXXUI(self, related)
