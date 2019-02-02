package com.example.myapplication.retrofit

import java.io.IOException

import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


/**
 * Created by User on 4/13/2017.
 */

object APIclient {

    // public static final String BASE_URL = "https://mobile-2usmdia-o3cgj3skbznio.ap-3.magentosite.cloud/";
    val BASE_URL = "https://mc-staging.mysupply.me/"
    val URL = BASE_URL + "rest/V1/"


    private var retrofit: Retrofit? = null


    /*public static Retrofit getClient() {
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }*/

    var client = OkHttpClient.Builder()
            .addInterceptor { chain ->
                val builder = chain.request().newBuilder()

                builder.addHeader("code", "")


                chain.proceed(builder.build())
            }
            .build()


    fun getClient(): Retrofit? {
        if (retrofit == null) {
            retrofit = Retrofit.Builder()
                    .baseUrl(URL)
                    /*  .client(client)*/
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
        }
        return retrofit
    }


}
