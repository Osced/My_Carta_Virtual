package com.example.mycartavirtual;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class BebidasActivity extends AppCompatActivity {

    String [] bebidas = new String []{ "Jugos", "Gaseosas", "Licores" , "Mazamorra"};
    private ListView lv =null;
    private ListAdapter la = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bebidas);
        lv = findViewById( android.R.id.list);
        la = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, bebidas);
        lv.setAdapter(la);
    }
}