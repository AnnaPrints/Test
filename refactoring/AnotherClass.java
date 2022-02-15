package com.company.refactoring;

// File AnotherClass.java
public class AnotherClass {
    ClassLoader firstClass;
    Interface1 secondClass;
    public void method() {
        firstClass.publicMethod();
        firstClass.hiddenMethod();
        secondClass.publicMethod();
        if (secondClass instanceof Interface1) {

        }

    }
}
