package com.example.analytics

data class AnalyticsEvent(
    val eventName: String,
    val params: Map<String, String>? = null
)