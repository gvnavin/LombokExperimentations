package com.gvnavin.lombok.gettersetter;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by gnavin on 5/7/16.
 */
public class GetterSetterMemberLevelDemo {

    @Getter
    private int getterMemberLevelDemoInt;

    @Setter
    private String setterMemberLevelDemoString;

    @Getter @Setter
    private String getterSetterMemberLevelDemoString;

    @Getter @Setter
    private boolean demoBoolean;

    //will not generate the getter
    private static final String STATIC_STRING_DEMO = "staticStringGetterDemo";
}
