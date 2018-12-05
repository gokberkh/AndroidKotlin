package com.example.win10.kotlinuygulama

class User{

    //user sinifi ve parametrelerini tanımladik
    var id :Int = 0
    var name:String=" "
    var age:Int =0

    //yapici sinif oluşturduk yollacağımız veriler için
    constructor(name:String,age:Int){
        this.name=name
        this.age=age
    }

    constructor(){

    }



}