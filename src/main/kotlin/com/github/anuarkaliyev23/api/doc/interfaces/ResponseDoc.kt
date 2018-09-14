package com.github.anuarkaliyev23.api.doc.interfaces

/**
 * This interface represents HTTP API Response documentation
 *
 * @since 1.0-SNAPSHOT
 * @author Dussaliyev Khambar
 * */
interface ResponseDoc {
    var status: Int
    var body: String
    var description: String
    var headers: MutableMap<String, String>
}