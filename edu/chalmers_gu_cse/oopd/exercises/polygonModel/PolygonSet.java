package edu.chalmers_gu_cse.oopd.exercises.polygonModel;

import edu.chalmers_gu_cse.oopd.exercises.polygonModel.shapes.Polygon;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/* package-private */ class PolygonSet extends JComponent {
    private final List<Polygon> polygons = new ArrayList<>();
    public void addPolygon(Polygon p){
        polygons.add(p);
    }

    public void paint(Graphics g){
        for (Polygon polygon : polygons) {
            polygon.paint(g);
        }
    }

    public void translate(int x, int y){
        for (Polygon p : polygons) {
            p.translate(x,y);
            // INTE BRA ATT DETTA GÅR
            // p.getCenterPoint().x = 0;
        }
    }
}
