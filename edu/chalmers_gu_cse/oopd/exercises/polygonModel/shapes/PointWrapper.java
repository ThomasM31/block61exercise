//package edu.chalmers_gu_cse.oopd.exercises.polygonModel.shapes;

import java.awt.*;

 // Här introduceras ett adapter-pattern, med bara de funktioner vi vill ha
public class PointWrapper {

    private Point point;
    public PointWrapper(Point p) {
        point = p;
    }

    public double getY(){ return point.y;}
    public double getX(){ return point.x;}


}