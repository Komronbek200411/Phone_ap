package developer.abdusamid.viphotdog

import android.annotation.SuppressLint
import android.os.Bundle
import android.telephony.SmsManager
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main8.*

class MainActivity8 : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main8)

        MyShared.init(this)
        val list = MyShared.list

        var a = 0
        plus8.setOnClickListener {
            text_count8.text = "${++a}"
            val price888 = 10000 * text_count8.text.toString().toInt()
            price8.text = "$price888 сум"
        }
        minus8.setOnClickListener {
            if (text_count8.text != "0") {
                text_count8.text = "${--a}"
                val price889 = 10000 * text_count8.text.toString().toInt()
                price8.text = "$price889 сум"
            }
            if (text_count8.text == "0") {
                price8.text = "10000 сум"
            }
        }

        save8.setOnClickListener {
            if (text_count8.text.toString() != "0") {
                list.add(
                    Food(
                        text_name8.text.toString(),
                        price8.text.toString(),
                        text_count8.text.toString().toInt()
                    )
                )
            }
            MyShared.list = list
            finish()
        }
    }
}