package com.ade.kotlin.footballclub.model

import java.io.Serializable

data class Item(
        val name: String,
        val image: Int,
        val logo: Int,
        val header: String,
        val detail: String
) : Serializable
