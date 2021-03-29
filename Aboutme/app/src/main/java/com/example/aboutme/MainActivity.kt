package com.example.aboutme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_login.*
import kotlin.math.pow

class MainActivity : AppCompatActivity() {
    var isNewOp = true
    var oldNumber  = ""
    var op = "+"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        println("login activity")
        if(editText == null){
            println("nhu con cac vay")
        }

        var buclick : String?  = editText.text.toString()
        println(buclick)

        if(eightButton == null){
            println("nhu con cac hon ")
        }
        println("login activity")
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

    fun numberEvent(view : View){
        if(isNewOp){
            editText.setText("")
            isNewOp = false
        }

        var buclick : String  = editText.text.toString()
        var buselect : Button = view as Button
        when (buselect.id){
            oneButton.id -> {buclick += "1"}
            twobutton.id -> {buclick += "2"}
            threeButton.id -> {buclick += "3"}
            fourButton.id -> {buclick += "4"}
            fiveButton.id -> {buclick += "5"}
            sixButton.id -> {buclick += "6"}
            sevenButton.id -> {buclick += "7"}
            eightButton.id -> {buclick += "8"}
            nineButton.id -> {buclick += "9"}
            zeroButton.id -> {buclick += "0"}
            pointButton.id -> {buclick += "."}
            plusMinusButton.id -> {buclick = "-$buclick"}
        }
        editText.setText(buclick)
    }

    fun operatorEvent( view: View){
        isNewOp = true
        oldNumber = editText.text.toString()
        editText.setText("")
        var buselect : Button = view as Button
        when(buselect.id){
            multiplyButton.id -> {op = "*"}
            plusButton.id -> {op = "+"}
            minusButton.id -> {op = "-"}
            devide.id -> {op = "/"}
            exponent.id -> {op = "^"}
        }
    }

    fun equalEvent(view : View){
        var newnumber : String = editText.text.toString()
        var result = 0.0
        when (op) {
            "+" -> {result = oldNumber.toDouble() + newnumber.toDouble()}
            "-" -> {result = oldNumber.toDouble() - newnumber.toDouble()}
            "*" -> {result = oldNumber.toDouble() * newnumber.toDouble()}
            "/" -> {result = oldNumber.toDouble() / newnumber.toDouble()}
            "^" -> {result = oldNumber.toDouble().pow(newnumber.toDouble())}
        }
        editText.setText(result.toString())
    }

    fun clearEvent(view: View) {
        isNewOp = true
        editText.setText("")
    }


}