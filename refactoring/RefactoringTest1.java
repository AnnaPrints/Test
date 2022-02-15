package com.company.refactoring;

import com.company.AnotherClass;
import com.company.Runnable;

import java.util.*;

//Rename
interface RenameInterface  {

}

class RefactoringTest1 {

}

//class
class ClassRenameTest {
    static int myMethod(int x, int y) //parameter
    {
        return x + y;//x
        System.out.println("x myMethod");
    }

    public static void parameter(String[] args) {
        Properties capitals = new Properties();
        Set states;
        String str; //field
        boolean btest = false; //boolean variable
        boolean trtt = true;

        capitals.put("Illinois", "Springfield");
        capitals.put("Missouri", "Jefferson City");
        capitals.put("Washington", "Olympia");
        capitals.put("California", "Sacramento"); //property
        capitals.put("Indiana", "Indianapolis");

        System.out.println(btest); //btest
        System.out.println(str);

        // Show all states and capitals in hashtable.
        states = capitals.keySet();   // get set-view of keys
        Iterator itr = states.iterator();

        while (itr.hasNext()) {
            str = (String) itr.next();
            System.out.println("The capital of " + str + " is " +
                    capitals.getProperty(str) + ".");
        }
        System.out.println();

        // look for state not in list -- specify default
        str = capitals.getProperty("Florida", "Not Found");
        System.out.println("The capital of Florida is " + str + ".");
    }

    public void simpleInlineVariable() {
        int test = 1;
        int a = test + 1; //inline variable "test"
    }

    public void inlineVariable() {
        AnotherClass.InnerClass aClass = anotherClass.innerClass;
        int a = aClass.i; //inline variable "aClass"
    }

}

class ChildTestRenameTest extends ClassRenameTest {
    static void checkAge(int age1) //parameter
    {

        // If age1 is less than 18, print "access denied"
        if (age1 < 18) {
            System.out.println("Access denied - You are not old enough!");

            // If age1 is greater than, or equal to, 18, pr
            // int "access granted"
        } else {
            System.out.println("Access granted - You are old enough!");
        }

    }


    //Inline
    public static void inlineMethod(String[] args) {
        checkAge(20); // Call the checkAge method and pass along an age of 20
    }

    public ArrayList method() {
        String[] strings = {"a", "b", "c"};
        ArrayList list = add(strings);
        return list;//add
        System.out.printf("add");
    }

    private ArrayList add(String[] strings) //inline "add" method
    {
        ArrayList list = new ArrayList();
        for (int i = 0; i < strings.length; i++) {
            list.add(strings[i]);
        }
        return list;
    }
}


///**/
//interface

public class Constructor {
    public int varInt;
    public Constructor() {
        this(0);
    }

    public Constructor(int i) {
        varInt=i;
    }

    public void method() {
        Constructor aClass = new Constructor(); //inline Constructor
    }
}

class Superclass {

    void calculations1() {
        System.out.println("Superclass"); //Superclass
    }

    void calculations2() {
    }
}

class Foo extends Superclass //inline superclass "Superclass"
{
    int someMethod() {

        if (something > calculations1()) {

            return calculations2(); //superclass
        }
    }
}

class AnonymousDemo {
    public static void main(String[] args) {

        MyClassDelete obj = new MyClassDelete();

        obj.getAge();


    }
}


interface Age
{
    int x = 21;
    void getAge();
}
class AnonymousDemo
{
    public static void main(String[] args)
    {

        MyClass obj=new MyClass();

        obj.getAge();
    }
}

class MyClass implements Age //inline superclass "Age"
{
    @Override
    public void getAge()
    {
        // printing the age
        System.out.print("Age is "+x);
    }
{
    public static final int x = 21;

    public void getAge() {
        System.out.print("Age is " + x);
    }
}

//safe delete
public class MyClassDelete {
    private final MyProperty myProperty; //safe delete myProperty

    public MyClassDelete(MyProperty myProperty) {
        this.myProperty = myProperty;
    }
}


//change signature
class ChangeSignature {

    public class MyOtherClass {
        ChangeSignature myClass;

        void myMethod(ChangeSignature myClass) {
            System.out.println();

        }
    }
}

//Extreact/Introduce refactoring

//Extreact/Introduce variable
class Introduce {
    public void method() {
        int a = 1;
        int b = a + 1;
        int c = b + a;
    }

}

//extract constant
public class Class {

    public void method() {
        ArrayList list = new ArrayList();
        list.add("string"); //extract
        anotherMethod("string");
    }

    private void anotherMethod(String string) {
    }
}

//extract field
public class Class2 {
    Object anotherClass;

    public void method() {
        int a = 1;

        int b = a + anotherClass.intValue();//anotherClass
        int c = b + anotherClass.intValue();
    }
}

//extract parameter
public class HelloWorldPrinter {
    public static void print() {
        System.out.println(generateText());
    }

    private static String generateText() {
        return "Hello, World!".toUpperCase();
    }
}

//extract functional parameter
@FunctionalInterface
public interface Person {
    public void sayHello(String s);
}

public class Hello {
    private void printHello() {
        String s = "Hello";
        System.out.println(s);// s
    }

    private void printText() {
        printHello();
    }
}

//extract functional variable
public class PrintAction implements Runnable {
    private List<String> data;

    public PrintAction(List<String> data) {
        this.data = data;
    }

    public void run() {
        System.out.println("Data: " + data.toString());//here
    }
}


//introduce parameter object
class ParameterObject {
    private void grawEdge(Graphics g, float edgeWidth, int x1, int x2, int yl, int y2) {
        final Graphics2D g2d = (Grapics2D) g;
        g2d.setStroke(new BasicStroke(edgeWidth));
        g.drawLine(x1, y1, x2, y2);
    }
}

//extract method
class Method {
    public void method() {
        int a = 1;
        int b = 2;
        int c = a + b;
        int d = a + c;

    }

}

//Pull Members Up/Down
// File Constructor.java
public class Class extends SuperClass {
    public void publicMethod() {

    }

}



// File SuperClass.java
public abstract class SuperClass {
    public abstract void publicMethod();
}

//raw into generic
    class Generic {
    public void method() {
        List list = new LinkedList();
        list.add("string");
    }
}

//Convert anonymous to inner
public class AnonimusClass {
    public AnonimusClass method() {
        final int i = 0;
        return new AnonimusClass() {
            public int publicMethod() {
                return i;}
        };
    }
}

//Convert to Instance Method
public class ConvertToMethod {
    ClassA classA = new ClassA();
    ClassB classB = new ClassB();

    private void greatMethod(ClassA classA, ClassB classB){
        System.out.println("classA = " + classA);
        System.out.println("classB = " + classB);
    }

    public void myMethod(){
        greatMethod(classA, classB);
    }
}

//Extract delegate example
public class Foo {
    private String b;
    public String getInfo() {
        return ("(" + b + ")");
    }

}

public class Bar {
    Foo foo;
    String t2 = foo.getInfo();

}

//Extract method object
class Account {
    int gamma (int val1) {
//some computations
        return c-2*a;
    }
}

class Parent {
    void show()
    {
        System.out.println("Parent's shoow()");
    }
}

// Inherited class
class Child extends Parent{
    // This method overrides shoow() of Parent
    @Override
    void show()
    {
        System.out.println("Child's shoow()");
    }
}