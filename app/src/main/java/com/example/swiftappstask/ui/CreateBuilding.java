package com.example.swiftappstask.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.swiftappstask.R;
import com.example.swiftappstask.adapter.MullakAdapter;
import com.example.swiftappstask.adapter.RecyclerClickListener;
import com.example.swiftappstask.adapter.SetData;
import com.example.swiftappstask.pojo.Model;
import com.example.swiftappstask.pojo.RequestID;
import com.example.swiftappstask.repositry.Repository;
import com.example.swiftappstask.viewModel.MullakViewModel;

import java.util.List;

public class CreateBuilding extends AppCompatActivity implements SetData {
    MullakViewModel mullakViewModel;
    Repository repository;
    Model model;
    private List<Model> getData;
    private MullakAdapter adapter;
    private RecyclerView recyclerView;
    RecyclerClickListener recyclerClickListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_building);

        recyclerView = findViewById(R.id.recyclerView);
        adapter = new MullakAdapter(this, recyclerClickListener);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            model = bundle.getParcelable("myDataObj");
            repository.postsData(model);

            mullakViewModel = new ViewModelProvider(this).get(MullakViewModel.class);
            mullakViewModel.postData().observe(this, new Observer<List<Model>>() {
                @Override
                public void onChanged(List<Model> models) {
                    adapter.setList(models);
                }
            });
        }
    }
    @Override
    public void setData(int pos, int UserID, boolean isSelect) {
        RequestID requestID = new RequestID();
        getData.get(pos).getUpdatedAt();
        mullakViewModel.postId(requestID);
    }

}