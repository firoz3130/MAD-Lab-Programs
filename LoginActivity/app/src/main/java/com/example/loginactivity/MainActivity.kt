package com.example.loginactivity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.util.regex.Matcher
import java.util.regex.Pattern
class MainActivity : AppCompatActivity() {
    private lateinit var unameTxt: EditText
    private lateinit var passTxt: EditText
    private lateinit var signupBtn: Button
    private lateinit var srcIntent: Intent
    val p1 = Pattern.compile("[^a-zA-Z0-9]") //For only special characters
    val p2 = Pattern.compile("(?=.*[a-z])") //For atleast 1 small case letter
    val p3 = Pattern.compile("(?=.*[A-Z])") //For atleast 1 Uppercase letter
    val p4 = Pattern.compile("(?=.*[0-9])")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        unameTxt = findViewById(R.id.editText)
        passTxt = findViewById(R.id.editText2)
        signupBtn = findViewById(R.id.button)
        signupBtn.setOnClickListener {
            val uname = unameTxt.getText().toString()
            val pass = passTxt.getText().toString()
            val matcher1: Matcher = p1.matcher(pass) // pass is holding input string
            val matcher2: Matcher = p2.matcher(pass)
            val matcher3: Matcher = p3.matcher(pass)
            val matcher4: Matcher = p4.matcher(pass)
            val isStringContainsSpecialCharacter: Boolean =
                matcher1.find() // use the find() method to perform pattern matching
            val isStringLower: Boolean = matcher2.find()
            val isStringUpper: Boolean = matcher3.find()
            val isStringDigit: Boolean = matcher4.find()
            val passwordLen = pass.length
            if (isStringContainsSpecialCharacter && isStringUpper && isStringLower && isStringDigit && passwordLen >= 8) {
                val srcIntent = Intent(this, MainActivity::class.java)
                val data = Bundle()
                data.putString("username", uname)
                data.putString("password", pass)
                srcIntent.putExtras(data)
                startActivity(srcIntent)
            } else Toast.makeText(this@MainActivity, "Invalid Password", Toast.LENGTH_SHORT).show()
        }
    }
}