package com.medisage.smart_mr.domain.usecases.news

import androidx.paging.PagingData
import com.medisage.smart_mr.domain.model.Article
import com.medisage.smart_mr.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow


class GetNews(
    private val newsRepository: NewsRepository
) {
    operator fun invoke(sources: List<String>): Flow<PagingData<Article>> {
        return newsRepository.getNews(source = sources)
    }
}