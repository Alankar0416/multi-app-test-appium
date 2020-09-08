package tests.login

import layout.loginApp.SignInLayout
import org.junit.Test

class BasicAppTest : BaseLoginTest() {

    @Test
    fun `launch login app test`() {
        SignInLayout.verifyLayout(loginDriver)
    }

    @Test
    fun `launch login start test`() {
        SignInLayout.verifyLayout(loginDriver).setEmail("test@test.com").setPassword("password").tapSignIn()
        Thread.sleep(3000)
    }
}