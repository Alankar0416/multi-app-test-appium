package orchestrator

import io.appium.java_client.remote.MobileCapabilityType
import org.openqa.selenium.remote.DesiredCapabilities

object LoginTestOrchestrator : AndroidTestOrchestrator(){

    private const val targetPlatformVersion = "10"

    override fun getCapabilities(): DesiredCapabilities {
        val capabilities = super.getCapabilities()
        val apk = "/Users/alankar/personal_projects/multi-app-test-appium/apks/login-app-debug.apk"
        capabilities.setCapability(MobileCapabilityType.APP, apk)
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, targetPlatformVersion)
        return capabilities
    }
}