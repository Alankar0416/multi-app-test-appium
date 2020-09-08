package tests.login

import io.appium.java_client.MobileElement
import io.appium.java_client.android.AndroidDriver
import orchestrator.LoginTestOrchestrator
import org.junit.After
import org.junit.Before

open class BaseLoginTest {

    lateinit var loginDriver: AndroidDriver<MobileElement>

    @Before
    fun setUp() {
        loginDriver = LoginTestOrchestrator.createDriver()
    }

    @After
    fun tearDown() = LoginTestOrchestrator.quitDriver()
}