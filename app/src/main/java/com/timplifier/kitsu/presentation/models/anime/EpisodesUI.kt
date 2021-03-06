package com.timplifier.kitsu.presentation.models.anime

import com.timplifier.kitsu.domain.models.anime.EpisodesModel

data class EpisodesUI(
    val links: LinksXXXXXXXXUI
)

fun EpisodesModel.toUI() = EpisodesUI(links.toUI())
