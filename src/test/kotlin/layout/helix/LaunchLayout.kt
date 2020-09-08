package layout.helix

import layout.BaseLayout
import io.appium.java_client.android.AndroidDriver
import helper.waitUntilNotVisible
import helper.waitUntilVisible

class LaunchLayout(driver: AndroidDriver<*>) : BaseLayout(driver) {

    companion object {
        fun verifyLayout(driver: AndroidDriver<*>): LaunchLayout {
            driver.waitUntilVisible("main_scene")
            return LaunchLayout(driver)
        }
    }

    fun clickMobile(): LaunchLayout {
        driver.findElementById("main_scene").click()
        return this
    }
}