package com.absoft.unit3;

import com.absoft.unit3.robots.BalletDanceRobot;
import com.absoft.unit3.robots.DancingRobot;
import com.absoft.unit3.robots.FolkDanceRobot;
import com.absoft.unit3.shape.Circle;
import com.absoft.unit3.shape.Rectangle;
import com.absoft.unit3.shape.Shape;
import com.absoft.unit3.shape.Square;

public class Main {
    public static void main(String[] args) {
        showRobots();
        showShapes();
    }

    public static void showShapes() {
        System.out.println("\n===========Rectangle=======\n");
        Shape shape1 = new Rectangle(4, 8);
        System.out.println("Square: " + shape1.getSqare());

        System.out.println("\n===========Circle==========\n");
        Shape shape2 = new Circle(6);
        System.out.println("Square: " + shape2.getSqare());

        System.out.println("\n=====\n");
        Circle shape3 = new Circle(4);
        System.out.println("Start radius: " + shape3.getRadius());
        shape3.setRadius(3);
        System.out.println("Setted radius: " + shape3.getRadius());
        System.out.println("Square with new radius: " + shape3.getSqare());


        System.out.println("\n=======!");
        Rectangle variable = new Rectangle(1, 2);
        System.out.println(variable.getSqare());

        variable = new Square(3);
        System.out.println(variable.getSqare());
    }

    private static void showRobots() {
        printRobot(new BalletDanceRobot());
        printRobot(new FolkDanceRobot());
    }

    private static void printRobot(DancingRobot dancingRobot) {
        System.out.println("=========\n");
        System.out.println("Type 1: " + dancingRobot.getDanceType1());
        System.out.println("Type 2: " + dancingRobot.getDanceType2());
        System.out.println("Default dance type: " + dancingRobot.getDefaultDanceType());
        System.out.println("=========\n");
    }
}
