package com.example.googletableanalog.AnalogGoogleTable

import org.springframework.context.annotation.Configuration
import org.springframework.web.bind.annotation.GetMapping

//Класс конфигурации. Описываются методы для взаимодействия с бэкендом
@Configuration
class Configuration {
    
    @GetMapping("/")
    fun main(): String {
        return "MainPage"
    }
}