package com.gvnavin.lombok.synchronizedDemo;

import lombok.Synchronized;

/**
 * Created by gnavin on 5/7/6.
 */
public class SynchronizedDemo {
    private final Object readLock = new Object();

    @Synchronized
    public static void hello() {
        System.out.println("world");
    }

    @Synchronized
    public int answerToLife() {
        return 42;
    }

    @Synchronized("readLock")
    public void foo() {
        System.out.println("bar");
    }
}
