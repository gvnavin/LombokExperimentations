package com.gvnavin.lombok;

import com.gvnavin.lombok.builder.BuilderDemo;
import com.gvnavin.lombok.constructor.AllRequiredArgsConstructorDemo;
import com.gvnavin.lombok.data.DataDemo;
import com.gvnavin.lombok.delegate.DelegateDemo;
import com.gvnavin.lombok.gettersetter.GetterClassLevelDemo;
import com.gvnavin.lombok.gettersetter.GetterSetterClassLevelDemo;
import com.gvnavin.lombok.gettersetter.GetterSetterMemberLevelDemo;
import com.gvnavin.lombok.gettersetter.SetterClassLevelDemo;

import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Getter
        final GetterClassLevelDemo getterClassLevelDemo = new GetterClassLevelDemo();
        getterClassLevelDemo.getGetterClassLevelDemoInt();
        getterClassLevelDemo.getGetterClassLevelDemoString();

        //Setter
        final SetterClassLevelDemo setterClassLevelDemo = new SetterClassLevelDemo();
        setterClassLevelDemo.setSetterClassLevelDemoInt(1);
        setterClassLevelDemo.setSetterClassLevelDemoString("String");

        //GetterSetter
        final GetterSetterClassLevelDemo getterSetterClassLevelDemo = new GetterSetterClassLevelDemo();
        getterSetterClassLevelDemo.setGetterSetterClassLevelDemoInt(1);
        getterSetterClassLevelDemo.setGetterSetterClassLevelDemoString("String");
        getterSetterClassLevelDemo.getGetterSetterClassLevelDemoInt();
        getterSetterClassLevelDemo.getGetterSetterClassLevelDemoString();

        //getter setter member level
        final GetterSetterMemberLevelDemo getterSetterMemberLevelDemo = new GetterSetterMemberLevelDemo();
        getterSetterMemberLevelDemo.getGetterMemberLevelDemoInt();
        getterSetterMemberLevelDemo.setSetterMemberLevelDemoString("string");
        getterSetterMemberLevelDemo.getGetterSetterMemberLevelDemoString();
        getterSetterMemberLevelDemo.setGetterSetterMemberLevelDemoString("string");

        final DataDemo dataDemo = new DataDemo("demoFinalString");
        dataDemo.getDemoArray();
        dataDemo.getDemoInt();
        dataDemo.getDemoString();

        //delegate demo
        final DelegateDemo delegateDemo = new DelegateDemo();
        delegateDemo.concat("append");

        //constuctor demo
        final AllRequiredArgsConstructorDemo allRequiredArgsConstructorDemo0 = new AllRequiredArgsConstructorDemo(1, "string");
        final AllRequiredArgsConstructorDemo allRequiredArgsConstructorDemo1 = new AllRequiredArgsConstructorDemo(1, "string", 1, "string");

        //builder
        BuilderDemo builderDemo = BuilderDemo.builder().age(1).name("navin").grade("1").grades(Collections.<String>emptyList()).build();


    }
}
