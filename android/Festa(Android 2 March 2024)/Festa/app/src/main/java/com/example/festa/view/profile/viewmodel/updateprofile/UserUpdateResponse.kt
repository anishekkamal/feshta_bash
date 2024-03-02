package com.example.festa.view.profile.viewmodel.updateprofile

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class UserUpdateResponse {
    @SerializedName("success")
    @Expose
    var success: Boolean? = null

    @SerializedName("message")
    @Expose
    var message: String? = null
}