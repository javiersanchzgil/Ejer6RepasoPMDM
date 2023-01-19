package com.example.ejer6repasopmdm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import androidx.core.view.isInvisible
import com.example.ejer6repasopmdm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        texto(binding)


            binding.nombre.addTextChangedListener(object : TextWatcher {
                override fun beforeTextChanged(
                    s: CharSequence?,
                    start: Int,
                    count: Int,
                    after: Int
                ) {

                }

                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                    if (binding.nombre.text.toString().isNotEmpty()) {
                        binding.boton.isEnabled = true
                        if (binding.nombre.text.contains("Wayne", ignoreCase = true)) {
                            binding.imagen.isInvisible = false
                        } else
                            if (binding.nombre.text.contains("Joker", ignoreCase = true)) {
                                binding.root.setBackgroundColor(resources.getColor(R.color.purple_700))
                                binding.boton.setBackgroundColor(resources.getColor(R.color.black))
                                binding.nombre.setTextColor(resources.getColor(R.color.white))
                                binding.imagen.isInvisible = true
                            } else{
                                    binding.imagen.isInvisible = true
                                    binding.root.setBackgroundColor(resources.getColor(R.color.white))
                                    binding.boton.setBackgroundColor(resources.getColor(R.color.purple_500))
                                    binding.nombre.setTextColor(resources.getColor(R.color.black))

                            }

                    }

                }

                override fun afterTextChanged(s: Editable?) {

                }
            })


        }
    fun texto(binding: ActivityMainBinding) {
        binding.boton.setOnClickListener() {
            if (binding.nombre.isInvisible) {
                binding.nombre.visibility = View.VISIBLE
                binding.boton.text = "Finalizar"
            } else {
                binding.nombre.visibility = View.INVISIBLE
                binding.boton.text = "Comenzar"
            }
        }


    }
}



