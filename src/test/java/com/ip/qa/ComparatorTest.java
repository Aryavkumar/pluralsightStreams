package com.ip.qa;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ComparatorTest {
/**
*/
@Test
public void testWithAllPositiveNumbers() {
int[] k = {2, 3, 4, 5};
Integer actual = CompareExample.sorting(k);
Integer expected = 5;
Assert.assertEquals(actual, expected);
}
/**
*/
@Test
public void testWithAllNegitiveNumbers() {
int[] k = {-1, -2, -4, -6};
Integer actual = CompareExample.sorting(k);
Integer expected = -1;
Assert.assertEquals(actual, expected);
}
/**
*/
@Test
public void testWithPosiAndNegitive() {
int[] k = {-2, -3, 4, 6};
Integer actual = CompareExample.sorting(k);
Integer expected = 6;
Assert.assertEquals(actual, expected);
}
/**
*/
@Test
public void testWithZeroNegitiveNumbers() {
int[] k = {-2, -3, -4, 0};
Integer actual = CompareExample.sorting(k);
Integer expected = 0;
Assert.assertEquals(actual, expected);
}
}
