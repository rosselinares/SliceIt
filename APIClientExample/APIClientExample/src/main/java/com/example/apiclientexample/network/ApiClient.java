package com.example.apiclientexample.network;

import com.google.gson.Gson;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class ApiClient {
    private final OkHttpClient client = new OkHttpClient();

    public String getApiResponse(String url) throws Exception {
        Request request = new Request.Builder()
                .url(url)
                .build();

        try(Response response = client.newCall(request).execute()) {
            if(!response.isSuccessful()) throw new IOException("Unexpected code " + response);
            return response.body().toString();
        }
    }
}
