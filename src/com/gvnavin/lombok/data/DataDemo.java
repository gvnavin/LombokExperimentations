package com.gvnavin.lombok.data;

import lombok.Data;

import java.util.List;

/**
 * Created by gnavin on 5/7/16.
 */

@Data
public class DataDemo {

    private int demoInt;
    private String demoString;
    private List<String> demoList;
    private String[] demoArray;
    private boolean demoBoolean;

    private final String demoFinalString;

}
