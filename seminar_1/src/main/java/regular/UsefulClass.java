package regular;
/**
Самый полезный класс программы. Класс возвращает реакцию животного
на наши действия.
 */

public class UsefulClass {
    /**
    Функция возвращает звук который издает животное.
    */
    public static String say() {
        return "said \"Mooooooooo\".";
    };
    /**
    Функция возвращает строку с указанием что животное движется.
    */
    public static String move() {
        return "is moving.";
    };
    /**
    Функция возвращает строку с указанием что животное остановилось.
    */
    public static String stop() {
        return "has stopped.";
    };
    /**
    Функция возвращает строку с указанием что животное делает.
    */
    public static String dosomething() {
        return "shook its head.";
    };
}
