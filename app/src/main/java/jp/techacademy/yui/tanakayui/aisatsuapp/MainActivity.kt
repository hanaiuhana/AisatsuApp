package jp.techacademy.yui.tanakayui.aisatsuapp

import android.app.TimePickerDialog
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TimePicker
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() ,View.OnClickListener{
    private var hour= 0
    private var minute= 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener(this)

    }

    override fun onClick(v : View){
        showTimePickerDialog()
//        judgeAisatsu(showTimePickerDialog())
//        Log.d("testtest","hour" + hour)
    }

    private fun showTimePickerDialog():Int{
        val timePickerDialog = TimePickerDialog(
            this,TimePickerDialog.OnTimeSetListener {
                    view,
                    hour,
                    minute -> judgeAisatsu(hour)
            },0,0,true
        )
        timePickerDialog.show()
//        val timePicker = TimePicker(this)
//        hour = timePicker.hour
//        minute = timePicker.minute
        return hour
    }
    private fun judgeAisatsu(hour :Int){
        if(hour >= 2 && hour <= 9){
            textView.text = "おはよう"
            Log.d("testtest","おはよう")

        }else if(hour >= 10 && hour <= 17){
            textView.text = "こんにちは"
            Log.d("testtest","こんにちは")


        }else if(hour >= 18 || hour <= 1){
            textView.text = "こんばんは"
            Log.d("testtest","こんばんは")


        }
    }
}
