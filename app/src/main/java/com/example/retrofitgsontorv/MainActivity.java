package com.example.retrofitgsontorv;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity
{
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=(RecyclerView) findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        Retrofit retrofit=new Retrofit.Builder().baseUrl("https://myprojectbd24.com/api/").
                addConverterFactory(GsonConverterFactory.create()).build();



        MyRetrofit myRetrofit= retrofit.create(MyRetrofit.class);
        Call<List<DataSet>> listCall=myRetrofit.getDataSet();
        listCall.enqueue(new Callback<List<DataSet>>() {
            @Override
            public void onResponse(Call<List<DataSet>> call, Response<List<DataSet>> response)
            {
                Show(response.body());

            }

            @Override
            public void onFailure(Call<List<DataSet>> call, Throwable t)
            {

            }
        });
    }

    private void Show(List<DataSet> body)
    {
        DataAdapter dataAdapter=new DataAdapter(body,getApplicationContext());
        recyclerView.setAdapter(dataAdapter);

    }
}
