package com.example.splashscreen

import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class WordTestImplActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.test_fragment_screen)

        val titleButton: Button = findViewById(R.id.button2)

        val cardViewText1: TextView = findViewById(R.id.gorsellestirmek_text)
        val cardViewText2: TextView = findViewById(R.id.altinda_text)
        val cardViewText3: TextView = findViewById(R.id.bagis_text)
        val cardViewText4: TextView = findViewById(R.id.ensulin_text)

        titleButton.text = intent.getStringExtra("label")

        cardViewText1.text = intent.getStringArrayExtra("card label list")?.get(0)
        cardViewText2.text = intent.getStringArrayExtra("card label list")?.get(1)
        cardViewText3.text = intent.getStringArrayExtra("card label list")?.get(2)
        cardViewText4.text = intent.getStringArrayExtra("card label list")?.get(3)

        var progressBar: ProgressBar = findViewById(R.id.progress_circular)
        var progressText: TextView = findViewById(R.id.countdown_time)
        var progr: Int

        var timer = object : CountDownTimer(20000, 1000) {
            override fun onTick(timeLeft: Long) {
                progr = (timeLeft.toInt() / 1000)
                updateProgressBar(progressBar, progressText, progr)
            }

            override fun onFinish() {
                Toast.makeText(this@WordTestImplActivity, "Time is up", Toast.LENGTH_SHORT).show()
            }
        }

        timer.start()


    }

    private fun updateProgressBar(progressBar: ProgressBar, progressText: TextView, progr: Int) {
        progressBar.progress = progr * 5
        progressText.text = "$progr"
    }
}
