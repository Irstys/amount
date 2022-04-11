package ru.netology

fun main() {
    print("Введите сумму перевода в рублях: ")
    val read = readln().toDouble()
    val amount:Int = (read*100).toInt()
    val coefficient: Double =0.0075
    val minFee:Int= 35*100
    val totalFee =(if((amount*coefficient)<=minFee) minFee else amount*coefficient).toInt()
    val kop:Int = (totalFee%100).toInt()
    val rub:Int =(totalFee/100).toInt()

    println("Сумма комиссии составляет $rub руб. $kop  коп.")
}