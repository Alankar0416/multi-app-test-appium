package layout.loginApp

import layout.BaseLayout
import io.appium.java_client.android.AndroidDriver
import helper.waitUntilVisible

class SignInLayout(driver: AndroidDriver<*>) : BaseLayout(driver) {

    companion object {
        fun verifyLayout(driver: AndroidDriver<*>): SignInLayout {
            driver.waitUntilVisible("username")
            return SignInLayout(driver)
        }
    }

    fun setEmail(email: String): SignInLayout {
        driver.waitUntilVisible("username")
        driver.findElementById("username").sendKeys(email)
        return this
    }

    fun setPassword(password: String): SignInLayout {
        driver.waitUntilVisible("password")
        driver.findElementById("password").sendKeys(password)
        return this
    }

    fun tapSignIn(): SignInLayout {
        driver.findElementById("login").click()
        return this
    }
}