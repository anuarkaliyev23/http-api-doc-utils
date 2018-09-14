package com.github.anuarkaliyev23.api.doc.impl

import com.github.anuarkaliyev23.api.doc.HttpRequestMethod
import com.github.anuarkaliyev23.api.doc.interfaces.RequestDoc
import com.github.anuarkaliyev23.api.doc.interfaces.ResponseDoc

/**
 * This class is a simple implementation of [RequestDoc].
 *
 * @since 1.0-SNAPSHOT
 * @author Dussaliyev Khambar
 * */
data class SimpleRequestDoc(override var method: HttpRequestMethod,
                            override var path: String,
                            override var body: String,
                            override var description: String,
                            override var successResponse: ResponseDoc,
                            override var headers: Map<String, String>,
                            override var failResponse: List<ResponseDoc>) : RequestDoc {

}