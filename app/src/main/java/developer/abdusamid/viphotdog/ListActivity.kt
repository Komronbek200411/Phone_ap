package developer.abdusamid.viphotdog

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.i
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_list.*

class ListActivity : AppCompatActivity() {
    private lateinit var adpter: ArrayAdapter<CharSequence>
    private lateinit var adpter2: ArrayAdapter<CharSequence>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        start()

        suv.setSelection(1)

        adpter = ArrayAdapter.createFromResource(this, R.array.array_name, R.layout.text)

        suv.adapter = adpter

        adpter2 = ArrayAdapter.createFromResource(this, R.array.name, R.layout.text)

        suvLitr.adapter = adpter2

        suvLitr.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            @SuppressLint("SetTextI18n")
            override fun onItemSelected(position: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                when (suvLitr.selectedItemPosition) {
                    0 -> {
                        suv_fee.text = "6.000"
                    }
                    1 -> {
                        suv_fee.text = "10.000"
                    }
                    2 -> {
                        suv_fee.text = "13.000"
                    }
                }
            }

            override fun onNothingSelected(position: AdapterView<*>?) {
            }
        }
        suv.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(position: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                if (suv.selectedItemPosition == 0) {
                    suv_image.setImageResource(R.drawable.fanta)
                } else if (suv.selectedItemPosition == 1) {
                    suv_image.setImageResource(R.drawable.coca_cola)
                }
            }

            override fun onNothingSelected(position: AdapterView<*>?) {
            }
        }
    }

    private fun start() {
        kur_maliy.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
        kur_bolshoy.setOnClickListener {
            startActivity(Intent(this, MainActivity2::class.java))
        }
        kazi_maliy.setOnClickListener {
            startActivity(Intent(this, MainActivity3::class.java))
        }
        kazi_bolshoy.setOnClickListener {
            startActivity(Intent(this, MainActivity4::class.java))
        }
        kotlet_maliy.setOnClickListener {
            startActivity(Intent(this, MainActivity5::class.java))
        }
        kotlet_bolshoy.setOnClickListener {
            startActivity(Intent(this, MainActivity6::class.java))
        }
        miks_maliy.setOnClickListener {
            startActivity(Intent(this, MainActivity7::class.java))
        }
        miks_bolshoy.setOnClickListener {
            startActivity(Intent(this, MainActivity8::class.java))
        }
        fri.setOnClickListener {
            startActivity(Intent(this, MainActivity9::class.java))
        }
        coffee_lin.setOnClickListener {
            startActivity(Intent(this, MainActivity10::class.java))
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.my_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            1 -> {
                R.id.menu_archive
                Toast.makeText(this, "Archive", Toast.LENGTH_SHORT).show()
            }
            2 -> {
                R.id.menu_korzinka
                Toast.makeText(this, "Korzinka", Toast.LENGTH_SHORT).show()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}