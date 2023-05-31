package lesson_abstract_class;

public class Bmw extends Auto {
    public Bmw(String brand, Integer wearLevel) {
        super(brand, wearLevel);
    }

    @Override
    protected boolean checkWearLevel() {
        if (this.wearLevel < 50) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public String toString() {
        return "Bmw{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
