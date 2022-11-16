package com.zebrano.finlosses

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.zebrano.finlosses.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingObject : ActivityMainBinding
    val finLosses = arrayOf(10000,2000,30000,2300,45000,3100)
    val earnVals = arrayOf(15000,345,300,1000,752,80)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingObject = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingObject.root)

        Log.d("AppLog", "Calculation of real income:")
        val incomeList = ArrayList<String>()
        val names = resources.getStringArray(R.array.names)
        for ((index, name) in names.withIndex()) {
            incomeList.add("$name: ${earnVals[index]-finLosses[index]}\n")
            Log.d("AppLog", "Stat -/- ${incomeList[index]}")
        }
    }
}