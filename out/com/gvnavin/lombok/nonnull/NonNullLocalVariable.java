package com.gvnavin.lombok.nonnull;

import lombok.NonNull;

/**
 * Created by gnavin on 5/7/16.
 */
public class NonNullLocalVariable {
    
    //no effect
    public void get() {
        @NonNull String s = "";
    }
}
