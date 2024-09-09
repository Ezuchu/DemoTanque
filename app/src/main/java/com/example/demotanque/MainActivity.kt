package com.example.demotanque

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private var litrosAct : Int = 0
    private var max : Int = 100
    private var por : Int = 0

    private lateinit var obtn1 : Button
    private lateinit var obtn2 : Button
    private lateinit var olts : TextView
    private lateinit var opor : TextView
    private lateinit var tanque : ImageView


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
        opor = findViewById<TextView>(R.id.porc)
        tanque = findViewById<ImageView>(R.id.tank)
    }

    private fun initListeners() {
        obtn1.setOnClickListener {
            if(litrosAct < max)
            {
                litrosAct += 1
                setLts()
            }

        }
        obtn2.setOnClickListener {
            if(litrosAct > 0)
            {
                litrosAct -= 1
                setLts()
            }

        }
    }

    private fun setimg()
    {
        if(por < 10)
        {
            tanque.setImageResource(R.drawable.tanquedemo1)
        }else if(por < 20)
        {
            tanque.setImageResource(R.drawable.tanquedemo2)
        }else if(por < 30)
        {
            tanque.setImageResource(R.drawable.tanquedemo3)
        }else if(por < 40)
        {
            tanque.setImageResource(R.drawable.tanquedemo4)
        }else if(por < 50)
        {
            tanque.setImageResource(R.drawable.tanquedemo5)
        }else if(por < 60)
        {
            tanque.setImageResource(R.drawable.tanquedemo6)
        }else if(por < 70)
        {
            tanque.setImageResource(R.drawable.tanquedemo7)
        }else if(por < 80)
        {
            tanque.setImageResource(R.drawable.tanquedemo8)
        }else if(por < 90)
        {
            tanque.setImageResource(R.drawable.tanquedemo9)
        }else if(por < 100)
        {
            tanque.setImageResource(R.drawable.tanquedemo10)
        }else
        {
            tanque.setImageResource(R.drawable.tanquedemo11)
        }
    }

    private fun setLts()
    {
        por = (max*litrosAct/100)
        opor.text = "$por%"
        olts.text = litrosAct.toString()
        setimg()
    }

    private fun initUI()
    {
        setLts()
    }


}