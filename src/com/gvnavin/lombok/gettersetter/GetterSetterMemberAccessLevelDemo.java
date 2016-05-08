package com.gvnavin.lombok.gettersetter;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by gnavin on 5/7/16.
 */
public class GetterSetterMemberAccessLevelDemo {

    @Setter(AccessLevel.PACKAGE)
    private int setterMemberPackageAccessLevelDemoInt;

    @Setter(AccessLevel.PRIVATE)
    private String setterMemberPrivateAccessLevelDemoString;

    @Setter(AccessLevel.PROTECTED)
    private String setterMemberProtectedAccessLevelDemoString;

    @Setter
    private int setterMemberAccessLevelDemoInt;

    @Setter
    private boolean demoBoolean;

}
