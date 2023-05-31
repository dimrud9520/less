package lesson_abstract_class;

public class Audi extends Auto {
    public Audi(String brand, Integer wearLevel) {
        super(brand, wearLevel);
    }

    @Override
    protected boolean checkWearLevel() {
        if (this.wearLevel < 80) {
            return false;
        }else{
            return true;
        }
    }

    @Override
    public String toString() {
        return "Audi{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
