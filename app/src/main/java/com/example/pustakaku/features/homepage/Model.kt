package com.example.pustakaku.features.homepage

data class GenreModel (
  val title:String = "",
  val description:String = "",
)

data class BookModel (
  val id:String="",
  val title:String = "",
  val author:String = "",
  val description: String= "",
  val likes:Int= 0,
  val rating:Double = 0.0,
  val views:Int = 0,
  val kategori: String = ""
)