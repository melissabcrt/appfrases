package edu.iest.botones

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView

class SegundaActivity : AppCompatActivity(), View.OnClickListener {
    private var cambioIcono : Boolean=false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

        var fraserecibida = intent.getStringExtra("frase")
        var edad = intent.getIntExtra("edad", 0)

        Log.d("DATOS", "Datos recibidos con éxito que fueron frase $fraserecibida y edad $edad")

        var bnAbrirPantalla = findViewById<Button>(R.id.bnPantalla)
        var ivLogo=findViewById<ImageView>(R.id.ivLogo)
        ivLogo.setOnClickListener{
            var arregloImagenes= arrayOf(R.drawable.anahuac, R.drawable.iest)
            if (cambioIcono){
                ivLogo.setImageResource(arregloImagenes[0])
            }else{
                ivLogo.setImageResource(arregloImagenes[1])
            }
            cambioIcono=!cambioIcono
        // ivLogo.setImageResource(R.drawable.anahuac)
        }

        bnAbrirPantalla.setOnClickListener {
            val i = Intent(this,MainActivity::class.java)
            startActivity(i)
            finish()
        }
        var bnCerrar=findViewById<Button>(R.id.bnCerrar)
        bnCerrar.setOnClickListener {
            finish()
        }
    }

    override fun onClick(p0: View?) {
        TODO("Not yet implemented")
    }

}