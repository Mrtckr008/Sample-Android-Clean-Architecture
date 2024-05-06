package com.mrtckr.livecoding.data

import com.mrtckr.common.network.AppDispatchers
import com.mrtckr.common.network.Dispatcher
import com.mrtckr.livecoding.data.datasource.movie.MovieService
import com.mrtckr.livecoding.data.mapper.toMainMovieListWidget
import com.mrtckr.livecoding.domain.entity.movie.MainMovieListWidget
import com.mrtckr.livecoding.domain.repository.MovieRepository
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class MovieDataSourceImpl @Inject constructor(
    private val movieService: MovieService,
    @Dispatcher(AppDispatchers.IO) private val ioDispatcher: CoroutineDispatcher,
): MovieRepository {

    override suspend fun getMainMovieData(): Flow<MainMovieListWidget> = flow {
        emit(
            movieService.getMovieData().toMainMovieListWidget()
        )
    }.flowOn(ioDispatcher)
}
