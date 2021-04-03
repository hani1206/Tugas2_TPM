package com.example.tugas2;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Layout extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout2);
        TextView n = (TextView) findViewById(R.id.tnama);
        TextView ni = (TextView) findViewById(R.id.tnim);
        TextView nil = (TextView) findViewById(R.id.tnilai);
        Bundle b = getIntent().getExtras();
        String h = b.getString("huruf");
        String s = b.getString("nama");
        String d = b.getString("nim");
        String f = b.getString("nilai");
        //getnama = b.getString("nama");
        //getnim = b.getString("nim");
        //getnilai = b.getString("nilai");
        n.setText(s);
        ni.setText(d);
        nil.setText(h);
        //gethuruf = b.getString("huruf");
    }
}
