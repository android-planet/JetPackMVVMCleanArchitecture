package com.medisage.smart_mr.domain.repository

import androidx.paging.PagingData
import com.medisage.smart_mr.domain.model.Article
import kotlinx.coroutines.flow.Flow
import retrofit2.http.Query

interface NewsRepository {

    fun getNews(source: List<String>): Flow<PagingData<Article>>

    fun searchNews(searchQuery: String,source: List<String>): Flow<PagingData<Article>>
}