/*
 * Copyright (c) 20.04.18 9:17. Author KuznetsovRA
 */

package ru.roma.application.start;

import java.util.Objects;

/**
 * Created by KuznetsovRA on 20.04.2018.
 * Пример класса, с верным переопределением метода equals, hashCode
 * Класс реализует объект с телефонным номером.
 */
public final class Example_9 {

    private final short areaCode;
    private final short prefix;
    private final short lineNumber;

    public Example_9(short areaCode, short prefix, short lineNumber) {

        rangeCheck(areaCode, 999, "area code");
        rangeCheck(prefix, 999, "prefix");
        rangeCheck(lineNumber, 9999, "line number");
        this.areaCode = (short) areaCode;
        this.prefix = (short) prefix;
        this.lineNumber = (short) lineNumber;
    }

    public short getAreaCode() {
        return areaCode;
    }

    public short getPrefix() {
        return prefix;
    }

    public short getLineNumber() {
        return lineNumber;
    }


    private static void rangeCheck(int arg, int max, String name) {

        if (arg < 0 || arg > max) {
            throw new IllegalArgumentException(name + ":" + arg);
        }
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) {
            return true;
        }

        if (!(o instanceof Example_9)) {
            return false;
        }

        Example_9 example_9 = (Example_9) o;

        return example_9.getLineNumber() == lineNumber && example_9.getAreaCode() == areaCode
                && example_9.getPrefix() == prefix;

    }

    @Override
    public int hashCode() {

        return Objects.hash(lineNumber, areaCode, prefix);
    }

    @Override
    public String toString() {

        return String.format("(%03d) %03d-%04d", areaCode, prefix, lineNumber);
    }
}
