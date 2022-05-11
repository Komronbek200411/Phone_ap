package developer.abdusamid.viphotdog

import android.annotation.SuppressLint
import android.os.Bundle
import android.telephony.SmsManager
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main4.*

class MainActivity4 : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        MyShared.init(this)
        val list = MyShared.list

        var a = 0
        plus4.setOnClickListener {
            text_count4.text = "${++a}"
            val price444 = 17000 * text_count4.text.toString().toInt()
            price4.text = "$price444 сум"
        }
        minus4.setOnClickListener {
            if (text_count4.text != "0") {
                text_count4.text = "${--a}"
                val price445 = 17000 * text_count4.text.toString().toInt()
                price4.text = "$price445 сум"
            }
            if (text_count4.text == "0") {
                price4.text = "17000 сум"
            }
        }

        save4.setOnClickListener {
            if (text_count4.text.toString() != "0") {
                list.add(
                    Food(
                        text_name4.text.toString(),
                        price4.text.toString(),
                        text_count4.text.toString().toInt()
                    )
                )
            }
            Toast.makeText(this, "SMS Jonatildi", Toast.LENGTH_SHORT).show()
            MyShared.list = list
            MyShared.list.removeAll(list)
            list.removeAll(MyShared.list)
            finish()
        }
    }
}