package br.com.fiap.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

//data class Game(
//    val eventName: String,
//    val homeTeam: String,
//    val awayTeam: String
//)  {
//    constructor(
//        homeTeam: String,
//        awayTeam: String
//    ): this("", homeTeam, awayTeam)
//}

@Parcelize
data class Game (
    val eventName: String = "",
    val homeTeam: String = "",
    val awayTeam: String = ""
) : Parcelable