package com.compras.appnutri

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.inputmethod.InputBinding
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import com.compras.appnutri.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity(){

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btSegundaTela.setOnClickListener{
            val navegarSegundaTela = Intent(this,SegundaTela::class.java)
            startActivity(navegarSegundaTela)
        }

        val button: Button = findViewById(R.id.alertButton)
        button.setOnClickListener {
            showAlertDialog()
        }
    }

    private fun showAlertDialog() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Alerta")
        builder.setMessage("Desenvolvido por: Vieri, Venâncio, Vitor Alves")
        builder.setPositiveButton("Sair") { dialog, which ->

        }
        builder.setNegativeButton("ok") { dialog, which ->

            dialog.dismiss()
        }
        builder.show()


    }
    }

