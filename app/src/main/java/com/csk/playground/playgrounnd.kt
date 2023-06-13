package com.csk.playground
fun main(args: Array<String>) {
	println("Input your first name")
	val first_name = readLine()
	println("Input your last name")
	val last_name = readLine()
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