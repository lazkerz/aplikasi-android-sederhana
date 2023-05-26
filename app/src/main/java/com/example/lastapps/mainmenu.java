package com.example.lastapps;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class mainmenu extends AppCompatActivity {

    ImageButton kalkulator, list, ganjilgenap;
    TextView admin, txtkalkulator, txtganjilgenap, txtlist, deskripsikalkulator, deskripsiganjilgenap, deskripsilist;String usr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainmenu);

        kalkulator = (ImageButton) findViewById(R.id.kalkulator);
        list = (ImageButton) findViewById(R.id.list);
        ganjilgenap = (ImageButton) findViewById(R.id.ganjilgenap);
        txtkalkulator=(TextView) findViewById(R.id.txtkalkulator);
        deskripsikalkulator=(TextView) findViewById(R.id.deskripsikalkulator);
        txtganjilgenap=(TextView)findViewById(R.id.txtganjilgenap);
        deskripsiganjilgenap=(TextView)findViewById(R.id.deskripsiganjilgenap);
        txtlist=(TextView)findViewById(R.id.txtlist);
        deskripsilist=(TextView)findViewById(R.id.deskripsilist);
        usr = getIntent().getStringExtra("user");


        kalkulator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent( mainmenu.this,kalkulator.class);
                startActivity(pindah);
            }
        });

        list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(mainmenu.this,list.class);
                startActivity(pindah);
            }
        });

        ganjilgenap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(mainmenu.this,bilganjilgenap.class);
                startActivity(pindah);
            }
        });
    }
}