package com.github.anuarkaliyev23.api.doc.impl

import com.github.anuarkaliyev23.api.doc.HttpRequestMethod
import com.github.anuarkaliyev23.api.doc.interfaces.RequestDoc
import com.github.anuarkaliyev23.api.doc.interfaces.ResponseDoc
import org.junit.jupiter.api.Test

class SimpleRequestDocTest {

    @Test
    fun test() {
        val responseStatus = 200
        val responseBody = """{"name" : "Khambar", "age" : "21"}"""
        val responseDescription = "This response returns JSON representation of User"
        val responseHeaders = HashMap<String, String>()
        val response : ResponseDoc = SimpleResponseDoc(status = responseStatus, body = responseBody, description = responseDescription, headers = responseHeaders)


        val requestMethod = HttpRequestMethod.GET
        val requstPath = "v1/users/:user_id"
        val requestHeaders = HashMap<String, String>()
        val requestBody = ""
        val description = "This method is used to get information about specific user"

        val request : RequestDoc = SimpleRequestDoc(method = requestMethod, path = requstPath, headers = requestHeaders, body = requestBody, successResponse = response, description = description)
        println(request)
    }

}