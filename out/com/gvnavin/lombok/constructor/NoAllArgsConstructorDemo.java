// Generated by delombok at Thu Nov 23 23:00:09 IST 2017
package com.gvnavin.lombok.constructor;
/**
 * Created by gnavin on 5/7/16.
 */
public class NoAllArgsConstructorDemo {
    private int constructorDemoInt;
    private String constructorDemoString;

    @java.lang.SuppressWarnings("all")
    public NoAllArgsConstructorDemo() {
    }

    @java.beans.ConstructorProperties({"constructorDemoInt", "constructorDemoString"})
    @java.lang.SuppressWarnings("all")
    public NoAllArgsConstructorDemo(final int constructorDemoInt, final String constructorDemoString) {
        this.constructorDemoInt = constructorDemoInt;
        this.constructorDemoString = constructorDemoString;
    }
}
