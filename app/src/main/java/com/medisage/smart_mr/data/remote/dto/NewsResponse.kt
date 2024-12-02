package com.medisage.smart_mr.data.remote.dto

import com.medisage.smart_mr.domain.model.Article

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)