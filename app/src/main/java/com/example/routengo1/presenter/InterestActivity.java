package com.example.routengo1.presenter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.example.routengo1.R;
import com.example.routengo1.adapter.ItemAdapter;
import com.example.routengo1.model.Unit;

import java.util.Arrays;
import java.util.List;

public class InterestActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interests);

        button = (Button) findViewById(R.id.i_ok_btn);
        recyclerView = (RecyclerView) findViewById(R.id.interest_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<Unit> items = Arrays.asList(
                new Unit("Изобразительное искусство", ""),
                new Unit("Музыка", ""),
                new Unit("Спорт", ""),
                new Unit("История", ""),
                new Unit("Наука", "")
        );
        recyclerView.setAdapter(new ItemAdapter(items));

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InterestActivity.this, ResultActivity.class);
                startActivity(intent);
            }
        });
    }
}
