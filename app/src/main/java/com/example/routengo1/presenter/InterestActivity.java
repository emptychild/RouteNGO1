package com.example.routengo1.presenter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.routengo1.R;
import com.example.routengo1.adapter.ItemAdapter;
import com.example.routengo1.model.Item;

import java.util.Arrays;
import java.util.List;

public class InterestActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interests);

        recyclerView = (RecyclerView) findViewById(R.id.interest_view);

        List<Item> items = Arrays.asList(
                new Item("Изобразительное искусство", ""),
                new Item("Музыка", ""),
                new Item("Спорт", ""),
                new Item("История", ""),
                new Item("Наука", "")
        );

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new ItemAdapter(items));
    }
}
