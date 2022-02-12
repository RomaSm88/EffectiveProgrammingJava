/*
 * Copyright (c) 19.02.18 10:30. Author KuznetsovRA
 */

package ru.roma.application.start;

/**
 * Created by KuznetsovRA on 19.02.2018.
 * Пример использования щаблона "абстрактная фабрика".
 * Builder создает объект, типа Example_2
 */
public class Example_2_2 {

    // Обязательные параметры при созлании объекта
    private final int servingSize;
    private final int servings;


    private Example_2_2(Builder builder) {

        this.servings = builder.servings;
        this.servingSize = builder.servingSize;
    }

    public static class Builder implements ru.roma.application.start.Builder<Example_2> {

        // Обязательные параметры при созлании объекта
        private final int servingSize;
        private final int servings;

        public Builder(int servings, int servingSize) {

            this.servings = servings;
            this.servingSize = servingSize;
        }


        @Override
        public Example_2 build() {

            return new Example_2.Builder(servingSize, servings).build();

        }
    }

}
