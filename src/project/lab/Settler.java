package project.lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.lang.*;

public class Settler extends Traveler {
    int ucount = 0;
    int icount =0;
    int ccount = 0;
    int wcount =0;
    int count = ucount+icount+ccount+wcount;
    Sun sun = new Sun();
    Asteroids asteroids = new Asteroids();
    ArrayList<String> resources = new ArrayList<String>();
    TP_GATE tp_gate = new TP_GATE();
    TP_GATE tp_gate2 = new TP_GATE();
    Resource resource = new Resource();
    Game game = new Game();

    Asteroids asteroids2 = new Asteroids();

    public void Build_space_station(){


    }

    public void Build_robot(){
        Settler s = new Settler();
        if(icount>=1&&ccount>=1&&ucount>=1){
        game.AddRobot();
        }
        else{
            System.out.println("the resources is not enough");
        }
    }

     public void Mine(Asteroids a) throws IOException
	 {
         Settler settler = new Settler();
         Resource resource=new Resource();
		 UnitTest.methodTest(" Settler.Mine()");
		 asteroids.LocalResource(resource);
		 settler.CarryResource();
		 asteroids.RemoveResources();
		 UnitTest.TestEnd(" Settler.Mine()");
	 }
    public void DropResource(Resource r)
	 {
         count--;
         ucount--;
         Resource resource = new Resource();
		 UnitTest.methodTest(" Settler.DropResource()");
		 asteroids.LocalResource(resource);
		 UnitTest.TestEnd(" Settler.DropResource()");
	 }
    private ArrayList<String> CarryResource() {
        count++;
        ucount++;
        UnitTest.methodTest("Settler.CarryResource()");
        UnitTest.TestEnd("Settler.CarryResource()");
        return resources;
    }
    public void checkresource(){
        if(count>10){
            System.out.println("settlers can not carry so many resources");
        else(){

        }
        }
    	
    }
    public void Build_TP_Gate(){
         
        if(icount>=2&&wcount>=1&&ucount>=1){
        TP_GATE G1=new TP_GATE();//create the first gate
        TP_GATE G2=new TP_GATE();//create the second gate
        
        UnitTest.methodTest("Build_TP_Gate");
        G1.paired(G2);// two TP_Gates consist of a pair, TP_Gates must be used in pairs to transfer travelers.
        }
        else{
            System.out.println("the resources is not enough");
        }
    }
    public void place_TP_Gate(){
        UnitTest.methodTest("place_TP_Gate");
    	tp_gate.paired(tp_gate2);//build the connection between two gates
        asteroids.GetNeighbor();//settlers move to the neighboring asteroid with a TP_Gate.
        AddNeighbor();
    }
    public void AddNeighbor(){
    	
    }

    public void die(){
        UnitTest.methodTest("Settler.Die()");//method for the travel die
        g.enggame();//Game over.
    }

    public void Avoidance() throws IOException{
        sun.createstorm();
        Asteroids asteroids = new Asteroids();
        if(asteroids.checkhollow(asteroids)==1){//check whether the core of asteroid is hollow
            asteroids.Getcore();//find the core of Asteroids to hide from sun storm
            System.out.println("Settler hide successfully");
        }
        else{
            //if()
            die();
            System.out.println("failed, traveller die");

        }
    }
    


}
