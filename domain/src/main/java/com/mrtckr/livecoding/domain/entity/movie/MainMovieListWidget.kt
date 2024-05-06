package com.mrtckr.livecoding.domain.entity.movie

data class MainMovieListWidget(
    val headerMovie: MovieWidget,
    val popularMovieList: ArrayList<MovieWidget>
)
