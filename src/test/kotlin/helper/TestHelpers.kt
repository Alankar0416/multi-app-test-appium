package helper

import io.appium.java_client.android.AndroidDriver
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait


fun AndroidDriver<*>.waitUntilVisible(targetResourceId: String): Boolean {
    return waitUntilVisible(
        this,
        DEFAULT_WAIT_TIME_FOR_VISIBLE_IN_SEC,
        targetResourceId
    )
}

fun AndroidDriver<*>.waitUntilNotVisible(targetResourceId: String): Boolean {
    return waitUntilNotVisible(
        this,
        DEFAULT_WAIT_TIME_FOR_VISIBLE_IN_SEC,
        targetResourceId
    )
}

fun waitUntilVisible(driver: AndroidDriver<*>, timeLimitInSeconds: Int, targetResourceId: String): Boolean {
    return try {
        val mobileElement = driver.findElementById(targetResourceId)
        val wait = WebDriverWait(driver, timeLimitInSeconds.toLong())
        wait.until(ExpectedConditions.visibilityOf(mobileElement))
        val isElementPresent = mobileElement.isDisplayed()
        isElementPresent
    } catch (e: Exception) {
        val isElementPresent = false
        println(e.message)
        isElementPresent
    }
}

fun waitUntilNotVisible(driver: AndroidDriver<*>, timeLimitInSeconds: Int, targetResourceId: String): Boolean {
    return try {
        val wait = WebDriverWait(driver, timeLimitInSeconds.toLong())
        wait.until(ExpectedConditions.invisibilityOf(driver.findElementById(targetResourceId)))
        true
    } catch (e: Exception) {
        val isElementPresent = false
        println(e.message)
        isElementPresent
    }
}

const val DEFAULT_WAIT_TIME_FOR_VISIBLE_IN_SEC = 30