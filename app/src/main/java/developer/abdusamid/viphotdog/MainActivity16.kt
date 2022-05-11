package developer.abdusamid.viphotdog

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telephony.SmsManager
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main16.*

class MainActivity16 : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main16)
        MyShared.init(this)
        val list = MyShared.list

        var a = 0
        plus16.setOnClickListener {
            text_count16.text = "${++a}"
            val price6666 = 13000 * text_count16.text.toString().toInt()
            price16.text = "$price6666 сум"
        }
        minus16.setOnClickListener {
            if (text_count16.text != "0") {
                text_count16.text = "${--a}"
                val price6667 = 13000 * text_count16.text.toString().toInt()
                price16.text = "$price6667 сум"
            }
            if (text_count16.text == "0") {
                price16.text = "13000 сум"
            }
        }

        save16.setOnClickListener {
            if (text_count16.text.toString() != "0") {
                list.add(
                    Food(
                        text_name16.text.toString(),
                        price16.text.toString(),
                        text_count16.text.toString().toInt()
                    )
                )
            }
            MyShared.list = list
            finish()
        }
    }
}