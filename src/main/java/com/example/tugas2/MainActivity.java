package com.example.tugas2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText enama, enim, enilai;
    TextView huruf;
    Button btn_satu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        huruf = (TextView)findViewById(R.id.huruf);

        //Text Input
        enama = (EditText)findViewById(R.id.nama);
        enim = (EditText)findViewById(R.id.nim);
        enilai = (EditText)findViewById(R.id.nilai);
        btn_satu = (Button)findViewById(R.id.btn_satu);

        btn_satu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!enilai.getText().toString().equals("")){
                    hitung();
                }
                Intent i = new Intent(MainActivity.this, Layout.class);
                i.putExtra("huruf", huruf.getText().toString());
                i.putExtra("nama", enama.getText().toString());
                i.putExtra("nim", enim.getText().toString());
                i.putExtra("nilai", enilai.getText().toString());
                startActivity(i);
            }
        });

    }

    private void hitung() {
        Double vnilai = Double.parseDouble(enilai.getText().toString());
        String vhuruf = "";
        if (vnilai > 3.66 | vnilai >= 4.00) {
            vhuruf = "A";
        }
        else if (vnilai > 3.33 | vnilai >= 3.66){
            vhuruf = "A-";
        }
        else if (vnilai > 3.00 | vnilai >= 3.33){
            vhuruf = "B+";
        }
        else if (vnilai > 2.66 | vnilai >= 3.00){
            vhuruf = "B";
        }
        else if (vnilai > 2.33 | vnilai >= 2.66){
            vhuruf = "B-";
        }
        else if (vnilai > 2.00 | vnilai >= 2.33){
            vhuruf = "C+";
        }
        else if (vnilai > 1.66 | vnilai >= 2.00){
            vhuruf = "C";
        }
        else if (vnilai > 1.33 | vnilai >= 1.66){
            vhuruf = "C-";
        }
        else if (vnilai > 1.00 | vnilai >= 1.33){
            vhuruf = "D+";
        }
        else if (vnilai == 1.00){
            vhuruf = "D";
        }
        huruf.setText(vhuruf);
    }
}
