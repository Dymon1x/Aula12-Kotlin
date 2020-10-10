package br.com.digitalhouse.aula0910

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

// Telas
class MainActivity : AppCompatActivity() {

    var pGasolina: Float = 0f
    var pEtanol: Float = 0f

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_comparando.setOnClickListener {
            pGasolina = editar_gasolina.text.toString().toFloat()
            pEtanol = editar_etanol.text.toString().toFloat()
            if (pEtanol < (pGasolina * 0.7)) {
                return@setOnClickListener iv_resultado.setImageResource(R.drawable.abasteca_etanol)
            } else {
                return@setOnClickListener iv_resultado.setImageResource(R.drawable.abasteca_gasolina)
            }
        }
    }
}
