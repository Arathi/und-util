package com.undsf.util;

import org.junit.Test;

import static com.undsf.util.ExtMath.*;
import static org.junit.Assert.*;

/**
 * Created by Arathi on 2015-11-04.
 */
public class TestExtMath {
    @Test
    public void gcdTest(){
        int result = gcd(2, 4);
        assertEquals(result, 2);
        result = gcd(2, 5);
        assertEquals(result, 1);
    }
}
