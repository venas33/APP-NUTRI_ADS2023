    package com.compras.appnutri

    import android.annotation.SuppressLint
    import android.os.Bundle
    import android.text.Html
    import android.text.method.LinkMovementMethod
    import android.widget.TextView
    import androidx.activity.enableEdgeToEdge
    import androidx.appcompat.app.AppCompatActivity
    import androidx.core.view.ViewCompat
    import androidx.core.view.WindowInsetsCompat

    class TelaOvo : AppCompatActivity() {
        @SuppressLint("MissingInflatedId")
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)

            enableEdgeToEdge()
            setContentView(R.layout.activity_tela_ovo)

            ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
                val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
                insets
            }

            val textView: TextView = findViewById(R.id.textView03)
            textView.text = Html.fromHtml("<a href='http://blog.gsuplementos.com.br/beneficios-do-ovo'>Benefícios do Ovo</a>")
            textView.movementMethod = LinkMovementMethod.getInstance()
        }
    }
