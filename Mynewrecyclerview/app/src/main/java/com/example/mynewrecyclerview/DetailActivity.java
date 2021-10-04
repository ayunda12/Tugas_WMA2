package com.example.mynewrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    //deklarasikan textview
    TextView judul,Keterangan;
    ImageView gambar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // untuk mengakses id textview
        judul = findViewById(R.id.idjudul);
        Keterangan = findViewById(R.id.idTVketerangan);
        gambar = findViewById(R.id.idgambar);


        Movies movies = getIntent().getParcelableExtra("MOVIES");
        // untuk menampilkan data sesuai yang diambil
        judul.setText(movies.getCourse_name());
        Keterangan.setText(movies.getKeterangan());
        gambar.setImageResource(movies.getCourse_image());
    }
}