package com.example.googletableanalog.AnalogGoogleTable

import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper

/*Класс логики бэкенда
Сюда приходят данные, происходит работа
Предполагается, что данные преобразуются в массив
Создается аналог таблицы, и парсится каждое значение,
на предмет операции +-=* / или просто числа
*/
class AppLogic(jsonDataString: String) {
    //Создаем объект для парсинга
    private val jsonDataMapper = jacksonObjectMapper()
    //Сериализация в один объект
    val jsonData = jsonDataMapper.readValue(jsonDataString, ClientCoordinate::class.java)
    val jsonDataList = (jsonDataMapper.readValue<ClientCoordinate>(jsonDataString, ClientCoordinate::class.java))
}

//Класс координаты,
//для десериализации из JSON в объект
class ClientCoordinate() {
    val coordinate: String = ""
    val value: String = ""
}