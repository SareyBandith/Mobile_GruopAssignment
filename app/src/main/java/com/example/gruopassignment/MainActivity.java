package com.example.gruopassignment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        // clicked Barcode Reader Button
        ImageButton btnBarcode = findViewById(R.id.imageButtonBarcodeReader);
        btnBarcode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BarcodeReaderActivity.class);
                startActivity(intent);
            }
        });
        //click Content Reader Button
        ImageButton btncontent = findViewById(R.id.imageButtonContentReader);
        btncontent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ContentReaderActivity.class);
                startActivity(intent);
            }
        });
        //Clicked Text reader Button
        ImageButton btnTextReader = findViewById(R.id.imageButtonTextReader);
        btnTextReader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TextReaderActivity.class);
                startActivity(intent);
            }
        });
        //clicked List Of Analaysed images
        Button btnlistOfAnalaysedImages = findViewById(R.id.ButtonListOfAnalaysedImages);
        btnlistOfAnalaysedImages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ListViewActivity.class);
                startActivity(intent);
            }
        });
    }

}