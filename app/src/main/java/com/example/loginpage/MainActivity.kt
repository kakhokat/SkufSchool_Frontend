package com.example.loginpage

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Проверяем, существует ли элемент с таким ID
        val usernameEditText = findViewById<EditText>(R.id.username) ?: throw NullPointerException("Username field not found")
        val passwordEditText = findViewById<EditText>(R.id.password) ?: throw NullPointerException("Password field not found")
        val loginButton = findViewById<Button>(R.id.loginButton) ?: throw NullPointerException("Login button not found")

        // Обработка нажатия на кнопку
        loginButton.setOnClickListener {
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()

            if (username.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Please enter both username and password", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Login successful", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
