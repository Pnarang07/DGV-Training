package com.example.payingguest

class Pg(pg_name:String,location:String,price:String,features:String,image:Int,detailLocation:String,id:Int,imagesList: List<Int>,location1:String){
    val pg_name:String
    var location:String=""
    var price:String=""
    val features:String
    var image:Int=0
    var detailLocation:String=""
    val id:Int
    var imagesList:List<Int> = listOf()
    var location1:String=""

    init{
        this.pg_name=pg_name
        this.location=location
        this.price=price
        this.features=features
        this.image=image
        this.detailLocation=detailLocation
        this.id=id
        this.imagesList=imagesList
        this.location1=location1
    }
}

