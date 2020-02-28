/*
Juan José Díaz André | A01066352
Problem 22
Algorithm:
First you get a "from" number and a "to" number
then you take the "from" number as the beginning of the loop
you iterate adding the index number into a list until you get to the "to" number
you return the list.

You could use this to build fast number lists

Test Cases:
    Given:
        range from 4 to 9
    Made by student:
        range from 1 to 10
        range from 13 to 21

*/
package com.example.testproject

fun range(from: Int, to: Int): List<Int> {
    val numbers = mutableListOf<Int>()
    var index = from
    while(index <= to){
        numbers.add(index)
        index++
    }
    return numbers
}

println(range(4, 9))
println(range(1, 10))
println(range(13, 21))