package com.absoft.unit3.robots;

public class FolkDanceRobot extends DancingRobot{

    @Override
    public String getDanceType1() {
        return "Country road";
    }

    @Override
    public String getDanceType2() {
        return "Sweet home Alabama";
    }

    @Override
    public String getDefaultDanceType() {
        return "American pie";
    }
}
