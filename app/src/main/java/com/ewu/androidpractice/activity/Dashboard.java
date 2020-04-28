package com.ewu.androidpractice.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ewu.androidpractice.databaseAdapter.DatabaseAdapter;
import com.ewu.androidpractice.R;
import com.ewu.androidpractice.adapter.DataAdapter;
import com.ewu.androidpractice.model.Datamodel;

import java.util.List;

public class Dashboard extends AppCompatActivity {

    private RecyclerView recyclerView;
    private DataAdapter dataAdapter;
    DatabaseAdapter databaseAdapter;
    private List<Datamodel> datamodels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        databaseAdapter = new DatabaseAdapter(this);

        recyclerView = (RecyclerView)findViewById(R.id.users);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        datamodels = databaseAdapter.getData();
        dataAdapter = new DataAdapter(datamodels);
        recyclerView.setAdapter(dataAdapter);

    }
}
