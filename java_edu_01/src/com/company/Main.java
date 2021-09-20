package com.company;

import com.people.*;
import com.animal.*;
import com.inner.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(" Hello World !!");

        Person p = new Person("dahl", 10);
        System.out.println(" new obj " + p);

        Person1 p1 = new Person1("dahl", "10","female");
        System.out.println(" new obj " + p1);


        Outer o = new Outer();
        Outer.B b = o.new B();
        System.out.println(" inner class " + b.getID());

        OuterA a = new OuterA();
        OuterA.B b1 = a.new B();
        b1.bcd();

        OuterStack os = new OuterStack();
        OuterStack.BB bb = new OuterStack.BB();
        bb.bcd();

        OuterLocal ol = new OuterLocal();
        ol.abc();


    }
}
