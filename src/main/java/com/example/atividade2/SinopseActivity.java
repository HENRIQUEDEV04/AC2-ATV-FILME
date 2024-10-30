package com.example.atividade2;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SinopseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sinopse);

        // Obtenha a sinopse do Intent
        TextView sinopseTextView = findViewById(R.id.sinopseTextView);
        String sinopse = getIntent().getStringExtra("SINOPSE");
        sinopseTextView.setText(sinopse);

        Button voltarButton = findViewById(R.id.btnVoltar);
        voltarButton.setOnClickListener(v -> finish());

    }
}


