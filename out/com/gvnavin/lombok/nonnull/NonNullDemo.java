// Generated by delombok at Thu Nov 23 23:00:09 IST 2017
package com.gvnavin.lombok.nonnull;

import lombok.Getter;
import lombok.NonNull;
import java.util.List;

/**
 * Created by gnavin on 5/7/16.
 */
public class NonNullDemo {
    @NonNull
    private final String reqString;
    @NonNull
    private String demoString;
    private List<String> demoList;
    private String[] demoArray;

    @java.beans.ConstructorProperties({"reqString", "demoString"})
    @java.lang.SuppressWarnings("all")
    public NonNullDemo(@NonNull final String reqString, @NonNull final String demoString) {
        if (reqString == null) {
            throw new java.lang.NullPointerException("reqString");
        }
        if (demoString == null) {
            throw new java.lang.NullPointerException("demoString");
        }
        this.reqString = reqString;
        this.demoString = demoString;
    }

    @java.lang.SuppressWarnings("all")
    public void setDemoString(@NonNull final String demoString) {
        if (demoString == null) {
            throw new java.lang.NullPointerException("demoString");
        }
        this.demoString = demoString;
    }

    @java.lang.SuppressWarnings("all")
    public void setDemoList(final List<String> demoList) {
        this.demoList = demoList;
    }

    @java.lang.SuppressWarnings("all")
    public void setDemoArray(final String[] demoArray) {
        this.demoArray = demoArray;
    }
}
