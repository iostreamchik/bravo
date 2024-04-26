package com.example.librarya

import android.content.Context
import android.widget.Toast

class Alpha {
    companion object {
        fun toastMessage(context: Context) {
            Toast.makeText(context, "Alpha", Toast.LENGTH_SHORT).show()
        }
    }
}