package developer.abdusamid.viphotdog

import android.annotation.SuppressLint
import android.os.Bundle
import android.telephony.SmsManager
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main10.*

class MainActivity10 : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main10)

        MyShared.init(this)
        val list = MyShared.list

        var a = 0
        plus10.setOnClickListener {
            text_count10.text = "${++a}"
            val price1000 = 4000 * text_count10.text.toString().toInt()
            price10.text = "$price1000 сум"
        }
        minus10.setOnClickListener {
            if (text_count10.text != "0") {
                text_count10.text = "${--a}"
                val price1001 = 4000 * text_count10.text.toString().toInt()
                price10.text = "$price1001 сум"
            }
            if (text_count10.text == "0") {
                price10.text = "4000 сум"
            }
        }

        save10.setOnClickListener {
            if (text_count10.text.toString() != "0") {
                list.add(
                    Food(
                        text_name10.text.toString(),
                        price10.text.toString(),
                        text_count10.text.toString().toInt()
                    )
                )
            }
            MyShared.list = list
            finish()
        }
    }
}