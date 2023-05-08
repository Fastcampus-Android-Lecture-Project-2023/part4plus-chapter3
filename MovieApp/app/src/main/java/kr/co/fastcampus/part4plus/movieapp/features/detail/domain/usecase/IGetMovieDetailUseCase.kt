package kr.co.fastcampus.part4plus.movieapp.features.detail.domain.usecase

import kr.co.fastcampus.part4plus.movieapp.features.common.entity.MovieDetailEntity

interface IGetMovieDetailUseCase {
    suspend operator fun invoke(name: String): MovieDetailEntity
}
