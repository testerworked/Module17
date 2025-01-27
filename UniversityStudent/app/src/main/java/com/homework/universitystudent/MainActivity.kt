package com.homework.universitystudent

/**
 * Домашнее задание по теме "JetpackCompose Composable"
 * Приложение «Студент университета»
 * 1.     Создать Проект с названием FirstAppJetpackCompose.
 * 2.     Написать Composable – функцию для вывода информации
 * «Студент университета Urban: «имя студента»».
 * Функция на вход принимает параметр имени строкового типа.
 * Размер шрифта – 16.sp,
 * Цвет текста – красный.
 * 3.     Запустить первое приложение на эмуляторе и устройстве.
 */
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}