package com.user.myapplicationmvvm.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class CatsModel {
    @SerializedName("all")
    @Expose
    var all: List<All>? = null

    inner class All {
        @SerializedName("_id")
        @Expose
        var id: String? = null

        @SerializedName("text")
        @Expose
        var text: String? = null

        @SerializedName("type")
        @Expose
        var type: String? = null

        @SerializedName("user")
        @Expose
        var user: User? = null

        @SerializedName("upvotes")
        @Expose
        var upvotes: Int? = null

        @SerializedName("userUpvoted")
        @Expose
        var userUpvoted: Any? = null

    }

    inner class User {
        @SerializedName("_id")
        @Expose
        var id: String? = null

        @SerializedName("name")
        @Expose
        var name: Name? = null

    }

    inner class Name {
        @SerializedName("first")
        @Expose
        var first: String? = null

        @SerializedName("last")
        @Expose
        var last: String? = null

    }
}