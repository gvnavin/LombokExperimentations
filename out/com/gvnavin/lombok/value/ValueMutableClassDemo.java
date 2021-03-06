// Generated by delombok at Thu Nov 23 23:00:09 IST 2017
package com.gvnavin.lombok.value;

import java.util.List;

/**
 * Created by gnavin on 5/7/16.
 */
public final class ValueMutableClassDemo {
    private int demoInt;
    private final String demoString;
    private final List<String> demoList;
    private final String[] demoArray;
    private final boolean demoBoolean;

    @java.beans.ConstructorProperties({"demoInt", "demoString", "demoList", "demoArray", "demoBoolean"})
    @java.lang.SuppressWarnings("all")
    public ValueMutableClassDemo(final int demoInt, final String demoString, final List<String> demoList, final String[] demoArray, final boolean demoBoolean) {
        this.demoInt = demoInt;
        this.demoString = demoString;
        this.demoList = demoList;
        this.demoArray = demoArray;
        this.demoBoolean = demoBoolean;
    }

    @java.lang.SuppressWarnings("all")
    public int getDemoInt() {
        return this.demoInt;
    }

    @java.lang.SuppressWarnings("all")
    public String getDemoString() {
        return this.demoString;
    }

    @java.lang.SuppressWarnings("all")
    public List<String> getDemoList() {
        return this.demoList;
    }

    @java.lang.SuppressWarnings("all")
    public String[] getDemoArray() {
        return this.demoArray;
    }

    @java.lang.SuppressWarnings("all")
    public boolean isDemoBoolean() {
        return this.demoBoolean;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof ValueMutableClassDemo)) return false;
        final ValueMutableClassDemo other = (ValueMutableClassDemo) o;
        if (this.getDemoInt() != other.getDemoInt()) return false;
        final java.lang.Object this$demoString = this.getDemoString();
        final java.lang.Object other$demoString = other.getDemoString();
        if (this$demoString == null ? other$demoString != null : !this$demoString.equals(other$demoString)) return false;
        final java.lang.Object this$demoList = this.getDemoList();
        final java.lang.Object other$demoList = other.getDemoList();
        if (this$demoList == null ? other$demoList != null : !this$demoList.equals(other$demoList)) return false;
        if (!java.util.Arrays.deepEquals(this.getDemoArray(), other.getDemoArray())) return false;
        if (this.isDemoBoolean() != other.isDemoBoolean()) return false;
        return true;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + this.getDemoInt();
        final java.lang.Object $demoString = this.getDemoString();
        result = result * PRIME + ($demoString == null ? 43 : $demoString.hashCode());
        final java.lang.Object $demoList = this.getDemoList();
        result = result * PRIME + ($demoList == null ? 43 : $demoList.hashCode());
        result = result * PRIME + java.util.Arrays.deepHashCode(this.getDemoArray());
        result = result * PRIME + (this.isDemoBoolean() ? 79 : 97);
        return result;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public java.lang.String toString() {
        return "ValueMutableClassDemo(demoInt=" + this.getDemoInt() + ", demoString=" + this.getDemoString() + ", demoList=" + this.getDemoList() + ", demoArray=" + java.util.Arrays.deepToString(this.getDemoArray()) + ", demoBoolean=" + this.isDemoBoolean() + ")";
    }

    @java.lang.SuppressWarnings("all")
    public void setDemoInt(final int demoInt) {
        this.demoInt = demoInt;
    }
}
