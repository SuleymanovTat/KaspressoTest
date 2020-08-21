import com.agoda.kakao.text.KButton
import com.agoda.kakao.text.KTextView
import com.example.testapp.NextActivity
import com.example.testapp.R
import com.kaspersky.kaspresso.screens.KScreen


object HomeFragmentScreen : KScreen<HomeFragmentScreen>() {

    override val layoutId: Int? = R.layout.fragment_home
    override val viewClass: Class<*>? = HomeFragmentScreen::class.java

    val texHome = KTextView { withId(R.id.text_home) }

}