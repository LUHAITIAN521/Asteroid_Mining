package project.lab;

import java.io.IOException;

public class Robot extends Traveler  {

    Traveler t = new Traveler();
    Game g = new Game();

    public void die(){
        Robot r= new Robot();
        g.RemoveRobot(r);
    }





}

