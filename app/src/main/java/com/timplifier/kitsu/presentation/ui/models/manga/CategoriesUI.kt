package com.timplifier.kitsu.presentation.ui.models.manga

import com.timplifier.kitsu.domain.models.manga.CategoriesModel

data class CategoriesUI(
    val links: LinksXXUI
)

fun CategoriesModel.toUI() = CategoriesUI(links.toUI())