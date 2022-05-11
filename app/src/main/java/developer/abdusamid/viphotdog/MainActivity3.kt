package developer.abdusamid.viphotdog

import android.annotation.SuppressLint
import android.os.Bundle
import android.telephony.SmsManager
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity3 : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        MyShared.init(this)
        val list = MyShared.list

        var a = 0
        plus3.setOnClickListener {
            text_count3.text = "${++a}"
            val price333 = 11000 * text_count3.text.toString().toInt()
            price3.text = "$price333 сум"
        }
        minus3.setOnClickListener {
            if (text_count3.text != "0") {
                text_count3.text = "${--a}"
                val price334 = 11000 * text_count3.text.toString().toInt()
                price3.text = "$price334 сум"
            }
            if (text_count3.text == "0") {
                price3.text = "11000 сум"
            }
        }

        save3.setOnClickListener {
            if (text_count3.text.toString() != "0") {
                list.add(
                    Food(
                        text_name3.text.toString(),
                        price3.text.toString(),
                        text_count3.text.toString().toInt()
                    )
                )
            }

            MyShared.list = list
            finish()
        }
    }
}