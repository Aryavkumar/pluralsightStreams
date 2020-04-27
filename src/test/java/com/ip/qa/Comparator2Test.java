package com.ip.qa;

import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Comparator2Test {
/**
*/
@Test
public void testWithAllPositiveNumbers() {
int[] input = {1, 3, 4, 5};
List<Integer> actual = ComparatorExample2.sorting(input);
List<Integer> expected = Arrays.asList(5, 4, 3, 1);
Assert.assertEquals(actual, expected);
}
/**
*/
@Test
public void testWithAllNegitiveNumbers() {
int[] input = {-4, -1, -9, -5};
List<Integer> actual = ComparatorExample2.sorting(input);
List<Integer> expected = Arrays.asList(-1, -4, -5, -9);
Assert.assertEquals(actual, expected);
}
/**
*/
@Test
public void testWithPositiveAndNegitiveNumber() {
int[] input = {-2, -5, 8, 9};
List<Integer> actual = ComparatorExample2.sorting(input);
List<Integer> expected = Arrays.asList(9, 8, -2, -5);
Assert.assertEquals(actual, expected);
}
/**
*/
@Test
public void testWithZeroPositiveAndNegitive() {
int[] input = {1, 3, 4, 5, 0, -2, -3};
List<Integer> actual = ComparatorExample2.sorting(input);
List<Integer> expected = Arrays.asList(5, 4, 3, 1, 0, -2, -3);
Assert.assertEquals(actual, expected);
}


}
