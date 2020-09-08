package orchestrator

import io.appium.java_client.MobileElement
import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.remote.MobileCapabilityType
import org.openqa.selenium.remote.DesiredCapabilities
import java.net.URL
import java.util.concurrent.TimeUnit

abstract class AndroidTestOrchestrator {

    private lateinit var driver: AndroidDriver<MobileElement>

    companion object {
        private const val CAPABILITY_AUTO_GRANT_PERMISSION = "autoGrantPermissions"
    }

    open fun getCapabilities(): DesiredCapabilities = DesiredCapabilities().apply {
        setCapability(MobileCapabilityType.PLATFORM_NAME, "Android")
        setCapability(MobileCapabilityType.DEVICE_NAME, "Android")
        setCapability(CAPABILITY_AUTO_GRANT_PERMISSION, true)
    }

    fun createDriver(): AndroidDriver<MobileElement> =
        AndroidDriver<MobileElement>(URL("http://127.0.0.1:4723/wd/hub"), getCapabilities()).also {
            driver = it
            it.manage()?.timeouts()?.implicitlyWait(30, TimeUnit.SECONDS)
        }

    fun quitDriver() = driver.quit()


}