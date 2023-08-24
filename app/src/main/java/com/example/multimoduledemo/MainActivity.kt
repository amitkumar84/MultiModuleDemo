package com.example.multimoduledemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.analytics.AnalyticsEvent
import com.example.analytics.StubAnalyticsHelper
import com.example.multimoduledemo.ui.theme.MultiModuleDemoTheme

class MainActivity : ComponentActivity() {

    private val stubAnalyticsHelper = StubAnalyticsHelper()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MultiModuleDemoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Button(
                        onClick = {
                            stubAnalyticsHelper.logEvent(
                                AnalyticsEvent(
                                    "ClickMeClicked",
                                    params = emptyMap<String, String>()
                                )
                            )
                        },
                        modifier = Modifier.wrapContentSize(align = Alignment.Center)
                    ) {
                        Text(text = "Click Me")
                    }
                }
            }
        }
    }
}
