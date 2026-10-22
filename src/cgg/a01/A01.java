package cgg.a01;

import static tools.Color.*;
import static tools.Functions.*;

import cgg.Circle;
import cgg.ConstantColor;
import cgg.Image;
import tools.Color;
import cgg.CircleScene;

public class A01 {

    public static void main(String[] args) {

        int width = 400;
        int height = 400;

        // Bild erstellen
        Image image = new Image(width, height);

        // Kreisszene erstellen
        CircleScene scene = new CircleScene();

        // Roten Kreis erstellen
        Circle kreis = new Circle(vec2(200, 200), 50, Color.red);

        // Kreis zur Szene hinzufügen
        scene.kreisHinzufuegen(kreis);

        // Alle Pixel des Bildes durchlaufen
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {

                // Farbe des Pixels bestimmen
                Color farbe = scene.getColor(vec2(x, y));

                // Pixel einfärben
                image.setPixel(x, y, farbe);
            }
        }

        // Bild speichern
        image.writePng("images/a01.png");
    }
}
