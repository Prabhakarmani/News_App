package Prabhakar.Mani.newsapp.models


import Prabhakar.Mani.newsapp.models.Article

data class NewsResponse(
    val articles: MutableList<Article>,
    val status: String,
    val totalResults: Int
)