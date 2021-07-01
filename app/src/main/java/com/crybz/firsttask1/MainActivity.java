package com.crybz.firsttask1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;


/*1. Создать проект со следующими пользовательскими элементами: TextView, EditText, Button, Switch,
 CheckBox, ToggleButton. Для работы использовать LinearLayout.
 Использовать различные шрифты, цвета, размеры, прочие атрибуты.
        2. Создать ещё один макет (если не получается, то проект)
         с несколькими EditText, где использовать атрибут inputType: text,
         textPersonName, phone, number, textPassword, textEmailAddress и другие значения.
        3. Добавить в проект элемент CalendarView.
        4. * Разобраться, что такое параметр ems.*/

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnNext = findViewById(R.id.btn_next);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
            }
        });
    }
}
