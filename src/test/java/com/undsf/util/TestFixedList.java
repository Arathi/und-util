package com.undsf.util;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by Arathi on 2016-03-24.
 */
public class TestFixedList {
    @Test
    public void createTest() {
        List<Integer> fixedlist = new FixedList<Integer>(54);
        System.out.println(fixedlist.size());
        assertEquals(54, fixedlist.size());

        List<Integer> arraylist = new ArrayList<Integer>(30);
        System.out.println(arraylist.size());
    }
}
