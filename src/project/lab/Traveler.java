package project.lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Traveler {
    Sun sun = new Sun();
    TP_GATE tp = new TP_GATE();
    TP_GATE tp2 = new TP_GATE();
    Asteroids a = new Asteroids();
    Resource r= new Resource();
    Game g = new Game();
    
    public void Travel(){
    	Settler settler = new Settler();
        UnitTest.methodTest("Settler Travel()");
        settler.GetAsteroid(a);
        System.out.println("GetAsteroid()");
        a.GetNeighbor();
        System.out.println("GetNeighbor");
        a.TransferTraveler();
        System.out.println("TransferTraveler");
        a.RemoverTraveler(settler);
        System.out.println("RemoveTraveler");
        g.AddTraveler(settler);
        System.out.println("AddTraveler()");
        UnitTest.TestEnd("Settler Travel()");

    }
    
    //the class is for both robot and settler
    //We need to check the depth of rock which should be larger than 0
    public void Drill() throws IOException{
    	String input;
    	//First we should check the depth of rock
    	System.out.println("If depth of rock larger than 0?(Yes/No)");
      	 BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
      	 input = r1.readLine();
      	 //the depth over 0 which the traveler can do operation
      	 if(input.equals("Yes")) {
      		 System.out.println("the depth of rock decrease one unit...");
      		 GetAsteroid(a);
      		 r=a.Getcore();//get the information of resource inside the asteroid
      		 System.out.println("Work Complete");
    		 
      //the condition for the sum storm
      		System.out.println("If there is the sum storm happened?(Yes/No)");
      		BufferedReader r2 = new BufferedReader(new InputStreamReader(System.in));
         	input = r2.readLine();
         	if(input.equals("Yes")) {
         		
         		Avoidance();  //check the hide operation which is auto operation
         		
         	}
      //the condition for the explosion of asteroid 
         	System.out.println("If is closed to perihlion?(Yes/No)");
      		BufferedReader r3 = new BufferedReader(new InputStreamReader(System.in));
         	input = r3.readLine();
         	if(input.equals("Yes")) {
         		a.CheckClosestToSun();
         		Uranium ur=new Uranium();//only the uranium can explode by sun
         		ur.UnderTheSun(a); //the object will do reaction
         		HitByExplode();
         		die();
         		System.out.println("remove the traveller");
         	}
      	 }
      	 else {
      		 //the check of depth is not successful
      		 GetAsteroid(a);
     		 r=a.Getcore();//get the information of resource inside the asteroid
      		 System.out.println("The depth of rock equal to 0, failed operation");
      	 }
    }

    public void die(){
    	UnitTest.methodTest("Settler.Die()");//method for the travel die
    	
    }
     public void HitByExplode(){
    	 UnitTest.methodTest("HitByExplode()");
    	 
     }

     public void Avoidance() throws IOException{
         sun.createstorm();
         Asteroids asteroids = new Asteroids();
         if(asteroids.checkhollow(asteroids)==1){//check whether the core of asteroid is hollow
            asteroids.Getcore();//find the core of Asteroids to hide from sunstorm
            System.out.println("hide successfully");
         }
         else{
             die();
             System.out.println("failed, traveller die");
         }

        
         

     }

     public void GetAsteroid(Asteroids asteroids){
    	 UnitTest.methodTest("Asteroids.GetAsteroid()");
    	 UnitTest.TestEnd("Asteroids.GetAsteroid()");
     }

     public void ChangeAsteroid(Asteroids asteroids){

     }
     public void useTP_Gate(Traveler traveler){

         GetAsteroid(new Asteroids());
         tp.paired(tp2);
         Travel();
         a.RemoverTraveler(traveler);
         g.AddTraveler(traveler);

     }

}
