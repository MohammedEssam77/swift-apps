package com.example.swiftappstask.apiService;

import com.example.swiftappstask.pojo.Model;
import com.example.swiftappstask.pojo.RequestID;

import java.util.List;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface MullakApiService {
    @GET("api/v3/mullak/basic-settings")
    Single<List<Model>> getData();

    @POST("api/v3/mullak/building/create")
    Observable<List<Model>> postData(@Body RequestID requestID);


}
