//package com.example.signupnlogin
//import android.os.Bundle
//
//import android.widget.Button
//import android.widget.EditText
//import android.widget.Toast
//import androidx.appcompat.app.AppCompatActivity
//class MainActivity2 : AppCompatActivity() {
//    private lateinit var loguserTxt: EditText
//    private lateinit var logpassTxt: EditText
//    private lateinit var signInBtn: Button
//}
//    var user: String? = null
//    var pass:kotlin.String? = null
//var bundle: Bundle? = null
//    var count = 0
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState) setContentView(R.layout.activity_main2)
//        val i = intent
//        bundle = i.extras
//        loguserTxt = findViewById(R.id.editText)
//        logpassTxt = findViewById(R.id.editText2)
//        signInBtn = findViewById(R.id.button2)
//        signInBtn.setOnClickListener{
//            val user1 = loguserTxt.text.toString()
//            val pass1 = logpassTxt.text.toString()
//            if (user == user1 &&pass == pass1) Toast.makeText(
//                this,
//                "Login Successful",
//                Toast.LENGTH_LONG
//            ).show() else {
//                count++
//                if (count == 3) {
//                    signInBtn.isEnabled = false
//                    Toast.makeText(this, "Failed Login Attempts", Toast.LENGTH_LONG).show()
//                } else Toast.makeText(this, "Login Failed, Try Again $count", Toast.LENGTH_LONG)
//                    .show()
//            }
//        }
//        if (bundle != null) {
//            user = bundle!!.getString("username")
//            pass = bundle!!.getString("password")
//        }
//        else Toast.makeText(applicationContext, "data pass error", Toast.LENGTH_SHORT).show()
//    }