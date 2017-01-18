package com.example.routengo1.presenter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

import com.example.routengo1.R;

public class TypeActivity extends AppCompatActivity {
    LinearLayout type1;
    LinearLayout type2;
    LinearLayout type3;
    LinearLayout type4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type);
        type1 = (LinearLayout) findViewById(R.id.type_1);
        type2 = (LinearLayout) findViewById(R.id.type_2);
        type3 = (LinearLayout) findViewById(R.id.type_3);
        type4 = (LinearLayout) findViewById(R.id.type_4);

        type1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TypeActivity.this, ObjectiveActivity.class);
                startActivity(intent);
            }
        });
        type2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TypeActivity.this, InterestActivity.class);
                startActivity(intent);
            }
        });
        type3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TypeActivity.this, ProximityActivity.class);
                startActivity(intent);
            }
        });
        type4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TypeActivity.this, PlaceActivity.class);
                startActivity(intent);
            }
        });
    }
}
