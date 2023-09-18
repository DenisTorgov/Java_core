package regular;
/**
Класс декоратор улучшает читаемость ответа для пользователя.
*/

public class Decorator {
    /**
    Функция декорирования возвращает строку с начальным текстом
    "Your animal".
    */
    public static String decorate(String str) {
        return String.format("Your animal %s", str);
    }
}
