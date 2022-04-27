package com.example.appr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bnt: Button = findViewById(R.id.bnt)
        bnt.setOnClickListener{condicao()}
    }

    private fun condicao(){
        val edtNumber: EditText = findViewById(R.id.edtNumber)
        val edtNumber2: EditText = findViewById(R.id.edtNumber1)

        if (Integer.parseInt(edtNumber.text.toString()) > Integer.parseInt(edtNumber2.text.toString())) {
            Toast.makeText(this, "Campo 1 é maior que o campo 2", Toast.LENGTH_LONG).show()
        }
        else if (Integer.parseInt(edtNumber.text.toString()) < Integer.parseInt(edtNumber2.text.toString())) {
            Toast.makeText(this, "Campo 2 é maior que o campo 1", Toast.LENGTH_LONG).show()
        }
        else {
            Toast.makeText(this, "Campo 2 é igual que o campo 1", Toast.LENGTH_LONG).show()
        }

    }
}