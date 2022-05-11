package developer.abdusamid.viphotdog

import android.annotation.SuppressLint
import android.os.Bundle
import android.telephony.SmsManager
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main7.*

class MainActivity7 : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7)

        MyShared.init(this)
        val list = MyShared.list

        var a = 0
        plus7.setOnClickListener {
            text_count7.text = "${++a}"
            val price777 = 17000 * text_count7.text.toString().toInt()
            price7.text = "$price777 сум"
        }
        minus7.setOnClickListener {
            if (text_count7.text != "0") {
                text_count7.text = "${--a}"
                val price778 = 17000 * text_count7.text.toString().toInt()
                price7.text = "$price778 сум"
            }
            if (text_count7.text == "0") {
                price7.text = "17000 сум"
            }
        }

        save7.setOnClickListener {
            if (text_count7.text.toString() != "0") {
                list.add(
                    Food(
                        text_name7.text.toString(),
                        price7.text.toString(),
                        text_count7.text.toString().toInt()
                    )
                )
            }

            Toast.makeText(this, "SMS Jonatildi", Toast.LENGTH_SHORT).show()

            MyShared.list = list
            finish()
        }
    }
}