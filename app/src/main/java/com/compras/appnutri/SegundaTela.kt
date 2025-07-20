package com.compras.appnutri

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.compras.appnutri.databinding.ActivityMainBinding
import com.compras.appnutri.databinding.ActivitySegundaTelaBinding

class SegundaTela : AppCompatActivity() {
    private lateinit var binding: ActivitySegundaTelaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySegundaTelaBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.imagem1.setOnClickListener(){
            val IrParaTela = Intent(this,TelaOvo::class.java)
            startActivity(IrParaTela)
        }

       binding.imagem2.setOnClickListener(){
            val IrParaTela = Intent(this,TelaBanana::class.java)
            startActivity(IrParaTela)
        }


        binding.imagem3.setOnClickListener(){
            val IrParaTela = Intent(this,TelaAbacate::class.java)
            startActivity(IrParaTela)
        }

        binding.imagem4.setOnClickListener(){
            val IrParaTela = Intent(this,TelaBatata::class.java)
            startActivity(IrParaTela)
        }


        }
    }
