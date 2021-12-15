package com.example.swiftappstask;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.swiftappstask.adapter.MullakAdapter;
import com.example.swiftappstask.adapter.RecyclerClickListener;
import com.example.swiftappstask.pojo.Model;
import com.example.swiftappstask.ui.CreateBuilding;
import com.example.swiftappstask.viewModel.MullakViewModel;

import java.util.List;

public class MainActivity extends AppCompatActivity implements RecyclerClickListener {
    private MullakAdapter adapter ;
    MullakViewModel viewModel;
    RecyclerClickListener recyclerClickListener ;
    private RecyclerView recyclerView ;
    private List<Model> getData;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        adapter = new MullakAdapter(this ,recyclerClickListener);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        viewModel = new ViewModelProvider(this).get(MullakViewModel.class);
        viewModel.getData().observe(this, new Observer<List<Model>>() {
            @Override
            public void onChanged(List<Model> models) {
                adapter.setList(models);

            }
        });
    }

    @Override
    public void recyclerViewListClicked(int position) {
        Intent intent = new Intent(this, CreateBuilding.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("myDataObj",getData.get(position));
        intent.putExtras(bundle);
        startActivity(intent);
    }

}