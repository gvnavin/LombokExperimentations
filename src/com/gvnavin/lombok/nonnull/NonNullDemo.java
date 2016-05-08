package com.gvnavin.lombok.nonnull;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.util.List;

/**
 * Created by gnavin on 5/7/16.
 */

@Setter
public class NonNullDemo {

    @NonNull
    private String demoString;
    @NonNull
    private List<String> demoList;
    @NonNull
    private String[] demoArray;

}
