package com.medisage.smart_mr.presentation.home

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.basicMarquee
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.remember
import androidx.paging.compose.LazyPagingItems
import com.medisage.smart_mr.domain.model.Article
import com.medisage.smart_mr.presentation.navgraph.Route
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.medisage.smart_mr.R
import com.medisage.smart_mr.presentation.common.ArticleList
import com.medisage.smart_mr.presentation.common.SearchBar
import com.medisage.smart_mr.presentation.onboardinng.Dimens.MediumPadding1

@ExperimentalFoundationApi
@Composable
fun HomeScreen(
    article: LazyPagingItems<Article>,
               navigate: (String)-> Unit)
{
    val title by remember {
        derivedStateOf {
            if (article.itemCount> 10){
                article.itemSnapshotList.items
                    .slice(IntRange(start = 0, endInclusive = 9))
                    .joinToString(separator = "\uD83d\uDEF5 "){it.title}
            }else{
                ""
            }
        }
    }

    Column(modifier = Modifier
        .fillMaxSize()
        .padding(top = MediumPadding1)
        .statusBarsPadding()) {
        Image(painter = painterResource(id = R.drawable.baseline_add_call_24), contentDescription =null,
            modifier = Modifier
                .width(150.dp)
                .height(30.dp)
                .padding(horizontal = MediumPadding1)
        )
        
        Spacer(modifier = Modifier.height(MediumPadding1))
        
        SearchBar(
            modifier = Modifier.padding(horizontal = MediumPadding1),
            text = "",
            readOnly = true,
            onValueChange = {},
            onClick = {
                 navigate(Route.SearchScreen.route)
            },
            onSearch = {}
        )
        
        Spacer(modifier = Modifier.height(MediumPadding1))
        
        Text(text = title, modifier = Modifier
            .fillMaxWidth()
            .padding(start = MediumPadding1)
            .basicMarquee(),
            fontSize = 12.sp,
            color = colorResource(id = R.color.placeholder)
        )

        Spacer(modifier = Modifier.height(MediumPadding1))
        
        ArticleList(
            modifier = Modifier.padding(horizontal = MediumPadding1),
            articles = article,
            onClick = {
                navigate(Route.DetailsScreen.route)
            }
        )
    }
}