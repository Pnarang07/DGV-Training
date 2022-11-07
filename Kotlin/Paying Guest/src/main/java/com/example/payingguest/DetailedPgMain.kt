package com.example.payingguest

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.*
import androidx.appcompat.widget.AppCompatButton
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.app.NotificationCompat
import androidx.lifecycle.ViewModelProvider
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar


class DetailedPgMain : AppCompatActivity() {

//    Setting channel for my Notification

    private val channelId="com.example.notificationdemo.channel1"
    private var notificationManager: NotificationManager?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detailed_pgmain)

//        Getting id from intent
        var pgId = intent.getStringExtra("pgId")?.toInt()


//        Fetching ids from detailed_pgmain
//        var image = findViewById<ImageView>(R.id.dimage)
        var detailedLocation = findViewById<TextView>(R.id.detailedL)
        var detailedPgName = findViewById<TextView>(R.id.dpgname)
        var detailedFeatures = findViewById<TextView>(R.id.dfeatures)
        var booknow=findViewById<AppCompatButton>(R.id.booknow)
        var visitplace=findViewById<AppCompatButton>(R.id.visitplace)
        val viewPager=findViewById<ViewPager2>(R.id.viewPager)


//        object of PgData
        val pgdetails: PgData = ViewModelProvider(this).get(PgData::class.java)
//        object of Pg
        var pg: Pg = pgdetails.pgs.get(0)
        var index: Int = 0
        for (i in 0 until pgdetails.pgs.size) {
            if (pgdetails.pgs.get(i).id == pgId) {
                pg = pgdetails.pgs.get(i)
                index = i
            }
        }
//        setting layout
//        image.setImageResource(pg.image)
        detailedPgName.text = pg.pg_name
        detailedLocation.text = pg.detailLocation
        detailedFeatures.text = pg.features
        var imagesList=pg.imagesList

//             coding for swiper
        viewPager.adapter=ViewPagerAdapter(this,imagesList)

//        setting spinner
        val languages = resources.getStringArray(R.array.Languages)
        val spinner = findViewById<Spinner>(R.id.spinner)
        if (spinner != null) {
            val adapter = ArrayAdapter(
                this,
                android.R.layout.simple_spinner_item, languages
            )
            spinner.adapter = adapter

            spinner.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
                override fun onItemSelected(
                    parent: AdapterView<*>,
                    view: View, position: Int, id: Long
                ) {
//                    Toast.makeText(
//                        this@DetailedPgMain,
//                        getString(R.string.selected_item) + " " +
//                                "" + languages[position], Toast.LENGTH_SHORT
//                    ).show()
                }

                override fun onNothingSelected(p0: AdapterView<*>?) {
                    TODO("Not yet implemented")
                }
            }
        }
//
//        Setting Notification on click

        notificationManager=getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        createNotificationChannel(channelId,"Demo","This is Notification Demo")

        booknow.setOnClickListener{
            displayNotificationBook()
        }
        visitplace.setOnClickListener{
            displayNotificationVisit()
        }
    }


//    display notification function for booknow
fun displayNotificationBook()
{
    val notficationId=67

    val notification= NotificationCompat.Builder(this,channelId)
        .setSmallIcon(R.drawable.pglogo)
        .setContentTitle("PAYING GUEST")
        .setContentText("BOOKED SUCCESSFULLY")
        .setPriority(NotificationCompat.PRIORITY_HIGH)
        .setAutoCancel(true)
    notificationManager?.notify(notficationId,notification.build())
}

//    display notification function for visit now
    fun displayNotificationVisit()
    {
        val notficationId=67

        val notification= NotificationCompat.Builder(this,channelId)
            .setSmallIcon(R.drawable.pglogo)
            .setContentTitle("PAYING GUEST")
            .setContentText("WILL GET BACK TO YOU")
            .setPriority(NotificationCompat.PRIORITY_HIGH)
            .setAutoCancel(true)


        notificationManager?.notify(notficationId,notification.build())

    }


    //    createnotification function
    fun createNotificationChannel(id:String,name:String,descriptionText:String)
    {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val importance = NotificationManager.IMPORTANCE_HIGH
            val channel = NotificationChannel(id, name, importance).apply {
                description = descriptionText
            }
            // Register the channel with the system
            notificationManager?.createNotificationChannel(channel)

        }
    }


}