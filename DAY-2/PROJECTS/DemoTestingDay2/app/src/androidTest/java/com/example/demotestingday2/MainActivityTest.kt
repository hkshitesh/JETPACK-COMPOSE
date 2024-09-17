package com.example.demotestingday2

import androidx.compose.ui.test.assertTextEquals
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performClick
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testIncrementButton()
    {
        composeTestRule.setContent {
            MyApp()
        }
        composeTestRule.onNodeWithTag("countText").assertTextEquals("Count : 0")
        composeTestRule.onNodeWithTag("incrementButton").performClick()
        composeTestRule.onNodeWithTag("countText").assertTextEquals("Count : 1")

    }
}