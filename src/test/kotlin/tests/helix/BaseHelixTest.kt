package tests.helix

import io.appium.java_client.MobileElement
import io.appium.java_client.android.AndroidDriver
import orchestrator.HelixTestOrchestrator
import org.junit.After
import org.junit.Before

open class BaseHelixTest {

    lateinit var helixDriver: AndroidDriver<MobileElement>

    @Before
    fun setUp() {
        helixDriver = HelixTestOrchestrator.createDriver()
    }

    @After
    fun tearDown() = HelixTestOrchestrator.quitDriver()
}