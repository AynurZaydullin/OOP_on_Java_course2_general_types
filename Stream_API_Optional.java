package pro.sky.java.course2.transport;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_API_Optional {
        public static void main(String[] args) {
                // Задание 1.
                // Создание неотсортированного списка целых чисел.
                List<Integer> listForProcessing = new ArrayList<>();
                listForProcessing.add(2);
                listForProcessing.add(1);
                listForProcessing.add(3);
                Stream<Integer> streamOfListForProcessing = listForProcessing.stream();
                Comparator <? super Integer> order = Comparator.naturalOrder();
                BiConsumer <? super Integer, ? super Integer> minMaxConsumer = (x, y) ->
                        System.out.println("Минимальный элемент равен: " + x + '\n' + "Максимальный элемент равен: " + y);
                findMinMax(streamOfListForProcessing,order, minMaxConsumer);
        }
        public static void findMinMax(Stream <? extends Integer> stream, Comparator <? super Integer> order,
                                      BiConsumer<? super Integer, ? super Integer> minMaxConsumer) {
                List<Integer> maxMin = stream.sorted(order).collect(Collectors.toList());
                // Передача в minMaxConsumer минимального и максимального значения.
                minMaxConsumer.accept(maxMin.get(0), maxMin.get(maxMin.size()-1));
        }
}



