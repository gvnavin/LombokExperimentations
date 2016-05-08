package com.gvnavin.lombok.value;

import lombok.Value;

import java.util.List;

/**
 * Created by gnavin on 5/7/16.
 */

@Value(staticConstructor="of")
public class ValueOfDemo {
    private String name;
    private int age;
    private List<String> demoList;
}
