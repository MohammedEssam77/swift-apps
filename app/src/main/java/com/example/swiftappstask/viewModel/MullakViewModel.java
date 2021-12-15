package com.example.swiftappstask.viewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.swiftappstask.pojo.Model;
import com.example.swiftappstask.pojo.RequestID;
import com.example.swiftappstask.repositry.Repository;

import java.util.List;

public class MullakViewModel extends ViewModel {
    public Repository repository;
    public Model model;
    public RequestID requestID ;
    public MullakViewModel() {
        repository = new Repository();
    }

    public MutableLiveData<List<Model>> getData() {
        return repository.getData();
    }

    public LiveData<List<Model>> postData() {
        return repository.postsData(model);
    }
    public LiveData<List<Model>> postId(RequestID requestID) {
        return repository.postsId(this.requestID);
    }
}
