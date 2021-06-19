package ru.netology.stream_main;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamMain {
    public static void main(String[] args) {

        List<Integer> valuesList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        valuesList.stream()
                .filter(x -> (x >= 0) && (x % 2 == 0))
                .sorted(Comparator.naturalOrder())
                .forEach(x -> System.out.print(x + " "));

    }
}
