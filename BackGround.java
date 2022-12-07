import java.awt.*;
import java.applet.*;

public class BackGround {

    //Sky
    public static void drawSky(Graphics g) {

        g.setColor(new Color(119, 202, 247));
        g.fillRect(0, 0, 1000, 250);

    }
    //Mountain
    public static void drawMountain(Graphics g) {

        g.setColor(new Color(150, 163, 160));
        Polygon mountian = new Polygon();
        mountian.addPoint(300, 200);
        mountian.addPoint(350, 100);
        mountian.addPoint(400, 75);
        mountian.addPoint(450, 50);
        mountian.addPoint(500, 100);
        mountian.addPoint(650, 200);
        g.fillPolygon(mountian);

        g.setColor((Color.WHITE));
        Polygon Snow = new Polygon();
        Snow.addPoint(450, 35);
        Snow.addPoint(350, 100);
        Snow.addPoint(475, 75);
        g.fillPolygon(Snow);
    }
        //Sun
        public static void drawSun(Graphics g) {
            g.setColor(new Color(250, 205, 10));
            g.fillOval(10, 10, 75, 75);
        }
        //Grass
        public static void drawGrass(Graphics g){

        g.setColor(new Color(8,135,14));
        g.fillRect(0,400,1000,300);


    }
}

