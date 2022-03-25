package project.lab;

public class Traveler {

    public void Travel(){


    }

    public void Drill(){

    }

    public void die(){

    }
     public void HitByExplode(){

     }

     public void Avoidance(){
         createstorm();
         Asteroids a = new Asteroids();
         if(a.checkhollow=1){//check whether the core of asteroid is hollow
            a.Getcore();//find the core of Asteroids to hide from sunstorm
         }
         else{
             die();
         }

        
         

     }

     public void GetAsteroid(Asteroids asteroids){

     }

     public void ChangeAsteroid(Asteroids asteroids){

     }
     public void useTP_Gate(t:Traveler){
         TP_GATE tp = new TP_GATE();
         Asteroids a = new Asteroids();
         Game g = new Game();
         GetAsteroid();
         tp.paired();
         Travel();
         a.RemoverTraveler();
         g.AddTraveler();

     }

}
