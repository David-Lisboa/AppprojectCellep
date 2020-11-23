package br.com.ddproject.appproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import br.com.DDProject.appproject.CadastroActivity
import br.com.DDProject.appproject.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val botaoEntrar = buttonEntrar as Button

        botaoEntrar.setOnClickListener {
            val email = editTextTextEmailAddress.text.toString()
            val senha = editTextTextPassword.text.toString()

            val logar = logar(email, senha)
            Resultado.text = logar
        }
    }

    private fun logar(usuario: String, senha: String): String {
        return if (usuario == "dlrlisboa@gmail.com" && senha == "123") {
            "Logado com sucesso"
        } else "E-mail ou senha Invalido"
    }

}