package com.javarush.task.task20.task2017;




import java.io.ObjectInputStream;
import java.io.Serializable;

/* 
Десериализация
*/
public class Solution {

    public A getOriginalObject(ObjectInputStream objectStream){

        A a;
        try {
            Object obj = objectStream.readObject();


            if (obj.getClass().equals(A.class)) {
                a = (A) obj;

            } else return null;
        } catch (Exception e) {
            return null;
        }

        return a;
    }

    public class A implements Serializable {
    }

    public class B extends A {
        public B() {
            System.out.println("inside B");
        }
    }

    public static void main(String[] args) {

    }
}
