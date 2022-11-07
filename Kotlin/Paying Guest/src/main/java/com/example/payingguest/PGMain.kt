package com.example.payingguest

import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar


class PGMain: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pg_main)

        //recylerview getting the recycler view by its id
        var recyler=findViewById<RecyclerView>(R.id.recycler)
        //        creating pgData object of PgData
        var pGData:PgData= ViewModelProvider(this).get(PgData::class.java)

//        buttons getting the button view by its id
        var searchButton=findViewById<FloatingActionButton>(R.id.searchButton)
        var searchLocation=findViewById<EditText>(R.id.searchLocation)
        val cl=findViewById<ConstraintLayout>(R.id.cl)

        //Searching Location
            searchButton.setOnClickListener {
                if(searchLocation.text.toString()!="") {
                    var List = mutableListOf<Pg>()
                    for (i in 0 until pGData.pgs.size) {
                        if (pGData.pgs.get(i).location1 == searchLocation.text.toString().toLowerCase()) {
                            List.add(pGData.pgs[i])
                        }
                    }
                    recyler.adapter = PGMainAdapter(this, List)
                }
                else{
                    val snackBar= Snackbar.make(cl, "Enter Your Location",Snackbar.LENGTH_LONG)
                    snackBar.show()
                }
            }

        //passing list to pgmainadapter
        recyler.adapter = PGMainAdapter(this,pGData.pgs)

        //this creates a vertical layout manager
        recyler.layoutManager = LinearLayoutManager(this)



    }
}