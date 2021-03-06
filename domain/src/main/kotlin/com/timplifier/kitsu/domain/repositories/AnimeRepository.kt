package com.timplifier.kitsu.domain.repositories

import com.timplifier.kitsu.domain.either.Either
import com.timplifier.kitsu.domain.models.anime.SingleAnimeModel
import com.timplifier.kitsu.domain.models.anime.genres.AnimeGenresModel
import kotlinx.coroutines.flow.Flow

interface AnimeRepository {
    fun fetchAnimeDetails(id: String): Flow<Either<String, SingleAnimeModel>>
    fun fetchAnimeGenres(id: String): Flow<Either<String, AnimeGenresModel>>
}