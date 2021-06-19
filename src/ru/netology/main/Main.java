package ru.netology.main;

import java.util.*;
public class Main {

    public static void main(String[] args) {

        List<Integer> valuesList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);


        printList(sortList(filterList(valuesList)));


    }

    public static List<Integer> filterList (List<Integer> valuesList) {

        List<Integer> filteredList = new ArrayList<>();

        for (Integer val : valuesList) {
            if ((val >= 0) && (val % 2 == 0)) {
                filteredList.add(val);
            }
        }
        return filteredList;
    }

    public static List <Integer> sortList(List<Integer> valuesList) {

        for (int i = valuesList.size()-1; i > 0; i--) {

            for (int j = 0; j < i; j++) {

                if (valuesList.get(j) > valuesList.get(j + 1)) {

                    int temp = valuesList.get(j);
                    valuesList.set(j, valuesList.get(j + 1));
                    valuesList.set(j + 1, temp);
                }
            }
        }
        return valuesList;
    }

    public static void printList (List <Integer> valuesList) {

        for (Integer val: valuesList) {
            System.out.print(val + " ");
        }
    }

}
