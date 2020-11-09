package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView lstView = (ListView) findViewById(R.id.list) ;
        ArrayList<String> numdatatype=new ArrayList<String>();
        numdatatype.add("byte");
        numdatatype.add("short");
        numdatatype.add("long");
        numdatatype.add("float");
        numdatatype.add("doboul");

        ArrayList<String> textdatatype=new ArrayList<String>();
        textdatatype.add("char");
        textdatatype.add("string");
        textdatatype.add("boolean");

        ArrayList<String> fun=new ArrayList<String>();
        fun.add("general function ");
        fun.add("fun with return");
        fun.add("fun without return");

        ArrayList<String> ArithmeticOperators=new ArrayList<String>();
        ArithmeticOperators.add("general fun ");
        ArithmeticOperators.add("general fun ");
        ArithmeticOperators.add("general fun ");


        ArrayList<String> ComparisonOperators=new ArrayList<String>();





        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,  numdatatype);
        lstView.setAdapter(arrayAdapter);
        lstView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String clickedItem=(String) lstView.getItemAtPosition(position);
                Toast.makeText(MainActivity.this,clickedItem,Toast.LENGTH_LONG).show();
            }
        });
    }
    }
