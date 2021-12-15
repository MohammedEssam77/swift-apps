package com.example.swiftappstask.repositry;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.swiftappstask.apiService.MullakApiService;
import com.example.swiftappstask.apiService.PostsClient;
import com.example.swiftappstask.pojo.Model;
import com.example.swiftappstask.pojo.RequestID;

import java.util.List;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class Repository {
    private PostsClient postsClient;
    public MullakApiService mullakApiService;
    public MutableLiveData<List<Model>> postsMutableLiveData = new MutableLiveData<>();
    private LiveData<List<Model>> postsData = null;
    private LiveData<List<Model>> postsId = null;


    private static final String TAG = "postRepositry";
    public LiveData<List<Model>> postsData(Model model) {
        return postsData;
    }
    public LiveData<List<Model>> postsId(RequestID requestID) {
        return postsId;
    }
    public Repository() {

        mullakApiService = postsClient.getRetrofit().create(MullakApiService.class);
    }

    public MutableLiveData<List<Model>> getData() {
        Single<List<Model>> observable = mullakApiService.getData()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());

        observable.subscribe(o -> postsMutableLiveData.setValue(o), e -> Log.d(TAG, "getPosts:" + e));
        return postsMutableLiveData;
    }

}
