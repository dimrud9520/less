import lesson_abstract_class.Audi;
import lesson_abstract_class.Auto;
import lesson_abstract_class.Bmw;
import lesson_interface.Checker;
import lesson_interface.CheckerDivisionWithoutRemainder;
import lesson_interface.CheckerForPositivity;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        interfaceLesson();
//        abstractClassLesson();

    }

    private static void interfaceLesson() {
        //инциализируем наши классы проверок и сортируем в необходимом нам порядке(через метод getCount)

        List<Checker> checkers = Stream.of(new CheckerForPositivity(), new CheckerDivisionWithoutRemainder())
                .sorted(Comparator.comparing(o -> o.getCount().count))
                .collect(Collectors.toList());

        List<Integer> intList = List.of(2, -3, 4);

        List<String> resultList = new ArrayList<>();

        // перебор в цикле всех значений, для каждого числа будет вызван метод checkNumber
        for (Integer intValue : intList) {
            for (Checker check : checkers) {
                var str = check.checkNumber(intValue);
                resultList.add(str);
            }
        }

        resultList.forEach(System.out::println);
    }

    private static void abstractClassLesson() {
        List<Auto> autoList = List.of(new Bmw("X5", 60), new Audi("A6", 30));

        List<String> resultList = new ArrayList<>();

        for (Auto auto : autoList) {
            resultList.add(auto.getTechnicalInspectionResult());
        }

        resultList.forEach(System.out::println);
    }
}