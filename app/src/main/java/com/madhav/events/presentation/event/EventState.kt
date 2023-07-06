package com.madhav.events.presentation.event

data class EventState(
    val isLoading: Boolean = false,
    val data: List<Any>? = null,
    val error: String = ""
)