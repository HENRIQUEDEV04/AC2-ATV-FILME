package com.example.atividade2;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import com.example.atividade2.Adapter.FilmeAdapter;
import com.example.atividade2.model.Filme;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private FilmeAdapter filmeAdapter;
    private List<Filme> filmeList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerViewFilmes);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        filmeList = new ArrayList<>();
        filmeList.add(new Filme("Carros", 2006, "John Lasseter", R.drawable.poster_filme1));
        filmeList.add(new Filme("Carros 2", 2011, "John Lasseter", R.drawable.poster_filme2));
        filmeList.add(new Filme("Filme 3", 2017, "Brian Fee", R.drawable.poster_filme3));



        filmeAdapter = new FilmeAdapter(filmeList);
        recyclerView.setAdapter(filmeAdapter);
    }
}

