import com.agoda.kakao.text.KButton
import com.agoda.kakao.text.KTextView
import com.example.testapp.NextActivity
import com.example.testapp.R
import com.kaspersky.kaspresso.screens.KScreen


object DashboardFragmentScreen : KScreen<DashboardFragmentScreen>() {

    override val layoutId: Int? = R.layout.fragment_dashboard
    override val viewClass: Class<*>? = DashboardFragmentScreen::class.java

    val btnClickCount = KButton { withId(R.id.btnClickCount) }

}