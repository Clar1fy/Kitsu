package com.timplifier.kitsu.domain.useCases

import com.timplifier.kitsu.domain.repositories.AnimeRepository
import javax.inject.Inject

class FetchDetailedAnimeUseCase @Inject constructor(
    private val animeRepository: AnimeRepository
) {
    operator fun invoke(id: String) = animeRepository.fetchAnimeDetails(id)
}