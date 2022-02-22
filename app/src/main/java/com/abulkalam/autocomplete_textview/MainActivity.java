package com.abulkalam.autocomplete_textview;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    String [] country = {"India","Pakistan","Bangladesh","Afghanistan","Bhutan","China","Nepal",
            "Myanmar","Iran","Iraq","Syria","Jordan","Palestine","Israel"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Creating the instance of ArrayAdapter containing the list of countries names
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, country);

        //Getting the instance of AutoCompleteTextView
        AutoCompleteTextView actv = findViewById(R.id.autoCompleteTextView);

        //setThreshold():-Specifies the minimum number of characters the user has to type in the
        // edit box before the drop down list is shown.
        actv.setThreshold(1); //after typing one character dropdown list recommend the data
        actv.setAdapter(arrayAdapter);//setting the ArrayAdapter data into the AutoCompleteTextView
        actv.setTextColor(Color.RED); //setting the color of actv.
    }
}