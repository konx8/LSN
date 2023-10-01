package org.tasks;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Task3Test extends TestCase {

    @Test
    public void testDownSearchAlgorithm() {


        Task3 task3 = new Task3();

        List<List<Integer>> inputData1 = new ArrayList<>();
        inputData1.add(List.of(1, 2));
        inputData1.add(List.of(2, 3));
        inputData1.add(List.of(4, 5));

        List<List<Integer>> inputData2 = new ArrayList<>();
        inputData2.add(List.of(4, 3));
        inputData2.add(List.of(1, 4));
        inputData2.add(List.of(5, 6));

        assertEquals(task3.downSearchAlgorithm(inputData1), 2);
        assertEquals(task3.downSearchAlgorithm(inputData2), 2);

    }
}