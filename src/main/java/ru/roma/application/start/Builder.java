/*
 * Copyright (c) 19.02.18 10:26. Author KuznetsovRA
 */

package ru.roma.application.start;

/**
 * Created by KuznetsovRA on 19.02.2018.
 * Реализация шаблона "абстрактная фабрика".
 * Клиент передает определенный builder методу, который создает один или несколько объектов для клиента.
 */
public interface Builder<T> {

    public T build();
}
