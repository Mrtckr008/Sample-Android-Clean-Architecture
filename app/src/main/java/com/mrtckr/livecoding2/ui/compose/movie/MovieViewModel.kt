package com.mrtckr.livecoding2.ui.compose.movie

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mrtckr.livecoding.domain.entity.movie.MainMovieListWidget
import com.mrtckr.livecoding.domain.usecase.GetMovieDataUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MovieViewModel @Inject constructor(private val getMovieDataUseCase: GetMovieDataUseCase): ViewModel() {

    private val _movieData: MutableStateFlow<MainMovieListWidget> = MutableStateFlow(
        MainMovieListWidget()
    )
    val movieData: StateFlow<MainMovieListWidget> = _movieData.asStateFlow()

    fun getMovieData() {
        viewModelScope.launch {
            val ss = getMovieDataUseCase.invoke()
            ss.collectLatest {

            }
        }
    }
}