package com.example.biografia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.biografia.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tb.setOnClickListener {
            IrParaBioPedro()
        }

        binding.btBioCarlos.setOnClickListener {
            IrParaBioCarlos()
        }
        binding.btBioRigel.setOnClickListener {
            IrParaBioRigel()
        }
    }
    private fun IrParaBioPedro(){
        val telaPedro = Intent(this, BioPedro::class.java)
        startActivity(telaPedro)
    }

    private fun IrParaBioCarlos(){
        val telaCarlos = Intent(this, BioCarlos::class.java)
        startActivity(telaCarlos)
    }

    private fun IrParaBioRigel(){
        val telaRigel = Intent(this, BioRigel::class.java)
        startActivity(telaRigel)
    }


}