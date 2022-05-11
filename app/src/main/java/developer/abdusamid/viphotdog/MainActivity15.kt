package developer.abdusamid.viphotdog

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telephony.SmsManager
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main15.*

class MainActivity15 : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main15)
        MyShared.init(this)
        val list = MyShared.list

        var a = 0
        plus15.setOnClickListener {
            text_count15.text = "${++a}"
            val price5555 = 10000 * text_count15.text.toString().toInt()
            price15.text = "$price5555 сум"
        }
        minus15.setOnClickListener {
            if (text_count15.text != "0") {
                text_count15.text = "${--a}"
                val price5556 = 10000 * text_count15.text.toString().toInt()
                price15.text = "$price5556 сум"
            }
            if (text_count15.text == "0") {
                price15.text = "10000 сум"
            }
        }

        save15.setOnClickListener {
            if (text_count15.text.toString() != "0") {
                list.add(
                    Food(
                        text_name15.text.toString(),
                        price15.text.toString(),
                        text_count15.text.toString().toInt()
                    )
                )
            }
            MyShared.list = list
            finish()
        }
    }
}