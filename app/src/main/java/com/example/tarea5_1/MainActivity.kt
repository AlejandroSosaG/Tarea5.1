package com.example.tarea5_1

import android.annotation.SuppressLint
import android.media.MediaPlayer
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.example.tarea5_1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), OnClickListener {
    private var gato: ImageButton? = null
    private var cerdo: ImageButton? = null
    private var perro: ImageButton? = null
    private var mediaplayer: MediaPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val main = ActivityMainBinding.inflate(layoutInflater)
        setContentView(main.root)
        mediaplayer = MediaPlayer.create(this, R.raw.gato)
        //Obtenemos los tres botones de la interfaz
        gato = findViewById(R.id.Gato)
        perro = findViewById(R.id.Perro)
        cerdo = findViewById(R.id.Cerdo)
        //Y les asignamos el controlador de eventos
        gato!!.setOnClickListener(this);
        perro!!.setOnClickListener(this);
        cerdo!!.setOnClickListener(this);
    }

    override fun onClick(v: View) {
        //Comprobamos el identificador del boton que ha llamado al evento para ver
        //cual de los botones es y ejecutar la acción correspondiente
        when (v.getId()) {
            R.id.Gato -> {
                //Iniciamos el audio
                mediaplayer = MediaPlayer.create(this, R.raw.gato)
                mediaplayer!!.start()
            }

            R.id.Perro -> {
                //Iniciamos el audio
                mediaplayer = MediaPlayer.create(this, R.raw.perro)
                mediaplayer!!.start()
            }

            R.id.Cerdo -> {
                //Iniciamos el audio
                mediaplayer = MediaPlayer.create(this, R.raw.cerdo)
                mediaplayer!!.start()
            }
        }
    }
}