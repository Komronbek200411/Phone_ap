package developer.abdusamid.viphotdog

import android.annotation.SuppressLint
import android.os.Bundle
import android.telephony.SmsManager
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main6.*

class MainActivity6 : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)

        MyShared.init(this)
        val list = MyShared.list

        var a = 0
        plus6.setOnClickListener {
            text_count6.text = "${++a}"
            val price666 = 19000 * text_count6.text.toString().toInt()
            price6.text = "$price666 сум"
        }
        minus6.setOnClickListener {
            if (text_count6.text != "0") {
                text_count6.text = "${--a}"
                val price667 = 19000 * text_count6.text.toString().toInt()
                price6.text = "$price667 сум"
            }
            if (text_count6.text == "0") {
                price6.text = "19000 сум"
            }
        }

        save6.setOnClickListener {
            if (text_count6.text.toString() != "0") {
                list.add(
                    Food(
                        text_name6.text.toString(),
                        price6.text.toString(),
                        text_count6.text.toString().toInt()
                    )
                )
            }
            MyShared.list = list
            finish()
        }
    }
}