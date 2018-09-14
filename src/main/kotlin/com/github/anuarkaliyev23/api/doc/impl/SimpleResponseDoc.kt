package com.github.anuarkaliyev23.api.doc.impl

import com.github.anuarkaliyev23.api.doc.interfaces.ResponseDoc

/**
 * This class is a simple implementation of [ResponseDoc]
 *
 * @author Dussaliyev Khambar
 * @since 1.0-SNAPSHOT
 * */
data class SimpleResponseDoc(override var status: Int,
                        override var body: String,
                        override var description: String,
                        override var headers: Map<String, String>) : ResponseDoc