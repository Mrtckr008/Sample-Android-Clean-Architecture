package com.mrtckr.livecoding.domain.repository

import com.mrtckr.livecoding.domain.entity.movie.MainMovieListWidget
import kotlinx.coroutines.flow.Flow

interface MovieRepository {
    suspend fun getMainMovieData(): Flow<MainMovieListWidget>
    //suspend fun getMovieDetail(movieId: String): MovieDetail
}