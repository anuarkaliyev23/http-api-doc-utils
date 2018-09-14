package com.github.anuarkaliyev23.api.doc.impl

import com.github.anuarkaliyev23.api.doc.interfaces.ResponseDoc
import org.junit.jupiter.api.Test

class SimpleResponseDocTest {

    @Test
    fun test() {
        val status = 200
        val body = """{"name" : "Khambar", "age" : "21"}"""
        val description = "This response returns JSON representation of User"
        val headers = HashMap<String, String>()
        val response : ResponseDoc = SimpleResponseDoc(status = status, body = body, description = description, headers = headers)

        println(response)
    }
}