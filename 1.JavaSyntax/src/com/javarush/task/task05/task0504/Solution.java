package com.javarush.task.task05.task0504;


/* 
Трикотаж
*/

public class Solution {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Tom", 2, 5, 7);//напишите тут ваш код
        Cat cat2 = new Cat("Rom", 3, 6, 6);//напишите тут ваш код
        Cat cat3 = new Cat("Yom", 5, 8, 9);//напишите тут ваш код
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}