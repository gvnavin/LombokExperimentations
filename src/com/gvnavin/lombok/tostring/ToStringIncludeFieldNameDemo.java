package com.gvnavin.lombok.tostring;

import lombok.ToString;

import java.util.List;

/**
 * Created by gnavin on 5/7/16.
 */

@ToString(includeFieldNames = true)
public class ToStringIncludeFieldNameDemo {

    private int demoInt;
    private String demoString;
    private List<String> demoList;
    private String[] demoArray;

}
