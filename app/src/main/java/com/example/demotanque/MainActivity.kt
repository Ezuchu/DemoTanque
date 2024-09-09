package com.example.demotanque

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private var litrosAct : Int = 50

    private lateinit var obtn1 : Button
    private lateinit var obtn2 : Button
    private lateinit var olts : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }



        initComponents()
        initListeners()
        initUI()






    }



    private fun initComponents() {
        obtn1 = findViewById<Button>(R.id.btn1)
        obtn2 = findViewById<Button>(R.id.btn2)
        olts = findViewById<TextView>(R.id.lts)

    }

    private fun initListeners() {
        obtn1.setOnClickListener {
            litrosAct += 1
            setLts()
        }
        obtn2.setOnClickListener {
            litrosAct -= 1
            setLts()
        }
    }

    private fun setLts()
    {
        olts.text = litrosAct.toString()
    }

    private fun initUI()
    {
        setLts()
    }


}