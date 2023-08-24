package com.example.analytics

class StubAnalyticsHelper : AnalyticsHelper {
    override fun logEvent(event: AnalyticsEvent) {
        println("Event Logged to Third Party Library with name "+event.eventName)
    }
}