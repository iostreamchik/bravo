package com.example.libraryb

import android.content.Context
import android.widget.Toast

class Bravo {
    companion object {
        fun toastMessage(context: Context) {
            Toast.makeText(context, "Bravo", Toast.LENGTH_SHORT).show()
        }
    }
}