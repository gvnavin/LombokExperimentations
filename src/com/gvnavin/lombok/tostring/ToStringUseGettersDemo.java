package com.gvnavin.lombok.tostring;

import lombok.Getter;
import lombok.ToString;

import java.util.List;

/**
 * Created by gnavin on 5/7/16.
 */

@Getter
@ToString(doNotUseGetters = false)
public class ToStringUseGettersDemo {

    private int demoInt;
    private String demoString;
    private List<String> demoList;
    private String[] demoArray;

}
