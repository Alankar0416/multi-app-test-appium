package tests

import layout.loginApp.SignInLayout
import io.appium.java_client.MobileElement
import io.appium.java_client.android.AndroidDriver
import orchestrator.LoginTestOrchestrator
import orchestrator.HelixTestOrchestrator
import org.junit.After
import org.junit.Before
import org.junit.Test

class OrchestrationTest {

    private lateinit var helixDriver: AndroidDriver<MobileElement>
    private lateinit var carbonDriver: AndroidDriver<MobileElement>

    @Before
    fun setUp() {
        carbonDriver = LoginTestOrchestrator.createDriver()
        helixDriver = HelixTestOrchestrator.createDriver()
    }

    @Test
    fun `app launch and login start test`() {
        val carbonLaunchLayout = SignInLayout.verifyLayout(carbonDriver)

        val helixLaunchLayout = layout.helix.LaunchLayout.verifyLayout(helixDriver)

        //carbonLaunchLayout.tapSignIn().loginWith("test", "test_pwd")

        helixLaunchLayout.clickMobile()
    }


    @After
    fun tearDown() {
        LoginTestOrchestrator.quitDriver()
        HelixTestOrchestrator.quitDriver()
    }
}