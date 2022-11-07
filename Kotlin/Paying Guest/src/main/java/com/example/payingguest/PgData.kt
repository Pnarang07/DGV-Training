package com.example.payingguest

import androidx.lifecycle.ViewModel

class PgData:ViewModel() {

    var pgs= mutableListOf<Pg>(
        Pg("EINSTEIN","Nerul","10500/bed","2 Bedrooms,2bathrooms,FullyFurnished,950sq.ft",R.drawable.livingroom1,"Nerul-East Sector 4",1,listOf<Int>(R.drawable.livingroom1,R.drawable.pg1_1,R.drawable.pg1_2,R.drawable.pg1_3,R.drawable.pg1_4,R.drawable.pg1_5),"nerul"),
        Pg("CODE","Sanpada","9500/bed","3 Bedrooms,3Bathrooms,SemiFurnished,1050sq.ft,Parking Available",R.drawable.pg2,"Sanpada-West Sector-22 Near D-Mart",2,listOf<Int>(R.drawable.pg2_1,R.drawable.pg2_2,R.drawable.pg2,R.drawable.pg2_3,R.drawable.pg2_4),"sanpada"),
        Pg("BACKBENCHER","Nerul","12000/bed","2 Bedrooms,2Bathrooms,750sq.ft,FullyFurnished,Parking Available",R.drawable.pg3,"Nerul-East .5km from station",3,listOf<Int>(R.drawable.pg3_1,R.drawable.pg3_2,R.drawable.pg3_4,R.drawable.pg3),"nerul"),
        Pg("BEDS FRIENDS","Belapur","7000/bed","1 Bedroom,1Bathroom,Semifurished,1050sq.ft,inculded breakfast",R.drawable.pg4,"Belapur near Inorbit Mall",4,listOf<Int>(R.drawable.pg2_1,R.drawable.pg2_2,R.drawable.pg4,R.drawable.pg2_3,R.drawable.pg2_4),"belapur"),

        Pg("MR.BEAN","Nerul","5500/bed","2 Bedrooms,2bathrooms,FullyFurnished,850sq.ft",R.drawable.pg5,"Nerul-East Sector-15 near station",5,listOf<Int>(R.drawable.pg4_1,R.drawable.pg4_2,R.drawable.pg4,R.drawable.pg4_3,R.drawable.pg2_4),"nerul"),
        Pg("SHINCHAN","Belapur","6000/bed","1 Bedroom,1Bathroom,FullyFurished,700sq.ft,Laundry,Parking Avaiable",R.drawable.pg6,"Belapur-West Sector-2 local market",6,listOf<Int>(R.drawable.pg3_1,R.drawable.pg3_2,R.drawable.pg3_4,R.drawable.pg3),"belapur"),
        Pg("DOREMON","Belapur","11000/bed","2 Bedrooms,2Bathrooms,SemiFurished,900sq.ft",R.drawable.pg7,"Belapur-East Sector-32 1.5km from station",7,listOf<Int>(R.drawable.pg5_1,R.drawable.pg15,R.drawable.pg5_2,R.drawable.pg5_3,R.drawable.pg5_4),"belapur"),
        Pg("SLEEPAHOLIC","Khoparkhairane","4500/bed","1 Bedroom,1Bathroom,unfurnished,1050sq.ft,Parking Available",R.drawable.pg17,"KopharKhairane-South Sector-1 near Inorbit Mall",8,listOf<Int>(R.drawable.pg17_1,R.drawable.pg17_2,R.drawable.pg17_4,R.drawable.pg17,R.drawable.pg17_3,R.drawable.pg17_5),"khoparkhairane"),
        Pg("RICHKIDS","Nerul","13000/bed","2 Bedrooms,2bathrooms,FullyFurnished,950sq.ft",R.drawable.pg8,"Nerul-North Sector 24 5km from station",9,listOf<Int>(R.drawable.pg5_1,R.drawable.pg5_2,R.drawable.pg8,R.drawable.pg5_3,R.drawable.pg5_4),"nerul"),

        Pg("BEDBOX","Khoparkhairane","5500/bed","3 Bedrooms,3Bathrooms,SemiFurished,1050sq.ft",R.drawable.pg10,"KhoparKhairane-West Sector-14 near cineam hall",10,listOf<Int>(R.drawable.pg1_1,R.drawable.pg10,R.drawable.pg1_2,R.drawable.pg1_3,R.drawable.pg1_4,R.drawable.pg1_5),"khoparkhairane"),
        Pg("BLACK LAVA","Ghansoli","7000/bed","2 Bedrooms,2Bathrooms,FullyFurished,750sq.ft,Wifi,Parking Available,SwimmingPool",R.drawable.pg11,"Ghansoli Sector-22 near rajesh nagar",11,listOf<Int>(R.drawable.pg3_1,R.drawable.pg3_2,R.drawable.pg3_4,R.drawable.pg3),"ghansoli"),
        Pg("BAGPACKERS","Khoparkhairane","13000/bed","3 Bedrooms,3Bathrooms,SemiFurished,1050sq.ft",R.drawable.pg12,"KoparKhairane Sector-11 near Royal resturant",12,listOf<Int>(R.drawable.pg5_1,R.drawable.pg15,R.drawable.pg5_2,R.drawable.pg5_3,R.drawable.pg5_4),"khoparkhairane"),
        Pg("CUBIC","Seawoods","14000/bed","2 Bedrooms,2bathrooms,FullyFurnished,950sq.ft",R.drawable.pg13,"Seawoods-West Sector 2 near seawoods mall",13,listOf<Int>(R.drawable.pg17_1,R.drawable.pg17_2,R.drawable.pg17_4,R.drawable.pg13,R.drawable.pg17_3,R.drawable.pg17_5),"seawoods"),
        Pg("DRAGON DIVE","Ghansoli","5600/bed","3 Bedrooms,3Bathrooms,SemiFurished,1050sq.ft",R.drawable.pg14,"Ghansoli Sector-4 near 1km from station",14,listOf<Int>(R.drawable.pg2_1,R.drawable.pg2_2,R.drawable.pg4,R.drawable.pg2_3,R.drawable.pg2_4),"ghansoli"),
        Pg("BUNKERS","Seawoods","9500/bed","2 Bedrooms,2Bathrooms,FullyFurished,750sq.ft",R.drawable.pg15,"Seawoods-East Sector-25 near CinemaHall",15,listOf<Int>(R.drawable.pg5_1,R.drawable.pg15,R.drawable.pg5_2,R.drawable.pg5_3,R.drawable.pg5_4),"seawoods"),
        Pg("NOOBS","Seawoods","15000/bed","3 Bedrooms,3Bathrooms,SemiFurished,1050sq.ft,SwimmingPool,Circket Playground",R.drawable.pg16,"Seawoods-West Sector-3 near Bajaj corners",16,listOf<Int>(R.drawable.pg2_1,R.drawable.pg2_2,R.drawable.pg2,R.drawable.pg2_3,R.drawable.pg2_4),"seawoods")
    )
}