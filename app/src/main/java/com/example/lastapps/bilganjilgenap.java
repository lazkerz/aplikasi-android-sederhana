package com.example.lastapps;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class bilganjilgenap extends AppCompatActivity {

    Button proses;
    EditText angka1, angka2;
    TextView bilangan1, bilangan2, hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bilganjilgenap);

        proses=(Button)findViewById(R.id.btnHitung);
        angka1=(EditText)findViewById(R.id.angka1);
        angka2=(EditText)findViewById(R.id.angka2);
        bilangan1=(TextView)findViewById(R.id.input1);
        bilangan2=(TextView)findViewById(R.id.input2);
        hasil=(TextView)findViewById(R.id.txtHasil);

        proses.setOnClickListener(new Button.OnClickListener(){@Override public void onClick(View v) {
            int nilai1 = Integer.parseInt(angka1.getText().toString());
            if ((nilai1 % 2) == 0) {
                bilangan1.setText("Bilangan Genap");
            } else {
                bilangan1.setText("Bilangan Ganjil");
            }
            int nilai2 = Integer.parseInt(angka2.getText().toString());
            if((nilai2 %2)==0){
                bilangan2.setText("Bilangan Genap");
            }else{
                bilangan2.setText("Bilangan Ganjil");
            }
            hasil.setText(
                    angka1.getText().toString() + " adalah " + bilangan1.getText().toString() + " dan " +
                            angka2.getText().toString() + " adalah " + bilangan2.getText().toString()
            );
        }
        });

    }
}