/*
 * Copyright (c) 12.03.18 16:41. Author KuznetsovRA
 */

package ru.roma.application.start;

/**
 * Created by KuznetsovRA on 12.03.2018.
 * Пример реализации синглетона.
 * Экземпляр класса Example_3, создается в единственном экземпляре после вызова статического метода Example_3.INSTANCE
 */
public enum Example_3 {

    INSTANCE;
    int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {

        this.value = value;
    }

}
