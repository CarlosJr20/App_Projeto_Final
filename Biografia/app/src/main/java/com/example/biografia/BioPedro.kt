package com.example.biografia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
 import com.example.biografia.databinding.ActivityBioPedroBinding
import com.example.biografia.databinding.ActivityMainBinding
import com.example.biografia.databinding.ActivityMainBinding.*

class BioPedro : AppCompatActivity() {
    private lateinit var binding: ActivityBioPedroBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBioPedroBinding.inflate((layoutInflater))
        setContentView(binding.root)

            binding.btMais.setOnClickListener {
                IrParaMais()
            }

     //   binding.bt_mais.setOnClickListener {
       //     IrParaMais()
        //}
    }

    private fun  IrParaMais(){
        val telaMais = Intent(this, TelaMais::class.java)
        startActivity(telaMais)
    }

  /*  private fun IrParaMais() {
        val telaMais = Intent(this, TelaMais::class.java)
        startActivity((telaMais))
    }

   */
}