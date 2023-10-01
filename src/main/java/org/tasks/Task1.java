package org.tasks;

import java.time.Duration;
import java.time.Instant;
import java.util.*;
import java.util.stream.Collectors;

public class Task1 {

    public List<Integer> method1ToTask1(List<Integer> inputList){

        Instant start = Instant.now();

        List<Integer> modifiedList = inputList.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println(modifiedList);
        System.out.println("count : " + inputList.size());
        System.out.println("distinct : " + modifiedList.size());
        System.out.println("min : " + modifiedList.get(0));
        System.out.println("max : " + modifiedList.get(modifiedList.size() - 1));

        Instant end = Instant.now();
        Duration duration = Duration.between(start, end);
        System.out.println("Time : " + duration.toMillis() + " milisekundy");

        return modifiedList;
    }

    public List<Integer> method2ToTask1(List<Integer> inputList) {

        Instant start = Instant.now();

        Set<Integer> set = new HashSet<>(inputList);

        List<Integer> sortedList = new ArrayList<>(set);
        Collections.sort(sortedList);

        System.out.println(sortedList);
        System.out.println("count: " + inputList.size());
        System.out.println("distinct: " + set.size());
        System.out.println("min: " + sortedList.get(0));
        System.out.println("max: " + sortedList.get(sortedList.size() - 1));

        Instant end = Instant.now();
        Duration duration = Duration.between(start, end);
        System.out.println("Time " + duration.toMillis() + " milisekundy");
        return sortedList;
    }


}
