package com.company;

import java.lang.ClassLoader;

public class AnotherClass {
    ClassLoader firstClass;
    ClassLoader secondClass;
    public void method() {
        firstClass.publicMethod();
        firstClass.hiddenMethod();
        secondClass.publicMethod();
        String S = "<body></body>";
        if (secondClass instanceof ClassLoader) {
        }
    }
}

