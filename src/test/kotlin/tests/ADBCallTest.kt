package tests

import com.google.common.collect.ImmutableMap
import org.junit.Test
import tests.login.BaseLoginTest

class ADBCallTest : BaseLoginTest() {
    @Test
    fun `adb call test`() {
        val arg = "Hello"
        val commandMap = ImmutableMap.of(
            "command", "echo",
            "args", listOf("Hello")
        )
        val response = loginDriver.executeScript("mobile: shell", commandMap)
        assert(arg == response.toString().trim())
    }
}