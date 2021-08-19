package edu.neo.censo.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import edu.neo.censo.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton:Button = findViewById(R.id.boton)
        val manager = supportFragmentManager
        val fragmentfrg = Fragment()

        boton.setOnClickListener {
            val transaction = manager.beginTransaction()
            transaction.replace(R.id.frame,fragmentfrg)
            transaction.commit()
        }
    }
}