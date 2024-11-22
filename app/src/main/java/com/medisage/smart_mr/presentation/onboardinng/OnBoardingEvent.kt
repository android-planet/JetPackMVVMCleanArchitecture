package com.medisage.smart_mr.presentation.onboardinng

sealed class OnBoardingEvent {
    object SaveAppEntry : OnBoardingEvent()
}