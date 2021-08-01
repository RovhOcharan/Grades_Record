package com.example.studentsgrade

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class ListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        val arrayAdapter:ArrayAdapter<*>

        val student = mutableListOf("Student1, Student2, Student3, Student4, Student5")
        val lvData = findViewById<ListView>(R.id.lvData)

        arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,student)
        lvData.adapter = arrayAdapter

        lvData.setOnItemClickListener(){parent,view,position,id->
            Toast.makeText(this,parent.getItemAtPosition(position).toString(),Toast.LENGTH_LONG).show()
            
        }



    }

}