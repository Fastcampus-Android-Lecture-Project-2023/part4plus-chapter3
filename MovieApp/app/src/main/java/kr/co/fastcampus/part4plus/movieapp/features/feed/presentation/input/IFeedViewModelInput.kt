package kr.co.fastcampus.part4plus.movieapp.features.feed.presentation.input

interface IFeedViewModelInput {
    fun openDetail(movieName: String)
    fun openInfoDialog()
    fun refreshFeed()
}
