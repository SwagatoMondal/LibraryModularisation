package com.sample.second;

import android.support.annotation.Keep;

import com.sample.core.CoreHelper;

@Keep
public class SecondHelper {

    public static void sum(int a, int b, int c) {
        System.out.println("Sum : " + CoreHelper.sum(a, b, c));
    }

    public static void multiply(int a, int b) {
        System.out.println("Multiply : " + CoreHelper.multiply(a, b));
    }
}
