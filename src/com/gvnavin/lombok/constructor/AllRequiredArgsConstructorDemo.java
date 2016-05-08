package com.gvnavin.lombok.constructor;

/**
 * Created by gnavin on 5/7/16.
 */

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@AllArgsConstructor
public class AllRequiredArgsConstructorDemo {

    private int constructorDemoInt;
    private String constructorDemoString;

    private final int constructorDemoFinalInt;
    private final String constructorDemoFinalString;

}
