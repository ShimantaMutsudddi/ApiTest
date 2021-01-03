package com.example.retrofitgsontorv;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MyRetrofit
{
    @GET ("get_data.php")

        Call<List<DataSet>> getDataSet();
}
