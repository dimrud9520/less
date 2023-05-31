package lesson_interface;

public class CheckerForPositivity implements Checker {
    @Override
    public Counter getCount() {
        return Counter.ONE;
    }

    @Override
    public String checkNumber(int value) {
        if (value >= 0) {
            return "Число: " + value + " положительное";
        } else {
            return "Число: " + value + " отрицательное";
        }
    }
}
