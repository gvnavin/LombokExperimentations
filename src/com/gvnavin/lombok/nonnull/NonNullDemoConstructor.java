package com.gvnavin.lombok.nonnull;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * Created by gnavin on 5/7/16.
 */

@RequiredArgsConstructor
@Setter
public class NonNullDemoConstructor {
    
    @NonNull
    private final String reqString;
    
}
