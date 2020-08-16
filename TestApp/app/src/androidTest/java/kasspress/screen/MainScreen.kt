
import com.agoda.kakao.edit.KEditText
import com.agoda.kakao.text.KButton
import com.example.testapp.MainActivity
import com.example.testapp.R
import com.kaspersky.kaspresso.screens.KScreen


object MainScreen : KScreen<MainScreen>() {

    override val layoutId: Int? = R.layout.activity_main
    override val viewClass: Class<*>? = MainActivity::class.java

    val buttonSend = KButton { withId(R.id.buttonSend) }
    val editText = KEditText { withId(R.id.editText) }
}