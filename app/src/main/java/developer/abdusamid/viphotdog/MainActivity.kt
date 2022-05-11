package developer.abdusamid.viphotdog

import android.annotation.SuppressLint
import android.os.Bundle
import android.telephony.SmsManager
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MyShared.init(this)
        val list = MyShared.list

        var a = 0
        plus1.setOnClickListener {
            text_count1.text = "${++a}"
            val price111 = 11000 * text_count1.text.toString().toInt()
            price1.text = "$price111 сум"
        }
        minus1.setOnClickListener {
            if (text_count1.text != "0") {
                text_count1.text = "${--a}"
                val price112 = 11000 * text_count1.text.toString().toInt()
                price1.text = "$price112 сум"
            }
            if (text_count1.text == "0") {
                price1.text = "11000 сум"
            }
        }

        save1.setOnClickListener {
            if (text_count1.text.toString() == "0") {
                list.add(
                    Food(
                        text_name1.text.toString(),
                        price1.text.toString(),
                        text_count1.text.toString().toInt()
                    )
                )
            }
           finish()
        }
    }
}