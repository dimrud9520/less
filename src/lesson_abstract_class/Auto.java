package lesson_abstract_class;

public abstract class Auto {

    protected String brand;
    protected Integer wearLevel; // уровень износа

    public Auto(String brand, Integer wearLevel) {
        this.brand = brand;
        this.wearLevel = wearLevel;
    }

    public String getTechnicalInspectionResult() {
        if (checkWearLevel()) {
            return "Автомобиль "+toString()+ " можно эксплуатировать";
        } else {
            return "Автомобиль "+toString()+ " эксплуатиации не подлежит! Слишком высокий уровень износа!";
        }
    }
    protected abstract boolean checkWearLevel();

    @Override
    public String toString() {
        return "Auto{" +
                "brand='" + brand + '\'' +
                ", wearLevel=" + wearLevel +
                '}';
    }
}
