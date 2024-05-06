package com.mrtckr.livecoding.domain.entity.movie

data class MovieWidget(
    val id: String,
    val imageUrl: String,
    val title: String,
    val titleUrl: String,
    val name: String,
    val genre: ArrayList<String>,
    val addedToList: Boolean,
    val progress: Float
)
