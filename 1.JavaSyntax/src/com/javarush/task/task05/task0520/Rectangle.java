package com.javarush.task.task05.task0520;

/* 
Создать класс прямоугольник (Rectangle)
*/


public class Rectangle {
    int top;
    int left;
    int height;
    int width;

    public Rectangle(int top, int left, int width, int height){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }
    public Rectangle(int top, int left){
        this.top = top;
        this.left = left;
    }

    public Rectangle(int top, int left, int width){
        this.top = top;
        this.left = left;
        this.width = width;
        height = width;

    }

    public Rectangle(Rectangle rec){
        Rectangle rec1 = rec;
    }

    //напишите тут ваш код

    public static void main(String[] args) {

    }
}
