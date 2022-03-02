package point;

// import java.util.*;
import java.awt.Polygon;

public class Last02 {
    public static void main(String[] args) {
        Coordinate myIns = new Coordinate();
        myIns.polygonQuantity();
        int[] pointX = new int[Coordinate.vertices];
        int[] pointY = new int[Coordinate.vertices];

        Coordinate[] points = new Coordinate[Coordinate.vertices + 1];
        for (int i = 0; i < points.length; i++) {
            if (i != Coordinate.vertices) {
                points[i] = new Coordinate();
                points[i].printOriginalPoint(i);
                pointX[i] = points[i].xPoint;
                pointY[i] = points[i].yPoint;
                myIns.jadgeMax(points[i], i);
            } else {
                points[i] = new Coordinate();
                points[i].printOriginalPoint();
                myIns.XXpoint = points[i].xPoint;
                myIns.XYpoint = points[i].yPoint;
            }

        }

        Polygon polygon = new Polygon(pointX, pointY, Coordinate.vertices);

        myIns.checkPolygon(polygon);
        myIns.mostFar();
      

    }

}