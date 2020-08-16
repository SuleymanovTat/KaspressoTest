import android.view.View
import com.agoda.kakao.bottomnav.KBottomNavigationView
import com.agoda.kakao.common.views.KView
import com.agoda.kakao.edit.KEditText
import com.agoda.kakao.navigation.KNavigationView
import com.agoda.kakao.text.KButton
import com.example.testapp.BottomNavigationActivity
import com.example.testapp.MainActivity
import com.example.testapp.NextActivity
import com.example.testapp.R
import com.kaspersky.kaspresso.screens.KScreen
import java.util.regex.Matcher


object BottomNavigationScreen : KScreen<BottomNavigationScreen>() {

    override val layoutId: Int? = R.layout.activity_bottom_navigation
    override val viewClass: Class<*>? = BottomNavigationActivity::class.java

    //BottomNavigationView
    val mBottomNavigationView = KBottomNavigationView { withId(R.id.navView) }
}