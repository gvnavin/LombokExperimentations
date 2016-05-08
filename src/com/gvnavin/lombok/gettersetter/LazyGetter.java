package com.gvnavin.lombok.gettersetter;

import lombok.Getter;

/**
 * Created by gnavin on 5/7/16.
 */
public class LazyGetter {

    @Getter(lazy=true)
    private final int lazyInt = 1;

    @Getter(lazy=true)
    private final boolean lazyBoolean = false;

    @Getter(lazy=true)
    private final Object lazyObject = createObject();

    private Object createObject() {
        return new Object();
    }
}
