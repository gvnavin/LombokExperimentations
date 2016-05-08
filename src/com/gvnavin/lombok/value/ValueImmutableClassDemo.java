package com.gvnavin.lombok.value;

import lombok.Setter;
import lombok.Value;
import lombok.experimental.NonFinal;

import java.util.List;

/**
 * Created by gnavin on 5/7/16.
 */

@Value
public class ValueImmutableClassDemo {

    private int demoInt;
    private String demoString;
    private List<String> demoList;
    private String[] demoArray;
    private boolean demoBoolean;

}
