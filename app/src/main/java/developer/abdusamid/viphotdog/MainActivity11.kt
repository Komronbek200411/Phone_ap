package developer.abdusamid.viphotdog

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telephony.SmsManager
import kotlinx.android.synthetic.main.activity_main11.*

class MainActivity11 : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main11)

        MyShared.init(this)
        val list = MyShared.list

        var a = 0
        plus11.setOnClickListener {
            text_count11.text = "${++a}"
            val price1111 = 6000 * text_count11.text.toString().toInt()
            price11.text = "$price1111 сум"
        }
        minus11.setOnClickListener {
            if (text_count11.text != "0") {
                text_count11.text = "${--a}"
                val price1112 = 6000 * text_count11.text.toString().toInt()
                price11.text = "$price1112 сум"
            }
            if (text_count11.text == "0") {
                price11.text = "6000 сум"
            }
        }

        save11.setOnClickListener {
            if (text_count11.text.toString() != "0") {
                list.add(
                    Food(
                        text_name11.text.toString(),
                        price11.text.toString(),
                        text_count11.text.toString().toInt()
                    )
                )
            }
            MyShared.list = list
            finish()
        }
    }
}