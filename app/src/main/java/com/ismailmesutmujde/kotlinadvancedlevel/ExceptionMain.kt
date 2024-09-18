package com.ismailmesutmujde.kotlinadvancedlevel

import java.lang.ArithmeticException

fun main() {

    val x = 10
    val y = 5
    val array = Array<Int>(2) {0} // [0, 0]

    try {
        println("Result : ${x/y}")
        println("Transaction Completed.")
        array[4] = 8
    } catch (e:ArithmeticException) {
        println("Any number cannot be divided by zero.")
    } catch (e:ArrayIndexOutOfBoundsException) {
        println("You have exceeded size of array.")
    }


}