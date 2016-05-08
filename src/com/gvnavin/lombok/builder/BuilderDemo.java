package com.gvnavin.lombok.builder;

import lombok.Builder;
import lombok.Singular;

import java.util.List;

/**
 * Created by gnavin on 5/7/16.
 */

@Builder
public class BuilderDemo {

    private String name;
    private int age;

    @Singular
    private List<String> grades;
}
