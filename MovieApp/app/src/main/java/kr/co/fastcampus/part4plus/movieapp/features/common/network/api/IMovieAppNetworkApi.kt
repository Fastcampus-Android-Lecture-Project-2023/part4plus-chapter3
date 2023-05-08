package kr.co.fastcampus.part4plus.movieapp.features.common.network.api

import kr.co.fastcampus.part4plus.movieapp.features.common.network.model.MovieResponse
import kr.co.fastcampus.part4plus.movieapp.library.network.model.ApiResult

interface IMovieAppNetworkApi {
    suspend fun getMovies(): ApiResult<List<MovieResponse>>
}
