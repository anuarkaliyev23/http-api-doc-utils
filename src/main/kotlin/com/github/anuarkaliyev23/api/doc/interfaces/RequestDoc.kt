package com.github.anuarkaliyev23.api.doc.interfaces

import com.github.anuarkaliyev23.api.doc.HttpRequestMethod

/**
 * This interface must represent HTTP API request documentation.
 *
 * @since 1.0-SNAPSHOT
 * @author Dussaliyev Khambar
 * */
interface RequestDoc {
    var method: HttpRequestMethod
    var path: String
    var headers: Map<String, String>
    var body: String
    var description: String
    var successResponse: ResponseDoc
    var failResponse: List<ResponseDoc>
}