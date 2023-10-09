package com.example.googletableanalog.AnalogGoogleTable

import org.springframework.context.annotation.Configuration
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

//Класс конфигурации. Описываются методы для взаимодействия с бэкендом
@RestController
class Configuration {

    @GetMapping("/")
    fun main(): String {
        return "MainPage"
    }

    @PostMapping("/send-data")
    fun sendData(){
        //
    }
}