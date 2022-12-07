
import java.awt.*;
import java.applet.*;
public class DrawScene extends Applet{


        public void paint(Graphics g){

            BackGround.drawSky(g);
            BackGround.drawMountain(g);
            BackGround.drawSun(g);
            BackGround.drawGrass(g);
            Road.drawAsphalt(g);
            Road.drawRoadLines(g);
            Car.drawCarBody(g);
            Car.drawCarWindows(g);
            Car.drawBodyDetail(g);
            Car.drawWheels(g);


        }

}
