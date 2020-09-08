package orchestrator

import io.appium.java_client.remote.MobileCapabilityType
import orchestrator.AndroidTestOrchestrator
import org.openqa.selenium.remote.DesiredCapabilities

object HelixTestOrchestrator : AndroidTestOrchestrator(){

    private const val targetPlatformVersion = "11"

    override fun getCapabilities(): DesiredCapabilities {
        val capabilities = super.getCapabilities()
        val helixApk = "/Users/alankar/personal_projects/appium_poc/apks/helix_dual-android-v4.334.409.apk"
        capabilities.setCapability(MobileCapabilityType.APP, helixApk)
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, targetPlatformVersion)
        return capabilities
    }
}