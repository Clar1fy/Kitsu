package com.timplifier.kitsu.presentation.models.manga

import com.timplifier.kitsu.domain.models.manga.MangaStaffModel

data class MangaStaffUI(
    val links: LinksXXXXXXXXXXUI
)

fun MangaStaffModel.toUI() = MangaStaffUI(links.toUI())
