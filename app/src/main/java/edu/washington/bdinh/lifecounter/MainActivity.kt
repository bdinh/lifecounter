package edu.washington.bdinh.lifecounter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClick(v: View) {
        when (v.id) {
            p1add1.id -> updatePlayerTextView(p1life, 1, p1label)
            p1sub1.id -> updatePlayerTextView(p1life, -1, p1label)
            p1add5.id -> updatePlayerTextView(p1life, 5, p1label)
            p1sub5.id -> updatePlayerTextView(p1life, -5, p1label)
            p2add1.id -> updatePlayerTextView(p2life, 1, p2label)
            p2sub1.id -> updatePlayerTextView(p2life, -1, p2label)
            p2add5.id -> updatePlayerTextView(p2life, 5, p2label)
            p2sub5.id -> updatePlayerTextView(p2life, -5, p2label)
            p3add1.id -> updatePlayerTextView(p3life, 1, p3label)
            p3sub1.id -> updatePlayerTextView(p3life, -1, p3label)
            p3add5.id -> updatePlayerTextView(p3life, 5, p3label)
            p3sub5.id -> updatePlayerTextView(p3life, -5, p3label)
            p4add1.id -> updatePlayerTextView(p4life, 1, p4label)
            p4sub1.id -> updatePlayerTextView(p4life, -1, p4label)
            p4add5.id -> updatePlayerTextView(p4life, 5, p4label)
            p4sub5.id -> updatePlayerTextView(p4life, -5, p4label)
        }
    }

    fun updatePlayerTextView(v: TextView, update: Int, l: TextView) {
        val currentLife: Int = v.text.toString().toInt()
        val updateLife: Int = currentLife + update
        v.text = updateLife.toString()

        if (updateLife <= 0) {
            endDisplay.visibility = View.VISIBLE
            val losingDisplay: String = l.text.toString() + " LOSES!"
            endDisplay.text = losingDisplay
        } else {
            endDisplay.visibility = View.INVISIBLE
        }
    }
}
