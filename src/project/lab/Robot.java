package project.lab;

import java.io.IOException;

public class Robot extends Traveler  {

    Traveler t = new Traveler();
    Asteroids a = new Asteroids();
    Game g = new Game();

    public void die(){
        Robot r= new Robot();
        g.RemoveRobot(r);
    }

    public void Avoidance() throws IOException {
        sun.createstorm();
        Asteroids asteroids = new Asteroids();
        if(asteroids.checkhollow(asteroids)==1){//check whether the core of asteroid is hollow
            asteroids.Getcore();//find the core of Asteroids to hide from sun storm
            System.out.println("Robot hide successfully");
        }
        else{
            //if()
            die();
        }
    }


}

