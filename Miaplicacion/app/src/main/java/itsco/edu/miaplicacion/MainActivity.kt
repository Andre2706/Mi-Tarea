package itsco.edu.miaplicacion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun holaalejandro (view: View) {
        Toast.makeText(this,"Hola Mundo", Toast.LENGTH_SHORT).show()
    }
}
