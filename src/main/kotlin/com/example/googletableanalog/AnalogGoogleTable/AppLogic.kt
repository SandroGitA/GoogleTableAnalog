package com.example.googletableanalog.AnalogGoogleTable

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper

/*Класс логики бэкенда
Сюда приходят данные, происходит работа
Предполагается, что данные преобразуются в массив
Создается аналог таблицы, и парсится каждое значение,
на предмет операции +-=* / или просто числа
*/
class AppLogic(data: String) {
    //Создаем объект для парсинга
    private val jsonData = jacksonObjectMapper()

    val md = jsonData.readValue(data, ClientCoordinate::class.java)

    val nll = "test"
}

//Класс координаты,
//для десериализации из JSON в объект
class ClientCoordinate() {
    val coordinate: String = ""
    val value: String = ""
}