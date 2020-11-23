package br.com.ddproject.appproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import br.com.DDProject.appproject.R


class SplashActivity : AppCompatActivity() {
    /* É um dos métodos presente no ciclo de vida da Activity */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        //Abrir a LoginActivity após 3 segundos
        Handler(Looper.getMainLooper()).postDelayed({
            //Iniciando um Itent(Intenção de trocar de tela)
            val mIntent = Intent(this, LoginActivity::class.java)
            startActivity(mIntent)
            finish()
        }, 1000)
    }
}