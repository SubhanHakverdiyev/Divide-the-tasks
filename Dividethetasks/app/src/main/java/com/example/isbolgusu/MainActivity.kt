package com.example.isbolgusu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.google.android.material.textfield.TextInputLayout
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    val listofchoice=arrayListOf("Subhan","Ali")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        baxaq.setOnClickListener(){
            val random= java.util.Random()
            val randomProgress = random.nextInt(listofchoice.count())
            //textView.text=listofchoice[randomProgress];
            val an= findViewById<TextInputLayout>(R.id.a)
            val bn= findViewById<TextInputLayout>(R.id.b)
            textView.text= listofchoice[randomProgress] + ": " + an.editText?.text.toString()+"\n\n" +
                           listofchoice[1-randomProgress]+ ": " +bn.editText?.text.toString()

        }
    }
}