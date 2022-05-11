package developer.abdusamid.viphotdog

import android.annotation.SuppressLint
import android.os.Bundle
import android.telephony.SmsManager
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main5.*

class MainActivity5 : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        MyShared.init(this)
        val list = MyShared.list

        var a = 0
        plus5.setOnClickListener {
            text_count5.text = "${++a}"
            val price555 = 12000 * text_count5.text.toString().toInt()
            price5.text = "$price555 сум"
        }
        minus5.setOnClickListener {
            if (text_count5.text != "0") {
                text_count5.text = "${--a}"
                val price556 = 12000 * text_count5.text.toString().toInt()
                price5.text = "$price556 сум"
            }
            if (text_count5.text == "0") {
                price5.text = "12000 сум"
            }
        }

        save5.setOnClickListener {
            if (text_count5.text.toString() != "0") {
                list.add(
                    Food(
                        text_name5.text.toString(),
                        price5.text.toString(),
                        text_count5.text.toString().toInt()
                    )
                )
            }

            MyShared.list = list
            finish()
        }
    }
}