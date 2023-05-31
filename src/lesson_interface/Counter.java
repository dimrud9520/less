package lesson_interface;

public enum Counter {
    ONE(1), TWO(2);

    public final int count;

    Counter(int count) {
        this.count = count;
    }
}
