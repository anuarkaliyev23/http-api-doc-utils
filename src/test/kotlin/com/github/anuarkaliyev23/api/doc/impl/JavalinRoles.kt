package com.github.anuarkaliyev23.api.doc.impl

import io.javalin.security.Role

enum class JavalinRoles : Role {
    ADMIN,
    USER,
    INACTIVE
}