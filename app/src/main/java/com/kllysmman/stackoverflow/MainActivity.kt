package com.kllysmman.stackoverflow

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showAlert(null)
    }

    fun showAlert(view: View?){
        val v = View.inflate(this, R.layout.input, null);
        val alertDialog = AlertDialog.Builder(this)
        alertDialog.setTitle("tittle")
        alertDialog.setView(v)
        alertDialog.setPositiveButton("positive", null)
        alertDialog.setNegativeButton("negative", null)
        alertDialog.create()
        alertDialog.show()
    }

}

