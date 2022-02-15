package com.company.refactoring;

import java.lang.reflect.Constructor;

public class Unused {
    public void method() {
        Constructor aClass = new Constructor(); //"inline method"
        int a = 1;
        int b = a + anotherClass.intValue(); //introduce variable
        int c = b + anotherClass.intValue(); //Modularize, Migrate to AppCompat, Migrate to AndroidX, Remove Unused Resources,
        int number = anotherClass.intValue();// Enable Instant Apps Support, Add Right-to-Left(RTL) Support
    }
}
