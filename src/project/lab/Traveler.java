package project.lab;

public class Traveler {
    Sun sun = new Sun();
    TP_GATE tp = new TP_GATE();
    Asteroids a = new Asteroids();
    Game g = new Game();
    public void Travel(){


    }

    public void Drill(){

    }

    public void die(){

    }
     public void HitByExplode(){

     }

     public void Avoidance(){
         sun.createstorm();
         Asteroids asteroids = new Asteroids();
         if(asteroids.checkhollow(asteroids)==1){//check whether the core of asteroid is hollow
            asteroids.Getcore();//find the core of Asteroids to hide from sunstorm
         }
         else{
             die();
         }

        
         

     }

     public void GetAsteroid(Asteroids asteroids){

     }

     public void ChangeAsteroid(Asteroids asteroids){

     }
     public void useTP_Gate(Traveler traveler){

         GetAsteroid(new Asteroids());
         tp.paired();
         Travel();
         a.RemoverTraveler(traveler);
         g.AddTraveler();

     }

}
