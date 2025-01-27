package com.homework.modifierall

/**
 * Домашнее задание по теме "Modifier, все части"
 * Комплексная работа с модификаторами и параметрами.
 *
 * Задание выполняется на основании пройденной темы «Модификаторы». Необходимо написать Composable – функцию, которая будет выводить текстовое сообщение, передаваемое в параметрах этой функции.
 *
 *
 * 1 часть задания.
 *
 * Функция может принимать пустой модификатор.
 *
 * При этом экран устройства будет отображать сообщение таким образом:
 *
 * При применении дефолтного модификатора на экране
 * устройства сообщение будет отображаться таким образом:
 * При применении кастомного модификатора на экране
 * устройства сообщение будет отображаться таким образом:
 *
 * 2 часть задания. Функция может принимать модификатор по умолчанию.
 * При этом экран устройства будет отображать сообщение таким образом:
 *
 * При применении кастомного модификатора на экране
 * устройства сообщение будет отображаться таким образом:
 *
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