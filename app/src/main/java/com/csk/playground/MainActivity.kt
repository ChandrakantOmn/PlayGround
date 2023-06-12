package com.csk.playground

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.util.Arrays
import java.util.stream.Collectors


class MainActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		var minP= getMinimumEnergyLevel(5, 4, listOf<Int>(1,3,2,4,5))
		Log.d("DATA", "$minP")
		
	}
	
	private fun getMinimumEnergyLevel(noOfAnimal: Int, capacity: Int, listOf: List<Int>): Int{
		val list = listOf.sorted()
		val p= list.takeLast(capacity)
			if (p.size== capacity){
				return p[0]
			}
		return  -1
	}
	
	
	
	
}