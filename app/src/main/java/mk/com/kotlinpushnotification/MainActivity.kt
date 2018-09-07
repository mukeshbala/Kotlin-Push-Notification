package mk.com.kotlinpushnotification

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.firebase.iid.FirebaseInstanceId
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    internal var deviceToken: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        deviceToken = FirebaseInstanceId.getInstance().token
        val token = FirebaseInstanceId.getInstance().token

        Log.e("deviceToken", deviceToken)

        val bundle = intent.extras
        if (bundle != null) {
            Log.e("msg", bundle.toString())
            txt_title.text = "Title -:" + bundle.getString("title")
            txt_title.text = "Body -:" + bundle.getString("body")
        }

        btn_click.setOnClickListener {

            sendPushNotification();
        }
    }

    private fun sendPushNotification() {


    }
}
