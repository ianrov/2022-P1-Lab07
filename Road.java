import java.awt.*;
import java.applet.*;

public class Road {

    public static void drawAsphalt(Graphics g) {

        //Asphalt
        g.setColor(new Color(42, 43, 42));
        g.fillRect(0, 200, 1000, 250);

    }

    public static void drawRoadLines(Graphics g) {
        //Road Lines

        g.setColor(Color.WHITE);
        g.fillRect(0, 205, 1000, 3);
        g.fillRect(0, 440, 1000, 3);

        //Double Yellow

        g.setColor(Color.YELLOW);
        g.fillRect(0, 318, 1000, 3);
        g.fillRect(0, 327, 1000, 3);

    }
}

