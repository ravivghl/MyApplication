package com.example.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.myapplication.retrofit.APIclient
import com.example.myapplication.retrofit.APIinterFace
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    //GET ALL COMPLETED ORDERS
    private fun getOrders() {

        val rbLoadProducts = APIclient.getClient()!!.create(APIinterFace.RB_loadOrders::class.java)

        val call = rbLoadProducts.responce("", "canceled")

        call.enqueue(object : Callback<ResponseBody> {
            override fun onResponse(call: Call<ResponseBody>, response: Response<ResponseBody>) {


            }

            override fun onFailure(call: Call<ResponseBody>, t: Throwable) {


            }
        })


    }
}
