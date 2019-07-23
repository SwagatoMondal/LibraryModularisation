package com.sample.first;

import android.support.annotation.Keep;

import com.sample.core.CoreHelper;

@Keep
public class FirstHelper {

    public static int sum(int a, int b, int c) {
        return CoreHelper.sum(a, b, c);
    }

    public static int multiply(int a, int b) {
        return CoreHelper.multiply(a, b);
    }
}
