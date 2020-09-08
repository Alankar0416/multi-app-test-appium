package tests.helix

import layout.helix.LaunchLayout
import org.junit.Test

class BasicAppTest : BaseHelixTest() {

    @Test
    fun `launch helix app test`() {
        LaunchLayout.verifyLayout(helixDriver)
    }

    @Test
    fun `helix login start test`() {
        LaunchLayout.verifyLayout(helixDriver).clickMobile()
    }
}