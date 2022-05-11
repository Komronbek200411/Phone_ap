package developer.abdusamid.viphotdog

import android.annotation.SuppressLint
import android.os.Bundle
import android.telephony.SmsManager
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main9.*

class MainActivity9 : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main9)

        MyShared.init(this)
        val list = MyShared.list

        var a = 0
        plus9.setOnClickListener {
            text_count9.text = "${++a}"
            val price999 = 10000 * text_count9.text.toString().toInt()
            price9.text = "$price999 сум"
        }
        minus9.setOnClickListener {
            if (text_count9.text != "0") {
                text_count9.text = "${--a}"
                val price990 = 10000 * text_count9.text.toString().toInt()
                price9.text = "$price990 сум"
            }
            if (text_count9.text == "0") {
                price9.text = "10000 сум"
            }
        }

        save9.setOnClickListener {
            if (text_count9.text.toString() != "0") {
                list.add(
                    Food(
                        text_name9.text.toString(),
                        price9.text.toString(),
                        text_count9.text.toString().toInt()
                    )
                )
            }
            MyShared.list = list
            finish()
        }
    }
}