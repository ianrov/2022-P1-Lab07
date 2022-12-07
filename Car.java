import java.awt.*;
import java.applet.*;


public class Car{

    //Body
    public static void drawCarBody(Graphics g) {

        g.setColor(Color.RED);

        Polygon Car = new Polygon();
        Car.addPoint(400, 215);
        Car.addPoint(500, 215);
        Car.addPoint(550, 245);
        Car.addPoint(350, 245);
        g.fillPolygon(Car);

        g.fillRect(300, 245, 300, 40);
    }
        //Windows
        public static void drawCarWindows(Graphics g) {
            g.setColor(Color.BLACK);

            Polygon Window = new Polygon();
            Window.addPoint(405, 219);
            Window.addPoint(495, 219);
            Window.addPoint(540, 245);
            Window.addPoint(360, 245);
            g.fillPolygon(Window);
        }
        //Body Detail
        public static void drawBodyDetail(Graphics g) {
            g.setColor(Color.RED);

            g.fillRect(465, 215, 2, 50);
        }

        //Wheels
        public static void drawWheels(Graphics g) {
            g.setColor(Color.BLACK);

            g.fillOval(315,260,45,45);
            g.fillOval(530,260,45,45);

            g.setColor(Color.WHITE);

            g.fillOval(332,277,10,10);
            g.fillOval(547,277,10,10);

        }




    }
