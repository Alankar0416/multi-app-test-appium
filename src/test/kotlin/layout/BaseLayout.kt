package layout

import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.pagefactory.AppiumFieldDecorator
import org.openqa.selenium.support.PageFactory

open class BaseLayout(val driver : AndroidDriver<*>) {

    init {
        PageFactory.initElements(AppiumFieldDecorator(driver),this)
    }
}