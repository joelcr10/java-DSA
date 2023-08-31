package OOP;

import java.util.*;



abstract class Parent{
    abstract void career(String name);
    abstract void partner(String name);
}

class Son extends Parent{
    @Override
    void career(String name){
        System.out.println("I am going to be "+name);
    }

    @Override
    void partner(String name){
        System.out.println("I love "+name);
    }

}

public class AbstractDemo{
    public static void main(String[] args) {
        Son s = new Son();
        s.career("actor");
    }
}


