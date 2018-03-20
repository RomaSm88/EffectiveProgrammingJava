## Статья №1
### Получение экземпляра класса
1. Использовать открытый констурктор.
2. Статический фабричный  метод, который возвращает экземпляр класса.
#### Приемущества статических фабричных методов
1. Статический фабричный метод, имеет название. Тчательно подобранное название подчеркивает реализацию фабричного метода.
Рекомендации по именованию фабричных методов:
valueOf - возвращает экземпляр, который имеет тип такой же как параметр этого метода.
of - сокращенная форма от valueOf
getInstance - возвращает экземпляр описанный параметрами, но его тип может быть отличным от переданных параметров.
newInstance - каждый экземпляр возвращаемого типа будет отличаться от типов, переданных параметров.
getType - то же что и getInstance, но используется когда фабричный метод находится в бругом классе.
newType - то же что и newInstance, но используется когда фабричный метод находится в бругом классе.

2. Статический фабричный метод может иметь одинаковую сигнатуру. 
Создать несколько конструкторов с одинаковой сигнатурой нельзя.

3. Фабричный метод не обязан возвращать новый объект. Может возваращаться заранее созданый изменяемый экземпляр или
кэщированный экземпляр, который был создан ранее.
Для многих программ, данное приемущество позволяет повысить производительность.

4. Фабричный метод, может вернуть объект, который соответсвует любому подтипу, исходного класса. Таким образом,
можно вернуть тип, класс которого не объявлен как public.

#### Основной недостаток фабричных статических методов
Если класс для создания экземпляра имеет только статическийфабричный методов, то у такого класса не может быть подклассов,
что в свою очередь является и приемуществом, так как это поощряет программистов использовать компазицю, а не наследование.

## Статья №2
### Шаблон Bulder, если в конструкторе много (от 4) не обязательных параметров
Недостаток телескопического контсруктора: трудно поддерживать код, нет наглядного представления, для какой цели используется
каждый параметр констурктора.
Недостаток шаблона JavaBean (когда каждое поле класса инициализируется сеттером): в момент создания объект находится в 
неустойчивом состоянии т.к setter для полей еще не вызывались. Исключает возможность сделать класс не изменяемым.
### Приемущество использования шаблона Builder
1. Имметирует именнованные дополнительные параметры объекта.
2. У builder может быть несколько методов с переменным числом параметров.
3. Один builder может быть использован для создания нескольких объектов.
4. Автоматическое заполнение некоторых полей в момент создания объекта, например серийный номер.
### Недостатки шаблона Builder
1. Затраты процессорного времени на предварительное создание Builder. В настоящее время, недостаток менее актуален.
2. Шаблоны builder более громозки в использовании по сравнению с шаблоном - "телескопический конструктор".
3. При проектировании класса, Builder необходимо внедрять на первоначальном этапе.

## Статья №3
### Синглетон
Это класс, для которого создается объект в единственном экземпляре.
Лучший подход при реализации синглетона (singleton), использовать перечисляемый тип с одним элементом.
При использовании типа Enum, объект данного типа становится сериализуемым по умолчанию.


## Статья №4
### Закрытый конструктор для предотвращения создания экземпляра класса
Запретить создание экземпляра можно, поместив в класс единсвенный закрытый конструктор без параметров, а сам класс 
объявить как final.
Внутри такого конструктора желательно выбрасывать исключение: throw new AssertionError();
Побочный эффект: данный класс не может учавствовать в наследовании.

## Статья №5
### Не создавайте новый объект, если может быть переиспользован уже созданный
Для избежания создания дубликатов, необходимо в не изменяемом классе, использовать статический фабричный метод вместо
конструктора. Повторно могут быть использованы и изменяемые объект, если последние уже больше не будут менятя.
В Java 8, являеются устаревшими классы: Date, Calendar. Необходимо использовать классы из пакета: java.time. Классы
из этого пакета являются не изменяемыми, по этому их можно переиспользовать. Пример использования в классе Example_5.
Предпочитайте примитивные типы классам-оберткам, избегайте не преднамеренного автоупаковывания, например
Long value = 0L;
long i = 1l;
value += i (произойдет автоматическое создание еще одного объекта Long, что снизит производительность).


