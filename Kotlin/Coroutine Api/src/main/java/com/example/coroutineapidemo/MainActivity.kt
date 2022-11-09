package com.example.coroutineapidemo

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.coroutineapidemo.controlers.ApiInterface
import com.example.coroutineapidemo.models.MainData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.Retrofit
import kotlin.math.log10

class MainActivity : AppCompatActivity() {
    private lateinit var recyler:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyler=findViewById(R.id.rcl)
        var service=ApiUtilites.getInstance().create(ApiInterface::class.java)

        GlobalScope.launch {

            var response=service.getData()
                if (response.isSuccessful) {
                    withContext(Dispatchers.Main) {
                        Log.d("response", "{${response.body()}}")
                        setAdapter(response.body()!!)
                    }

                }
            }

        }


    fun setAdapter(data:List<MainData>){
        var adapter=ListAdapter(this,data)
        recyler.layoutManager = LinearLayoutManager(this)
        recyler.adapter=adapter



    }
}

