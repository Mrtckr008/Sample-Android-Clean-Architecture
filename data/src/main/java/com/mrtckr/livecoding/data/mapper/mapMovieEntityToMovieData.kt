package com.mrtckr.livecoding.data.mapper

import com.mrtckr.livecoding.data.model.movie.MainMovieListWidgetEntity
import com.mrtckr.livecoding.data.model.movie.MovieWidgetEntity
import com.mrtckr.livecoding.domain.entity.movie.MainMovieListWidget
import com.mrtckr.livecoding.domain.entity.movie.MovieWidget

fun MainMovieListWidgetEntity.toMainMovieListWidget(): MainMovieListWidget {
    return MainMovieListWidget(
        headerMovie = this.headerMovie.toMovieWidget(),
        popularMovieList = ArrayList(this.popularMovieList.map { it.toMovieWidget() })
    )
}

fun MovieWidgetEntity.toMovieWidget(): MovieWidget {
    return MovieWidget(
        id = this.id,
        imageUrl = this.imageUrl,
        title = this.title,
        titleUrl = this.titleUrl,
        name = this.name,
        genre = ArrayList(this.genre),
        addedToList = this.addedToList,
        progress = this.progress
    )
}
