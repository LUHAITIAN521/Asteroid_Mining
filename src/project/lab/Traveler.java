package project.lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Traveler {
    Sun sun = new Sun();
    TP_GATE tp = new TP_GATE();
    TP_GATE tp2 = new TP_GATE();
    Resource r= new Resource();
    Game g = new Game();

    //the method is for both robot and settler
    public void Travel(Asteroids a){

    }
    
    //the method is for both robot and settler
    //We need to check the depth of rock which should be larger than 0
    public void Drill(Asteroids a) throws IOException{
        if(a.getdepth()>0)
        {
            a.depth--;
            System.out.println("Drill"+a.getaID()+"successfully");
        }
        else
        {
            System.out.println("Failed");
        }
    }

    public void die(){

    }
     public void HitByExplode(){
    	 
     }

     public boolean Avoidance(Asteroids a) throws IOException{
        if(a.getdepth()==0&&a.Ishollow==true)
        {
            System.out.println("Hiden");
            return  true;

        }
        else
        {

            return false;
        }
    }

     public void GetAsteroid(Asteroids asteroids){

     }

     public void ChangeAsteroid(Asteroids asteroids){

     }
     public void useTP_Gate(Traveler traveler){

         GetAsteroid(new Asteroids());
         tp.paired(tp2);
         Travel();
         RemoverTraveler(traveler);
         g.AddTraveler(traveler);
    }
}
