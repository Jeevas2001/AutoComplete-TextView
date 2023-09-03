package com.example.autocompletetextview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.autocompletetextview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    var Marvelmovies= arrayOf("Iron Man 1","Iron Man 2","Iron Man 3","Thor 1","Thor 2","Thor3",
        "Captain America 1","Captain America 2","Civil War","Age Of Ultron","Infinity War",
        "Guardians of Galaxy1","Guardians of galaxy2","Ant Man 1","Ant Man 2","Spider Man Home Coming",
        "Spider Man Far From Home","Spider No Way","Black Panther","Doctor Strange","Falcon the Winter Solider"
        ,"caption Marvel","Avengers End Game"
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding= ActivityMainBinding.inflate(layoutInflater)
        var view =binding.root
        setContentView(view)

        val arrayAdapter=ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,Marvelmovies)
        binding.autoCompleteTextView.setAdapter(arrayAdapter)
    }
}