package org.tasks;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class Task1Test {

    private Task1 task1;
    private List<Integer> inputList;
    private List<Integer> expectedList;

    @Before
    public void setUp(){
        task1 = new Task1();
        inputList = List.of(1, 10, 20, 20, 2, 5, 200, 109,4324,656,432,234,546,7,67,786,645,434,6,76,87,7654,78,8,654,3,8,77654,2,6);
        expectedList = List.of(1, 2, 3, 5, 6, 7, 8, 10, 20, 67, 76, 78, 87, 109, 200, 234, 432, 434, 546, 645, 654, 656, 786, 4324, 7654, 77654);
    }

    @Test
    public void method1ToTask1() {
        assertEquals(task1.method1ToTask1(inputList), expectedList);
    }

    @Test
    public void method2ToTask1() {
        assertEquals(task1.method2ToTask1(inputList), expectedList);
    }
}