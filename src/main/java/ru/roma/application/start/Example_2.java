/*
 * Copyright (c) 19.02.18 9:57. Author KuznetsovRA
 *
 */

package ru.roma.application.start;

/**
 * Пример использования шаблона Builder при создании объекта.
 * Created by KuznetsovRA on 19.02.2018.
 */
public class Example_2 {

    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public static class Builder {

        // Обязательные параметры при созлании объекта
        private final int servingSize;
        private final int servings;

        // Опциональные параметры
        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;

        public Builder(int servingSize, int servings) {

            this.servings = servings;
            this.servingSize = servingSize;

        }

        // Далее, если необхоимо, задаем не обязательные параметры.
        public Builder calories(int val) {

            this.calories = val;
            return this;
        }

        public Builder fat(int val) {

            this.fat = val;
            return this;
        }

        public Builder sodium(int val) {

            this.sodium = val;
            return this;
        }

        public Builder carbohydrate(int val) {

            this.carbohydrate = val;
            return this;
        }

        // Метод создания целевого объекта с установленными параметрами
        public Example_2 build() {

            return new Example_2(this);
        }
    }

    private Example_2(Builder builder) {

        this.servings = builder.servings;
        this.servingSize = builder.servingSize;
        this.calories = builder.calories;
        this.fat = builder.fat;
        this.carbohydrate = builder.carbohydrate;
        this.sodium = builder.sodium;

    }

    public int getServingSize() {
        return servingSize;
    }

    public int getServings() {
        return servings;
    }

    public int getCalories() {
        return calories;
    }

    public int getFat() {
        return fat;
    }

    public int getSodium() {
        return sodium;
    }

    public int getCarbohydrate() {
        return carbohydrate;
    }

    @Override
    public String toString() {
        return "Example_2{" +
                "servingSize=" + servingSize +
                ", servings=" + servings +
                ", calories=" + calories +
                ", fat=" + fat +
                ", sodium=" + sodium +
                ", carbohydrate=" + carbohydrate +
                '}';
    }
}
