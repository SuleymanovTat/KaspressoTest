
import com.agoda.kakao.edit.KEditText
import com.agoda.kakao.text.KButton
import com.example.testapp.MainActivity
import com.example.testapp.NextActivity
import com.example.testapp.R
import com.kaspersky.kaspresso.screens.KScreen


object NextScreen : KScreen<NextScreen>() {

    override val layoutId: Int? = R.layout.activity_next
    override val viewClass: Class<*>? = NextActivity::class.java

    val textView = KButton { withId(R.id.textView) }
}