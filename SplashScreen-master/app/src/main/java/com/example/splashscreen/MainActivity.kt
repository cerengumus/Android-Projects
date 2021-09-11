package com.example.splashscreen


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.hw2.util.inTransaction

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.test_activity_screen)


        //call extension function in util/extensions
        supportFragmentManager.inTransaction{
            add(R.id.main_activity, WordTestImpFragment())
        }
    }
}
