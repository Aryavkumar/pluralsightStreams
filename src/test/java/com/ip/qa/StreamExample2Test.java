package com.ip.qa;

import org.testng.Assert;
import org.testng.annotations.Test;
/**
 * @author QA Classes
 *
 */
public class StreamExample2Test {
/**
 */
@Test
public void nmNotMatch() {
String[] str = {"TUJAES", "SDK"};
Assert.assertEquals(false, StreamExample2.addTest(str));
}
/**
 */
@Test
public void nmAnyMatch() {
String[] str = {"ABC", "BCD"};
Assert.assertEquals(true, StreamExample2.addTest(str));
}
/**
 */
@Test
public void  nmNull() {
String[] str = null;
Assert.assertFalse(StreamExample2.addTest(str));
}
/**
*/
@Test
public void multiple() {
String[] str = {"SDH", "CSH", "ABC", "ABCD"};
Assert.assertEquals(true, StreamExample2.addTest(str));
}
}
