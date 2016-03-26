package com.undsf.util;

import java.util.ArrayList;

/**
 * Created by Arathi on 2016-03-24.
 */
public class FixedList<E> extends ArrayList<E> {
    public FixedList() {
        super();
    }

    public FixedList(int initialSize) {
        super(initialSize);
        for (int i=0; i<initialSize; i++){
            add(null);
        }
    }

    public FixedList(int initialSize, E e) {
        super(initialSize);
        for (int i=0; i<initialSize; i++){
            add(e);
        }
    }

    public void reserve(int size) {
        if (this.size() > size) {
            //throw new Exception("");
            return;
        }
        for (int i=size(); i<size; i++){
            add(null);
        }
    }
}
