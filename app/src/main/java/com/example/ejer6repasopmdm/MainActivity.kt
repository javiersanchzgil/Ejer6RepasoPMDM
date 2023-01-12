package com.example.ejer6repasopmdm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.core.view.isInvisible
import com.example.ejer6repasopmdm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.boton.text = "COMENZAR"
        binding.nombre.isInvisible = true

        binding.boton.setOnClickListener {
            binding.nombre.isInvisible = false
            binding.boton.text = "FINALIZAR"
        }

        binding.nombre.setOnClickListener {
            if (binding.nombre.text.isEmpty()) {
                binding.boton.isEnabled = true
            } else {
                if (binding.nombre.text.isNotEmpty()) {
                    binding.boton.isEnabled = false
                    if (binding.nombre.text.toString() == "Wayne"){


                    }
                }
        }
        }

        binding.boton.setOnClickListener {
            binding.nombre.text.clear()
            binding.boton.text = "COMENZAR"
        }







        /*binding.boton.setOnClickListener {
            binding.boton.text = "SALUDAR"
            binding.editText.visibility = binding.editText.visibility
            binding.editText.hint = "Introduce tu nombre"
            binding.editText.setText("")
            binding.editText.requestFocus()
            binding.boton.setOnClickListener {
                binding.boton.text = "VOLVER A EMPEZAR"
                binding.editText.visibility = binding.editText.visibility
                binding.editText.hint = "Hola ${binding.editText.text}"
                binding.editText.setText("")
                binding.editText.requestFocus()
                binding.boton.setOnClickListener {
                    binding.boton.text = "COMENZAR"
                    binding.editText.visibility = binding.editText.visibility
                    binding.editText.hint = "Introduce tu nombre"
                    binding.editText.setText("")
                    binding.editText.requestFocus()
                }
            }
        }*/



        binding.nombre.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {



            }

            override fun afterTextChanged(s: Editable?) {
            }
        })











    }
}


