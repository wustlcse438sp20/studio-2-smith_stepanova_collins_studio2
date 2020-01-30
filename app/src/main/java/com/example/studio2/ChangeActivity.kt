package com.example.studio2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_change.*

class ChangeActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_change)
        val switcher = findViewById(R.id.switch_button);
        switcher.setOnClickListener(new View.OnCLickListener() {
            public void onClick(View change)
        }


    }

    fun switchFragments() {
        super.onStart()
        val initialfrag = DepositFragment()
        var bundle = Bundle()
        initialfrag.arguments = bundle
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.contaner, initialfrag)
        transaction.commit()
    }


}
