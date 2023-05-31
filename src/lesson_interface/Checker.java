package lesson_interface;

public interface Checker {

    Counter getCount();

    String checkNumber(int value);

    default String say() {
        return "Hay!";
    }
}
