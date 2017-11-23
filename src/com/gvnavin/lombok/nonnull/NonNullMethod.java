package com.gvnavin.lombok.nonnull;

import lombok.NonNull;

/**
 * Created by gnavin on 5/7/16.
 */
public class NonNullMethod {
    
    //No effect
    
    @NonNull
    public String get(String field) {
        return null;
    }
}
