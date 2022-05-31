package com.example.tenunaraapplication.explore

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class PostExplore(
    var name: String,
    var photo: Int
) :Parcelable