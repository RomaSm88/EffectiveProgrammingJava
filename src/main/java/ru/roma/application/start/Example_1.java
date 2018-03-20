/*
 * Copyright (c) 18.02.18 22:46. Author Roma
 */

package ru.roma.application.start;

public class Example_1 {


    private Integer value;


    public Example_1() {

        this.value = null;
    }


    public Example_1(Integer value) {
        this.value = value;
    }

    /**
     * 1-ый пример
     * Фабричный метод, который создает экземпляр объекта Example_1
     * @param value
     * @return
     */
    public static Example_1 valueOf(int value) {

        return new Example_1(value);

    }

    /**
     * 2-ой пример фабричного метода.
     * @return
     */
    public static Example_1 valueOf() {

        return new Example_1();
    }

    public Integer getValue() {
        return value;
    }
}
