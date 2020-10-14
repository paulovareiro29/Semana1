package ipvc.estg.xpto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

const val PARAM1_NAME = "NOME"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("aula2","on Create")
        Toast.makeText(this,R.string.welcome, Toast.LENGTH_SHORT).show()

    }

    override fun onStop() {
        super.onStop()
        Log.d("aula2","on Stop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("aula2","on Restart")

    }

    override fun onResume() {
        super.onResume()
        Log.d("aula2","on Resume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("aula2","on Pause")
    }

    override fun onStart(){
        super.onStart();
        Log.d("aula2","on Start")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("aula2","on Destroy")
    }

    fun sendButton(view: View) {
        var editTextView = findViewById<EditText>(R.id.editText1)
        Toast.makeText(this,editTextView.text, Toast.LENGTH_SHORT).show()
        findViewById<TextView>(R.id.texto).setText(editTextView.text)
    }


    fun nextPage(view: View) {
        var edit1 = findViewById<EditText>(R.id.editText1)

        val intent = Intent(this, MainActivity2::class.java).apply {
            putExtra(PARAM1_NAME,edit1.text.toString())
        }

        startActivity(intent)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true;
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.create_new -> {
                Toast.makeText(this,"@string/create_new", Toast.LENGTH_SHORT).show()
                true
            }

            R.id.opcao2 -> {
                Toast.makeText(this,"opcao2", Toast.LENGTH_SHORT).show()
                true
            }

            R.id.opcao3 -> {
                Toast.makeText(this,"opcao3", Toast.LENGTH_SHORT).show()
                true
            }

            R.id.opcao4 -> {
                Toast.makeText(this,"opcao4", Toast.LENGTH_SHORT).show()
                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }
}

