package com.example.win10.kotlinuygulama

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val context =this
        var db =Database(context)


        btn_ekle.setOnClickListener({
            if(isim.text.toString().length>0 &&
                    numara.text.toString().length>0){
                var user = User(isim.text.toString(),numara.text.toString().toInt())

                db.insertData(user)

            }else
                Toast.makeText(context,"Lütfen Doldurunuz..",Toast.LENGTH_SHORT).show()

        })

        btn_oku.setOnClickListener({
            var data=db.readData()
            goster.text=""
            for(i in 0..(data.size-1)){
                goster.append(data.get(i).id.toString()+ " "+data.get(i).name + " " + data.get(i).age +"\n" )
            }
        })
    }
}
