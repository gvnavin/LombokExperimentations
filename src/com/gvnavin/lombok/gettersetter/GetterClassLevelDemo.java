package com.gvnavin.lombok.gettersetter;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by gnavin on 5/7/16.
 */

@Getter
public class GetterClassLevelDemo {

    private int getterClassLevelDemoInt;
    private String getterClassLevelDemoString;
    private boolean demoBoolean;

    //will not generate the getter
    private static final String STATIC_STRING_DEMO = "staticStringGetterDemo";
}
