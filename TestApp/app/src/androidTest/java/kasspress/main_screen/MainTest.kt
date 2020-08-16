import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.test.rule.ActivityTestRule
import com.example.testapp.MainActivity
import com.example.testapp.ui.dashboard.DashboardFragment
import com.example.testapp.ui.home.HomeFragment
import com.example.testapp.ui.notifications.NotificationsFragment
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import org.junit.Rule
import org.junit.Test

class MainTest : TestCase() {

    private lateinit var homeFragment: HomeFragment
    private lateinit var dashboardFragment: DashboardFragment
    private lateinit var hotificationsFragment: NotificationsFragment

    @get:Rule
    val activityTestRule = ActivityTestRule(MainActivity::class.java, true, false)

    @Test
    fun test() =
            run {
                step("Open Main Screen") {
                    testLogger.i("I am testLogger")
                    activityTestRule.launchActivity(null)
                    device.screenshots.take("Additional_screenshot")
                    MainScreen {
                        editText {
                            replaceText("Kaspresso")
                            hasText("Kaspresso")
                        }
                        buttonSend {
                            isVisible()
                            click()
                        }
                    }
                }

                step("Click NextScreen") {
                    NextScreen {
                        textView {
                            isVisible()
                            click()
                        }
                    }
                }

                step("Click BottomNavigationScreen") {
                    BottomNavigationScreen {
//                        activityTestRule.
//                        val factory = HomeFragment()
//                        val scenario = launchFragmentInContainer<HomeFragment>(
//                                null, factory)
                    }
                }
            }
}