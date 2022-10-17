package ro.sapientia.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var textView: TextView
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.textview)
        textView.text = "MVH"
        button = findViewById<Button>(R.id.button)
        button.setOnClickListener{
            changeText()
        }
    }

    private fun changeText() {
        textView.text = button.text
    }
}