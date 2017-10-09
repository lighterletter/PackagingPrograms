package com.lighterletter.lists;

import java.util.ArrayList;

class MyList<E> extends ArrayList<E> {


    public MyList(E... items) {
        for (E item : items) {
            add(item);
        }
    }

    void print() {
        for (int i = 0; i < size(); i++) {
            System.out.println(get(i));
        }
    }

}
