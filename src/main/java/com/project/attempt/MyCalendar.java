package com.project.attempt;

import java.util.HashSet;
import java.util.Set;

public class MyCalendar {

    private Set<Integer> dateSet = new HashSet<Integer>();

    public MyCalendar() {

    }

    public boolean book(int start, int end) {

        for (int i = start; i < end; i++) {

            if (dateSet.contains(i)) {
                return false;
            } else {
                dateSet.add(i);
            }

        }

        return true;

    }

}