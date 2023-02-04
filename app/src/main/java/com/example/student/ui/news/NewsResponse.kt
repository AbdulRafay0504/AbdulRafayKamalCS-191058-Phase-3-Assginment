package com.example.student.ui.news

import com.example.student.ui.news.News
import com.google.gson.annotations.SerializedName


data class NewsResponse(
    @SerializedName("status")
    val status: String,
    @SerializedName("totalResults")
    val totalResults: Int,
    @SerializedName("articles")
    val newsList: List<News>
    ) {
}