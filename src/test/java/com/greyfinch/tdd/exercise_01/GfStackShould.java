package com.greyfinch.tdd.exercise_01;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class GfStackShould {


    @Test(expected = EmptyStackException.class)
    public void fail_to_pop_when_nothing_is_pushed() {

        GfStack stack = new GfStack();

        stack.pop();
    }

    @Test
    public void pop_last_object_pushed() {

        String expected = "first push";

        GfStack stack = new GfStack();
        stack.push(expected);

        assertThat(stack.pop(), is(equalTo(expected)));
    }

    @Test
    public void pop_objects_in_reverse_order_of_how_they_were_pushed() {
        GfStack stack = new GfStack();
        String expected1 = "expected1";
        String expected2 = "expected2";
        String expected3 = "expected3";
        stack.push(expected1);
        stack.push(expected2);
        stack.push(expected3);
        assertThat(stack.pop(), is(equalTo(expected3)));
        assertThat(stack.pop(), is(equalTo(expected2)));
        assertThat(stack.pop(), is(equalTo(expected1)));
    }


}
