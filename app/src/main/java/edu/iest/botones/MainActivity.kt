package edu.iest.botones

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    private lateinit var etFrase : EditText
    private lateinit var tvFrase : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvFrase = findViewById(R.id.textView)
        etFrase = findViewById(R.id.editTextFrase)

        var bnSiguienteP = findViewById<Button>(R.id.bnSiguiente)
        bnSiguienteP.setOnClickListener {
            val i = Intent(this,SegundaActivity::class.java)
            i.putExtra("frase",etFrase.text.toString())
            i.putExtra("edad", 21)
            startActivity(i)
        }

        var bnMostrar = findViewById<Button>(R.id.buttonMostrar)
        bnMostrar.setOnClickListener {
            val frase = etFrase.text.toString()
            Snackbar.make(tvFrase, "Su frase fue $frase", Snackbar.LENGTH_LONG).show()
        }
    }

    private fun obtenerFrase() : String{
        return etFrase.text.toString()
    }
}