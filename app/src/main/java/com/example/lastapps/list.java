package com.example.lastapps;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class list extends AppCompatActivity {

    private ListView lvItem;
    private String[] namanegara = new String[]{
            "Indonesia","Malaysia","Singapura","Italia","Inggris","Belanda","Argentina","Chile","Mesir","Uganda"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        getSupportActionBar().setTitle("ListView Sederhana");

        lvItem = (ListView)findViewById(R.id.list_view);
        ArrayAdapter<String>adapter=new
                ArrayAdapter<String>(list.this,
                android.R.layout.simple_list_item_1, android.R.id.text1, namanegara);

        lvItem.setAdapter(adapter);
        lvItem.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?>parent, View view, int position, long id) {
                Toast.makeText(list.this, "Memilih :" + namanegara[position],
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}