import com.agoda.kakao.bottomnav.KBottomNavigationView
import com.agoda.kakao.text.KButton
import com.agoda.kakao.text.KTextView
import com.example.testapp.BottomNavigationActivity
import com.example.testapp.R
import com.kaspersky.kaspresso.screens.KScreen


object BottomNavigationScreen : KScreen<BottomNavigationScreen>() {

    override val layoutId: Int? = R.layout.activity_bottom_navigation
    override val viewClass: Class<*>? = BottomNavigationActivity::class.java

    //BottomNavigationView
    val mBottomNavigationView = KBottomNavigationView { withId(R.id.navView) }
    val click = KButton { withId(R.id.click) }

}