package com.ip.qa;

import com.ip.utils.Predicate;

public class PredicateDemo {
/**
* @param str
* @return tag.
*/
public boolean checkLength(final String str) {
Predicate<String> p1 = s -> s.length() < 6;
return p1.test(str);
}
}
