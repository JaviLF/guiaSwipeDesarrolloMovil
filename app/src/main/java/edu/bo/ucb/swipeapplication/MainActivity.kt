package edu.bo.ucb.swipeapplication

import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.constraintlayout.widget.ConstraintSet
import java.util.*
import android.text.Layout
import android.view.View
import android.widget.TextView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout

class MainActivity : AppCompatActivity() {

    companion object{
        var TAG:String = MainActivity.javaClass.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lateinit var swipeToRefreshLayout:SwipeRefreshLayout
        swipeToRefreshLayout = this.findViewById(R.id.swipeToRefreshLayout)
        val message_text_view = findViewById<TextView>(R.id.message_text_view)
        swipeToRefreshLayout.setOnRefreshListener {
            message_text_view.text = Random().nextInt(100).toString()
            swipeToRefreshLayout.isRefreshing = false
            Log.d(TAG, message_text_view.text.toString())
        }
    }
}