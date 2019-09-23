package com.greyfinch.tdd.exercise_01;

import java.util.ArrayList;
import java.util.List;

public class GfStack {

    private List<String> objects = new ArrayList<String>();


    public String pop() {
        if (objects.isEmpty()) {
            throw new EmptyStackException();
        }

        return objects.remove(objects.size() - 1);

    }

    public void push(String object) {
        objects.add(object);
    }

}
