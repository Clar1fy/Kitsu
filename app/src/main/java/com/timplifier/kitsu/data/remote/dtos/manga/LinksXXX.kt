package com.timplifier.kitsu.data.remote.dtos.manga


import com.google.gson.annotations.SerializedName

data class LinksXXX(
    @SerializedName("self")
    val self: String,
    @SerializedName("related")
    val related: String
)