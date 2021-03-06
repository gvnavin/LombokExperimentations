package com.gvnavin.lombok.nonnull;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * Created by gnavin on 5/7/16.
 */

@RequiredArgsConstructor
@Setter
public class NonNullDemo {
    
    @NonNull
    private final String reqString;
    
    @NonNull
    private String demoString;
    
    private List<String> demoList;
    
    private String[] demoArray;
    
}
