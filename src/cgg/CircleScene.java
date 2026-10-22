package cgg;

import java.util.ArrayList;

import tools.Color;
import tools.Vec2;

public class CircleScene {

    private ArrayList<Circle> kreise;


    public CircleScene(){

        kreise = new ArrayList<>();
    }

    public void kreisHinzufuegen(Circle kreis){

        kreise.add(kreis);
    }

    public Color getColor(Vec2 point){

        for(Circle k : kreise){
            if(k.coversPoint(point)){

                return k.getFarbe();
            }
            
        }
        return Color.black;
    }
    
}
