package com.example.googletableanalog.AnalogGoogleTable

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

//Класс конфигурации. Описываются методы для взаимодействия с бэкендом
@RestController
class Configuration {

    //Основной метод, который будет отдавать стартову страницу
    @GetMapping("/")
    fun main(): String {
        return "MainPage"
    }

    //Метод, куда будут отправляться запросы с клиента
    @PostMapping("/send-data")
    fun sendData(@RequestBody json: String) {
        //Данные уходят в AppLogic
        AppLogic(json)
    }
}