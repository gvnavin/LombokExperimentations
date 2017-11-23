// Generated by delombok at Thu Nov 23 23:00:09 IST 2017
package com.gvnavin.lombok.gettersetter;

/**
 * Created by gnavin on 5/7/16.
 */
public class LazyGetter {
    private final java.util.concurrent.atomic.AtomicReference<java.lang.Object> lazyInt = new java.util.concurrent.atomic.AtomicReference<java.lang.Object>();
    private final java.util.concurrent.atomic.AtomicReference<java.lang.Object> lazyBoolean = new java.util.concurrent.atomic.AtomicReference<java.lang.Object>();
    private final java.util.concurrent.atomic.AtomicReference<java.lang.Object> lazyObject = new java.util.concurrent.atomic.AtomicReference<java.lang.Object>();

    private Object createObject() {
        return new Object();
    }

    @java.lang.SuppressWarnings("all")
    public int getLazyInt() {
        java.lang.Object value = this.lazyInt.get();
        if (value == null) {
            synchronized (this.lazyInt) {
                value = this.lazyInt.get();
                if (value == null) {
                    final int actualValue = 1;
                    value = actualValue;
                    this.lazyInt.set(value);
                }
            }
        }
        return (java.lang.Integer) value;
    }

    @java.lang.SuppressWarnings("all")
    public boolean isLazyBoolean() {
        java.lang.Object value = this.lazyBoolean.get();
        if (value == null) {
            synchronized (this.lazyBoolean) {
                value = this.lazyBoolean.get();
                if (value == null) {
                    final boolean actualValue = false;
                    value = actualValue;
                    this.lazyBoolean.set(value);
                }
            }
        }
        return (java.lang.Boolean) value;
    }

    @java.lang.SuppressWarnings("all")
    public Object getLazyObject() {
        java.lang.Object value = this.lazyObject.get();
        if (value == null) {
            synchronized (this.lazyObject) {
                value = this.lazyObject.get();
                if (value == null) {
                    final Object actualValue = createObject();
                    value = actualValue == null ? this.lazyObject : actualValue;
                    this.lazyObject.set(value);
                }
            }
        }
        return (Object) (value == this.lazyObject ? null : value);
    }
}
