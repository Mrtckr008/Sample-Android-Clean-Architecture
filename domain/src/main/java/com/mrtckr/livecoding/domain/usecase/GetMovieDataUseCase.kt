package com.mrtckr.livecoding.domain.usecase

import com.mrtckr.livecoding.domain.entity.movie.MainMovieListWidget
import com.mrtckr.livecoding.domain.repository.MovieRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetMovieDataUseCase @Inject constructor(private val movieRepository: MovieRepository) {
    suspend operator fun invoke(): Flow<MainMovieListWidget> {
        return movieRepository.getMainMovieData()
    }
}
