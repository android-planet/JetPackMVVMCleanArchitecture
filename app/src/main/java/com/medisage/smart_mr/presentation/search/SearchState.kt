package com.medisage.smart_mr.presentation.search
import androidx.paging.PagingData
import com.medisage.smart_mr.domain.model.Article
import kotlinx.coroutines.flow.Flow

data class SearchState(
    val searchQuery: String = "",
    val articles: Flow<PagingData<Article>>? = null
)
