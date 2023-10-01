package org.tasks;

import java.util.*;

public class Task2 {

    public List<List<Integer>> methodTask2(List<Integer> inputList){
            List<List<Integer>> pairs = new ArrayList<>();
            int[] occurrence = new int[14];

            for (int num : inputList) {
                int result = 13 - num;
                if (result >= 0 && occurrence[result] > 0) {
                    List<Integer> pair = Arrays.asList(Math.min(num, result), Math.max(num, result));
                    pairs.add(pair);
                }
                occurrence[num]++;
            }
            sortMethod(pairs);
            System.out.println(pairs);
            return pairs;
    }

    private void sortMethod(List<List<Integer>> pairs){
        Collections.sort(pairs, Comparator.comparingInt((List<Integer> pair) -> pair.get(0)).thenComparingInt(pair -> pair.get(1)));
    }

}
