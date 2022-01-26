package example.google.com.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import example.google.com.affirmations.Adapter.ItemAdapter
import example.google.com.affirmations.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       // val textView: TextView = findViewById(R.id.textView)
        //textView.text = Datasource().loadAffirmations().size.toString()
        val myDataSet = Datasource().loadAffirmations()
        val recyclerview = findViewById<RecyclerView>(R.id.recycler_view)

        recyclerview.layoutManager = GridLayoutManager(applicationContext, 3)
        recyclerview.adapter = ItemAdapter (this, myDataSet)
        recyclerview.setHasFixedSize(true)

    }
}