package com.medisage.smart_mr.presentation.navgraph

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import androidx.navigation.compose.rememberNavController
import androidx.paging.compose.collectAsLazyPagingItems
import com.medisage.smart_mr.presentation.home.HomeScreen
import com.medisage.smart_mr.presentation.home.HomeViewModel
import com.medisage.smart_mr.presentation.onboardinng.OnBoardingScreen
import com.medisage.smart_mr.presentation.onboardinng.OnBoardingViewModel
import com.medisage.smart_mr.presentation.search.SearchScreen
import com.medisage.smart_mr.presentation.search.SearchViewModel

@ExperimentalFoundationApi
@Composable
fun NavGraph(
    startDestination: String
){

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = startDestination) {
        navigation(
            route = Route.AppStartNavigation.route,
            startDestination = Route.OnBoardingScreen.route
        ){
            composable(
                route = Route.OnBoardingScreen.route
            ){
                val viewModel: OnBoardingViewModel = hiltViewModel()
                OnBoardingScreen(
                    event = viewModel::onEvent
                )
            }
        }

        navigation(
            route = Route.NewsNavigation.route,
            startDestination = Route.NewsNavigatorScreen.route
        ){
            composable(
                route = Route.NewsNavigatorScreen.route
            ){
                val viewModel : HomeViewModel = hiltViewModel()
                val article = viewModel.news.collectAsLazyPagingItems()
                HomeScreen(article = article , navigate = {})

               /*val viewModel : SearchViewModel = hiltViewModel()
                SearchScreen(state = viewModel.state.value, event = viewModel::onEvent, navigate = {})*/
            }
        }
    }
}