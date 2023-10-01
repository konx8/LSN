# LSN
LSN tasks

## Task 1 

I created 2 similar methods.<br>
The first `method1ToTask1` (average time 7 - 8ms), i would probably aim for something similar to this method at work,<br>
however, the task specified that the input data is very large, so the `method2ToTask1` (average time 7 - 8ms) method was created, which should execute faster.<br>
Unfortunately, a professional tool such as the profiler is only available in Intellij Ultimate, which I do not have on my personal PC :)<br>
Additionally a class with very simple tests was created `Task1Test`.

## Task 2 

A method has been created that accepts a value in the form of a list of numbers, an array `occurrence` is created that will track the occurrences of numbers in the list<br>
for each number, a `sum` value is calculated that must be met to reach 13<br>
we check whether the sum is greater than 0 because we are not looking for negative numbers, and we check whether this number has already occurred<br>
if so, we add such a pair to the list<br>
then we increase the occurrence of the current number in the occurrence array<br>
we sort the obtained result<br>
at the end we return the value.<br>

## Task 3