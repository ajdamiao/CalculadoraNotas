package com.example.calculadoranotas

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculadoranotas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater);
        setContentView(binding.root)

        var btnCalcular = binding.btncalcular;
        var mensagem = binding.txtMensagem;


        btnCalcular.setOnClickListener()
        {
            var faltas = binding.txtFaltas.text.toString().toInt();
            var nota1 = binding.txtNota1.text.toString().toFloat();
            var nota2 = binding.txtNota2.text.toString().toFloat();
            var nota3 = binding.txtNota3.text.toString().toFloat();
            var nota4 = binding.txtNota4.text.toString().toFloat();


            if (faltas > 20) {
                mensagem.setTextColor(Color.parseColor("#ff0000"))
                mensagem.setText("Repovado por falta!");
            }
            else {
                var notaFinal:Float = (nota1+nota2+nota3+nota4)/4

                if(notaFinal >= 6)
                {
                    mensagem.setTextColor(Color.parseColor("#008000"))
                    mensagem.setText("Aprovado! nota final: $notaFinal");
                }
                else
                {
                    mensagem.setTextColor(Color.parseColor("#ff0000"))
                    mensagem.setText("Repovado! nota final: $notaFinal");
                }
            }
        }
    }
}