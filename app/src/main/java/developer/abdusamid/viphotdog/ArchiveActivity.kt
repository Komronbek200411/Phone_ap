package developer.abdusamid.viphotdog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import developer.abdusamid.viphotdog.MyShared.list
import kotlinx.android.synthetic.main.activity_archive.*

class ArchiveActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_archive)
        actionBar?.hide()
        supportActionBar?.hide()

        val positions = intent.getIntExtra("position", 0)
        textView_name.text = list[positions].name
        textView_count.text = list[positions].count.toString()
        textView_price.text = list[positions].price
    }
}