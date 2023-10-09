package com.example.googletableanalog.AnalogGoogleTable

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

/*
Написать мини-аналог Google таблиц.
В веб странице сделать таблицу 4 на 4 колонки. Столбцы имеют буквенное обозначение, строки - цифровые.
В клетке можно написать цифру, либо формулу, первым символом которой будет =
В формулах возможно ссылаться на клетку, по ее позиции столбец+строка.

Доступные операции: + - / * ( )

После нажатия на enter - производить расфокус клетки и расчет значений таблицы.
Расчитывать значения нужно на серверной стороне. Стек сервера - kotlin + spring reactive
 */

@SpringBootApplication
class AnalogGoogleTableApplication

fun main(args: Array<String>) {
	runApplication<AnalogGoogleTableApplication>(*args)
}
