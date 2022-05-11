package developer.abdusamid.viphotdog

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telephony.SmsManager
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main14.*

class MainActivity14 : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main14)
        MyShared.init(this)
        val list = MyShared.list

        var a = 0
        plus14.setOnClickListener {
            text_count14.text = "${++a}"
            val price4444 = 6000 * text_count14.text.toString().toInt()
            price14.text = "$price4444 сум"
        }
        minus14.setOnClickListener {
            if (text_count14.text != "0") {
                text_count14.text = "${--a}"
                val price4445 = 6000 * text_count14.text.toString().toInt()
                price14.text = "$price4445 сум"
            }
            if (text_count14.text == "0") {
                price14.text = "6000 сум"
            }
        }

        save14.setOnClickListener {
            if (text_count14.text.toString() != "0") {
                list.add(
                    Food(
                        text_name14.text.toString(),
                        price14.text.toString(),
                        text_count14.text.toString().toInt()
                    )
                )
            }
            MyShared.list = list
            finish()
        }
    }
}