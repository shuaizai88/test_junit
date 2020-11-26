package com.xhb;

import junit.framework.TestCase;
import org.junit.Test;


public class UserTest extends TestCase {

    @Test
    public void testHello() {
        User user = new User();
        user.hello();
    }
}