package developer.abdusamid.viphotdog

import android.annotation.SuppressLint
import android.os.Bundle
import android.telephony.SmsManager
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        MyShared.init(this)
        val list = MyShared.list

        var a = 0
        plus2.setOnClickListener {
            text_count2.text = "${++a}"
            val price222 = 17000 * text_count2.text.toString().toInt()
            price2.text = "$price222 сум"
        }
        minus2.setOnClickListener {
            if (text_count2.text != "0") {
                text_count2.text = "${--a}"
                val price223 = 17000 * text_count2.text.toString().toInt()
                price2.text = "$price223 сум"
            }
            if (text_count2.text == "0") {
                price2.text = "17000 сум"
            }
        }

        save2.setOnClickListener {
            if (text_count2.text.toString() != "0") {
                list.add(
                    Food(
                        text_name2.text.toString(),
                        price2.text.toString(),
                        text_count2.text.toString().toInt()
                    )
                )
            }
            MyShared.list = list
            finish()
            list.removeAll(MyShared.list)

        }
    }
}