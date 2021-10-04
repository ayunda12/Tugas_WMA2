package com.example.mynewrecyclerview;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public class CourseAdapter extends RecyclerView.Adapter<CourseAdapter.Viewholder> {

//    private Context context;
    ArrayList<Movies> arrayListMovies;

    // Constructor
    public CourseAdapter(ArrayList<Movies> arrayListMovies) {
        this.arrayListMovies = arrayListMovies;
    }


    @NonNull
    @Override
    public CourseAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // untuk inflate layout untuk setiap item dari recycler view.
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout, parent, false);
        return new Viewholder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull CourseAdapter.Viewholder holder, int position) {

    //untuk mengatur data ke tampilan teks dan tampilan gambar dari setiap tata letak card
        final Movies movies = arrayListMovies.get(position);

        //untuk menampilkan(settext) nilai yang tersimpan  didalam array
        holder.judul.setText(movies.getCourse_name());
        holder.gambar.setImageResource(movies.getCourse_image());

        //untuk memberikan action ketika diklik muncul detailnya
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //melempar nilai menggunakan intent agar bisa ditangkap oleh detailmovie
                Intent intent = new Intent(holder.itemView.getContext(), DetailActivity.class);
                //kode ini yang nantinya dipanggil di detail movie untuk ditampilkan
                intent.putExtra("MOVIES",movies);

                //akan menjalankan perpindahan main activity ke detail movie
                holder.itemView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        // metode ini digunakan untuk menampilkan angka
        // item card dalam tampilan recyclerview.
        return arrayListMovies.size();
    }
    //Lihat kelas holder untuk inisialisasi
    // tampilan Anda seperti TextView dan Imageview.
    public class Viewholder extends RecyclerView.ViewHolder {
        //deklarasikan widget/view didalam item
        ImageView gambar;
        TextView judul, Keterangan;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            gambar = itemView.findViewById(R.id.idgambar);
            judul = itemView.findViewById(R.id.idjudul);
            Keterangan = itemView.findViewById(R.id.idTVketerangan);
        }
    }
}
