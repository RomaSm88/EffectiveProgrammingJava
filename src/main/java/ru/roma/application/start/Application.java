/*
 * Copyright (c) 12.02.18 12:42. Author Roma
 */

package ru.roma.application.start;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Application {


    public static void main(String[] args) {


        Example_1 example1Object_1 = Example_1.valueOf();
        Example_1 example1Object_2 = Example_1.valueOf(10);

        System.out.println("Создание экземпляра объекта, фабричным методом.");
        System.out.println("Значение поля 1-ого объекта: " + example1Object_1.getValue());
        System.out.println("Значение поля 2-ого объекта: " + example1Object_2.getValue());


        // Пример создания объектов, с помошью шаблона Builder.
        Example_2 example2AndCalories = new Example_2.Builder(10,5).calories(100).build();
        Example_2 example2FullParametrs = new Example_2.Builder(5, 4).calories(10).carbohydrate(1)
                .fat(12).sodium(55).build();

        System.out.println(example2AndCalories);
        System.out.println(example2FullParametrs);

        // Пример использования "абстрактной фабрики"
        Example_2 example_2AbstractBuilder = new Example_2_2.Builder(11, 14).build();
        System.out.println("Использование абстрактной фабрики: " + example_2AbstractBuilder);

        // Пример создания синглетона.
        Example_3 example_3 = Example_3.INSTANCE;
        example_3.setValue(10);
        String messageSingleton = String.format("Значение singleton: %s = %s", "example_3", example_3.getValue());
        System.out.println(messageSingleton);

        // Не создавайте не нужные объекты, если можно переиспользовать уже созданный.
        Example_5 example_5 = new Example_5(LocalDate.of(1988, 2, 23));
        String messageExamle_5 = String.format("Example5: BebyBoomer: %s", example_5.isBabyBoomer());
        System.out.println(messageExamle_5);

        // Пример использования переопределенных методов equals, hashCode
        Example_9 phoneNumber1 = new Example_9((short) 11, (short) 12, (short) 445);
        Example_9 phoneNumer2 = new Example_9((short) 11, (short) 15, (short) 4551);
        Example_9 phoneNumer3 = new Example_9((short) 11, (short) 15, (short) 4551);

        System.out.println("phoneNumer1 != phoneNumber2 => " + phoneNumber1.equals(phoneNumer2));
        System.out.println("HashCode: " + phoneNumber1.hashCode() + " != " + phoneNumer2.hashCode());
        System.out.println("phoneNumber2 == phoneNumber3 => " + phoneNumer2.equals(phoneNumer3));
        System.out.println("HashCode: " + phoneNumer2.hashCode() + "==" + phoneNumer3.hashCode());
        List<Example_9> arrayPhoneNumbers = new ArrayList<>();
        arrayPhoneNumbers.add(phoneNumber1);
        arrayPhoneNumbers.add(phoneNumer2);
        arrayPhoneNumbers.add(phoneNumer3);
        System.out.println("PhoneNumbers: " +  arrayPhoneNumbers.toString());

    }
}
