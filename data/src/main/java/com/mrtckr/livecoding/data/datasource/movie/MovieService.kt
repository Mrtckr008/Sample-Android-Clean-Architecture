package com.mrtckr.livecoding.data.datasource.movie

import com.mrtckr.livecoding.data.model.movie.MainMovieListWidgetEntity
import kotlinx.coroutines.flow.Flow

interface MovieService {
    suspend fun getMovieData(): MainMovieListWidgetEntity
}
