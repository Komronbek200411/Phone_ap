package developer.abdusamid.viphotdog

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telephony.SmsManager
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main12.*

class MainActivity12 : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main12)

        MyShared.init(this)
        val list = MyShared.list

        var a = 0
        plus12.setOnClickListener {
            text_count12.text = "${++a}"
            val price2222 = 10000 * text_count12.text.toString().toInt()
            price12.text = "$price2222 сум"
        }
        minus12.setOnClickListener {
            if (text_count12.text != "0") {
                text_count12.text = "${--a}"
                val price2223 = 10000 * text_count12.text.toString().toInt()
                price12.text = "$price2223 сум"
            }
            if (text_count12.text == "0") {
                price12.text = "10000 сум"
            }
        }

        save12.setOnClickListener {
            if (text_count12.text.toString() != "0") {
                list.add(
                    Food(
                        text_name12.text.toString(),
                        price12.text.toString(),
                        text_count12.text.toString().toInt()
                    )
                )
            }

            MyShared.list = list
            finish()
        }
    }
}