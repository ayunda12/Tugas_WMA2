package com.example.mynewrecyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    CourseAdapter adapter;
    ArrayList<Movies> objmovies = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerview);

        //menambahkan data ke dalamnya
        objmovies.add(new Movies("Gunung Gambir", "Gunung Gambir Jember menjadi salah satu spot " +
                "wisata yang sedang hits saat ini. Berlokasi di Jawa Timur, " +
                "menyuguhkan keindahan alam yang masih terihat asri dan seakan tidak pernah " +
                "tersentuh. Selain sering dijadikan sebagai spot foto yang Instagenic, lokasi ini " +
                "juga menawarkan tempat refreshing yang sangat nyaman. Kamu bisa menikmati indahnya " +
                "hamparan alam, suasana perkebunan teh, dan udara sejuk sambil menikmati hidangan hangat disana.", R.drawable.i1));
        objmovies.add(new Movies("Taman Botani Sukorambi", "Gunung Gambir Jember menjadi salah satu spot " +
                "wisata yang sedang hits saat ini. Berlokasi di Jawa Timur, " +
                "menyuguhkan keindahan alam yang masih terihat asri dan seakan tidak pernah " +
                "tersentuh. Selain sering dijadikan sebagai spot foto yang Instagenic, lokasi ini " +
                "juga menawarkan tempat refreshing yang sangat nyaman. Kamu bisa menikmati indahnya " +
                "hamparan alam, suasana perkebunan teh, dan udara sejuk sambil menikmati hidangan hangat disana.", R.drawable.i2));

        objmovies.add(new Movies("Pantai Papuma", "Taman Botani Sukorambi Jember memiliki fasilitas yang sangat " +
                "lengkap seperti kolam renang, pondok rapat gaharu, villa botani, area barbeque, horti hut, pondok seni, gazebo, restoran, " +
                "area outbound, dan wifi.", R.drawable.ii));

        objmovies.add(new Movies("Pantai Payangan", "Area Pantai Payangan ini begitu luas. Terdapat tiga bagian pantai " +
                "yang bisa dikunjungi. Bagian pertama adalah kawasan pantai nelayan yang menghadap ke arah barat daya. Bagian selanjutnya" +
                " berupa pantai dengan batu karang yang dipisahkan oleh sebuah bukit.", R.drawable.i4));


        //kita menginisialisasi class adaptor
        // dan meneruskan daftar array kita ke sana.
        adapter = new CourseAdapter(objmovies);
        // di bawah dua baris ini mengatur layoutmanager dan
        // adaptor ke tampilan recyclerview
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
    }
}