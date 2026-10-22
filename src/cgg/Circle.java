package cgg;

import tools.Color;
import tools.Vec2;

public class Circle {

    private Vec2 position;
    private double radius;
    private Color farbe;

    public Circle(Vec2 position, double radius, Color farbe){
        this.position = position;
        this.radius = radius;
        this.farbe = farbe;


    }

    public boolean coversPoint(Vec2 point){

        double dx = position.x() - point.x();
        double dy = position.y() - point.y();

        double quadrieren = Math.pow(dx, 2) + Math.pow(dy, 2);
        double abstand = Math.sqrt(quadrieren);
        
        if(abstand > radius){
            return false;
        }

        return true;
    }


    public Color getFarbe() {
    return farbe;
}
    
}
