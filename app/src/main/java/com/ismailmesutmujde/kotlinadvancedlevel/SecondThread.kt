package com.ismailmesutmujde.kotlinadvancedlevel

class SecondThread : Runnable{
    override fun run() {
        for (i in 200..299) {
            println("Second Thread : $i")
            Thread.sleep(100)
        }
    }
}