package com.csk.playground

import java.util.stream.Collectors
import kotlin.math.abs


	fun main(args: Array<String>) {
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


fun main2(args: Array<String>) {
	
	/* val ans = queries.parallelStream()
		.map { query: Int -> Main.getValue(arr, query) }
		.map { obj: Int? -> java.lang.String.valueOf(obj) }
		.collect(Collectors.joining(" "))
	println(ans) */
	//println("Hi, Enter Total animals and Capacity  separated by space.")
	val (animals, capacity) = readLine()!!.split(' ').map(String::toInt)
	//println("Enter space-separated numbers:")
	val input = readLine()?.trim() ?: ""
	val numbers = input.split(" ").map { it.toInt() }
	println(minEnergy(animals, capacity, numbers))
}

fun minEnergy(n: Int, x: Int, arr1: List<Int>) : Int{
	val arr =arr1.sortedDescending()
	return if (x == n) {
		arr[x - 1]
	} else if (arr[x - 1] == arr[x]) {
		-1
	} else {
		arr[x - 1]
	}
}


fun main1(args: Array<String>) {
	println("Input your first name")
	var first_name = readLine()
	println("Input your last name")
	var last_name = readLine()
	println("Hi $first_name $last_name, let us have a quick math test. Enter two numbers separated by space.")
	val (a, b) = readLine()!!.split(' ').map(String::toInt)
	println("what is $a + $b ?")
	println("Your answer is ${if (readLine()!!.toInt() == (a+b)) "correct" else "incorrect"}")
	println("Correct answer = ${a+b}")
	println("what is $a * $b ?")
	println("Your answer is ${if (readLine()!!.toInt() == (a*b)) "correct" else "incorrect"}")
	println("Correct answer = ${a*b}")
	println("Thanks for participating :)")
}