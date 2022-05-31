package com.absoft.unit3;

import com.absoft.unit3.robots.BalletDanceRobot;
import com.absoft.unit3.robots.DancingRobot;
import com.absoft.unit3.robots.FolkDanceRobot;

public class Main {
    public static void main(String[] args) {
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
