package com.tantowi.menumateri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_materi.*

class MateriActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_materi)

        tv_Lihat_Tugas.setOnClickListener {
            startActivity(Intent(Intent(this, Activity_Tugas::class.java)))
        }
    }
}