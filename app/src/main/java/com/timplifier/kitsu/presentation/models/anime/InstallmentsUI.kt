package com.timplifier.kitsu.presentation.models.anime

import com.timplifier.kitsu.domain.models.anime.InstallmentsModel

data class InstallmentsUI(
    val links: LinksXXXXUI
)

fun InstallmentsModel.toUI() = InstallmentsUI(links.toUI())
