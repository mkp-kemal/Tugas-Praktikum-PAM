package com.example.prakpaw

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var mCount = 0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonCountUp = findViewById<Button>(R.id.button_count)
        val mShowCount = findViewById<TextView>(R.id.show_count)
        val buttonToast = findViewById<Button>(R.id.button_toast)
        val toActivityIntent = findViewById<Button>(R.id.btn_activity_intent)

        toActivityIntent.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, IntentActivity::class.java)
            startActivity(intent)
        })

        //AKSI COUNT
        buttonCountUp.setOnClickListener(View.OnClickListener {
            mCount++
            if (mShowCount != null) {
                mShowCount.text = mCount.toString()
            }
        })

        //AKSI TOAST
        buttonToast.setOnClickListener(View.OnClickListener {
            val tulisan: String = mShowCount?.text.toString()
            val toast: Toast = Toast.makeText(this, "Angka yang dimunculkan " + tulisan, Toast.LENGTH_LONG)
            toast.show()
        })


    }
    }