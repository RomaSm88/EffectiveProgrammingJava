/*
 * Copyright (c) 13.03.18 10:37. Author KuznetsovRA
 */

package ru.roma.application.start;

import java.time.LocalDate;
import java.time.Month;

/**
 * Created by KuznetsovRA on 13.03.2018.
 * Класс определяется родился ли человек в период беби-бума (1946-1965)
 * Для определения времени используются рекомендуемые классы из пакета: java.time
 */
public class Example_5 {

    private LocalDate birthDate;


    public Example_5(LocalDate birthDate) {

        this.birthDate = birthDate;
    }

    // Определяем интервал времени периода беби-бума
    private static final LocalDate BOOM_START = LocalDate.of(1945, Month.JANUARY, 1);
    private static final LocalDate BOOM_END = LocalDate.of(1965, Month.JANUARY, 1);

    // Метод, говорит, относится ли переданное значение birthDate к периоду буби-бума
    public boolean isBabyBoomer()  {

        return birthDate.compareTo(BOOM_START) >= 0 &&
                birthDate.compareTo(BOOM_END) < 0;
    }
}
