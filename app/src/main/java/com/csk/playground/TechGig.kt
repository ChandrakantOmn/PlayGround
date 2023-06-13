package com.csk.playground

import java.util.stream.Collectors
import kotlin.math.abs

object TechGig {
	
	fun forestProblem() {
		println("Hi, Enter Total animals and Capacity  separated by space.")
		val (animals, capacity) = readLine()!!.split(' ').map(String::toInt)
		println("Enter space-separated numbers:")
		val input = readLine()?.trim() ?: ""
		val numbers = input.split(" ").map { it.toInt() }
		println(minEnergy(animals, capacity, numbers))
	}
	
	private fun minEnergy(n: Int, x: Int, arr1: List<Int>) : Int{
		val arr =arr1.sortedDescending()
		return if (x == n) {
			arr[x - 1]
		} else if (arr[x - 1] == arr[x]) {
			-1
		} else {
			arr[x - 1]
		}
	}
	
	
	fun magicWandProblem() {
		val (n , m) = readLine()!!.split(' ').map(String::toInt)
		val input = readLine()?.trim() ?: ""
		val arr = input.split(" ").map { it.toInt() }
		val input2 = readLine()?.trim() ?: ""
		val queries = input2.split(" ").map { it.toInt() }
		if(n== arr.size && m== queries.size){
			val b= queries.parallelStream()
				.map { q -> getValue(arr, q) }
				.map { it.toString()}
				.collect(Collectors.joining(" "))
			println(b)
		}
		
	}
	
	private fun getValue(arr: List<Int>, target: Int): Int {
		arr.stream().mapToInt { abs(it - target ) }.sum()
		return arr.stream().mapToInt { i: Int -> abs(i - target) }.sum()
	}
	
	
}