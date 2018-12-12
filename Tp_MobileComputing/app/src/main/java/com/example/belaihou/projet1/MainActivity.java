package com.example.belaihou.projet1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button;
  public NameAdapter nameAdabter;
  LinearLayoutManager linearLayoutManager;
  RecyclerView recyclerView;

    @Override
    public <T extends View> T findViewById(int id) {
        return super.findViewById(id);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
      nameAdabter=new NameAdapter();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,FormActivity.class);
                startActivity(intent);
            }
        });
        linearLayoutManager= new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView=findViewById(R.id.rec);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(nameAdabter);
    }

    @Override
    protected void onResume() {
        super.onResume();
        nameAdabter.updateData(DataManager.getINSTANCE().getName());
    }
}
