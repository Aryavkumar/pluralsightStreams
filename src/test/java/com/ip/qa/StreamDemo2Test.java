package com.ip.qa;

import org.testng.Assert;
import org.testng.annotations.Test;
/**
 * @author QA Classes
 *
 */
public class StreamDemo2Test {
/**
 */
@Test
public void testWithNonMultiple() {
int[] l = {1, 2, '4', '5'};
boolean actual = StreamDemo2.multiples(l);
Assert.assertEquals(actual, false);
}

/**
 */
@Test
public void testWithMultiple() {
int[] l = {'3', '6', '9', 12};
boolean actual = StreamDemo2.multiples(l);
Assert.assertEquals(actual, true);
}
/**
*/
@Test
public void testWithEmptyArray() {
int[] l = new int[0];
boolean actual = StreamDemo2.multiples(l);
Assert.assertEquals(actual, false);
}
}
