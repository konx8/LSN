package org.tasks;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Task2Test extends TestCase {

    @Test
    public void testMethodTask2() {
        Task2 task2 = new Task2();
        List<Integer> inputData = List.of(1, 2, 10, 7, 5, 3, 6, 6, 13, 0);
        assertEquals(task2.methodTask2(inputData), prepareExpectedValues());
    }

    private List<List<Integer>> prepareExpectedValues(){
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(List.of(0, 13));
        expected.add(List.of(3, 10));
        expected.add(List.of(6, 7));
        expected.add(List.of(6, 7));
        return expected;
    }
}