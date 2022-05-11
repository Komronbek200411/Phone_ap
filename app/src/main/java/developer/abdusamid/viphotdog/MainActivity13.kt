package developer.abdusamid.viphotdog

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telephony.SmsManager
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main13.*

class MainActivity13 : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main13)

        MyShared.init(this)
        val list = MyShared.list

        var a = 0
        plus13.setOnClickListener {
            text_count13.text = "${++a}"
            val price3333 = 13000 * text_count13.text.toString().toInt()
            price13.text = "$price3333 сум"
        }
        minus13.setOnClickListener {
            if (text_count13.text != "0") {
                text_count13.text = "${--a}"
                val price3334 = 13000 * text_count13.text.toString().toInt()
                price13.text = "$price3334 сум"
            }
            if (text_count13.text == "0") {
                price13.text = "13000 сум"
            }
        }

        save13.setOnClickListener {
            if (text_count13.text.toString() != "0") {
                list.add(
                    Food(
                        text_name13.text.toString(),
                        price13.text.toString(),
                        text_count13.text.toString().toInt()
                    )
                )
            }

            MyShared.list = list
            finish()
        }
    }
}