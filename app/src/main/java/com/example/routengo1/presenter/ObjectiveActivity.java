package com.example.routengo1.presenter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.routengo1.R;
import com.example.routengo1.adapter.ItemAdapter;
import com.example.routengo1.model.Unit;

import java.util.Arrays;
import java.util.List;

public class ObjectiveActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_objectives);
        recyclerView = (RecyclerView) findViewById(R.id.objective_view);

        List<Unit> items = Arrays.asList(
                new Unit("Достопримечательности", ""),
                new Unit("Красивые места", ""),
                new Unit("Шоппиг", ""),
                new Unit("Барный марафон", "")
        );

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new ItemAdapter(items));

    }
}
