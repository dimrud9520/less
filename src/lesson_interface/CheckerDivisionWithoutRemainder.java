package lesson_interface;

public class CheckerDivisionWithoutRemainder implements Checker {
    @Override
    public Counter getCount() {
        return Counter.TWO;
    }

    @Override
    public String checkNumber(int value) {
        if (value % 2 == 0) {
            return "Число " + value + " делится на 2 без остатка";
        } else {
            return "Число " + value + " делится на 2 c остатком";
        }
    }
}
