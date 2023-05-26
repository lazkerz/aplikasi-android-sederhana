package com.example.lastapps;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class kalkulator extends AppCompatActivity {

    EditText angka_pertama, angka_kedua;
    Button tambah, kurang, kali, bagi, bersihkan;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);

        angka_pertama = (EditText) findViewById(R.id.angka1);
        angka_kedua = (EditText) findViewById(R.id.angka2);
        tambah = (Button) findViewById(R.id.btnTambah);
        kurang = (Button) findViewById(R.id.btnKurang);
        kali = (Button) findViewById(R.id.btnKali);
        bagi = (Button) findViewById(R.id.btnBagi);
        bersihkan = (Button) findViewById(R.id.btnBersihkan);
        hasil = (TextView) findViewById(R.id.txtHasil);

        tambah.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if ((angka_pertama.getText().length() > 0) &&
                        (angka_kedua.getText().length() > 0)) {
                    double angka1 =
                            Double.parseDouble(angka_pertama.getText().toString());
                    double angka2 =
                            Double.parseDouble(angka_kedua.getText().toString());
                    double result = angka1 + angka2;
                    hasil.setText(Double.toString(result));
                }
                else{
                    Toast toast = Toast.makeText(kalkulator.this,
                            "Mohon masukkan Angka pertama & kedua",
                            Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
        kurang.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if ((angka_pertama.getText().length() > 0) &&
                        (angka_kedua.getText().length() > 0)) {
                    double angka1 =
                            Double.parseDouble(angka_pertama.getText().toString());
                    double angka2 =
                            Double.parseDouble(angka_kedua.getText().toString());
                    double result = angka1 - angka2;
                    hasil.setText(Double.toString(result));
                }
                else{
                    Toast toast = Toast.makeText(kalkulator.this,
                            "Mohon masukkan Angka pertama & kedua",
                            Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
        kali.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if ((angka_pertama.getText().length() > 0) &&
                        (angka_kedua.getText().length() > 0)) {
                    double angka1 =
                            Double.parseDouble(angka_pertama.getText().toString());
                    double angka2 =
                            Double.parseDouble(angka_kedua.getText().toString());
                    double result = angka1 * angka2;
                    hasil.setText(Double.toString(result));
                }
                else{
                    Toast toast = Toast.makeText(kalkulator.this,
                            "Mohon masukkan Angka pertama & kedua",
                            Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
        bagi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if ((angka_pertama.getText().length() > 0) &&
                        (angka_kedua.getText().length() > 0)) {
                    double angka1 =
                            Double.parseDouble(angka_pertama.getText().toString());
                    double angka2 =
                            Double.parseDouble(angka_kedua.getText().toString());
                    double result = angka1 / angka2;
                    hasil.setText(Double.toString(result));
                }
                else{
                    Toast toast = Toast.makeText(kalkulator.this,
                            "Mohon masukkan Angka pertama & kedua",
                            Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
        bersihkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angka_pertama.setText("");
                angka_kedua.setText("");
                hasil.setText("0");
                angka_pertama.requestFocus();
            }
        });
    }
}