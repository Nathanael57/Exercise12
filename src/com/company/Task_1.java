package com.company;

enum shapes
{
    Square, Rectangle, Circle, Trapezoid, Rhombus, Triangle, Oval, Hexagon
}

public class Task_1
{
    public static void main(String[] args)
    {
        shapes ob;
        System.out.println("Below are all the shapes.");

        shapes allShapes[] = shapes.values();
        for (shapes m : allShapes)
            System.out.println(m);

        ob = shapes.valueOf("Trapezoid");
        System.out.println("From all these shapes, one is: " + ob);

    }

}