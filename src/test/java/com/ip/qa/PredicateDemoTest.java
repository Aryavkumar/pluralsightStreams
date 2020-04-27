package com.ip.qa;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
/**
 * @author QA Classes
 *
 */
public class PredicateDemoTest {
/**
*/
PredicateDemo pr;
/**
*/
@BeforeTest
public void setUp() {
pr = new PredicateDemo();
}
/**
*/
@Test
public void testWithString() {
PredicateDemo pr = new PredicateDemo();
Assert.assertEquals(true, pr.checkLength("Hello"));
}
/**
*/
@Test
public void checkWithEmptyString() {
Assert.assertEquals(true, pr.checkLength(" "));
}
/**
*/
@Test
public void testWithNumbers() {
Assert.assertEquals(true, pr.checkLength("12345"));
}
/**
*/
@Test
public void testWithLargeString() {
Assert.assertEquals(false, pr.checkLength("whitebox Learning"));
}
}


