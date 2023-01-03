package ipca.test.a21321312

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textViewStatus)
        val switch = findViewById<VerticalSwitch>(R.id.verticalSwitch)

        switch.setOnStateChanged {
            if (it){
                textView.text = "Ligado"
            }else{
                textView.text = "Desligado"
            }
        }

    }
}