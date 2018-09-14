package com.github.anuarkaliyev23.api.doc.impl

import com.github.anuarkaliyev23.api.doc.HttpRequestMethod
import com.github.anuarkaliyev23.api.doc.interfaces.RequestDoc
import com.github.anuarkaliyev23.api.doc.interfaces.ResponseDoc
import io.javalin.security.Role

data class JavalinRequestDoc(override var method: HttpRequestMethod,
                        override var path: String,
                        override var headers: Map<String, String>,
                        override var body: String,
                        override var description: String,
                        override var successResponse: ResponseDoc,
                        override var failResponse: List<ResponseDoc>,
                        var permittedRoles: List<Role>) : RequestDoc {

}