package com.company;

import java.lang.annotation.Retention;

public class Inlay {
    int modelYear;
    String modelName;

    public Main(int year, String name) {
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {
        Main myCar = new Main();
        System.out.println(myCar.modelYear + " " + myCar.modelName);

    }

}

public class FirstClass {
    public FirstClass(int a) {

    }
    public FirstClass(int b, int c) {}
    public FirstClass(int a, String s) {}
    public FirstClass (Object o) {}

    public void firstMethod()
    {
        FirstClass f = new FirstClass();
    }
}