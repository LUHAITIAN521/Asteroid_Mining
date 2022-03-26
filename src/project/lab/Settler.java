package project.lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.lang.*;

public class Settler extends Traveler {
    Sun sun = new Sun();
    Asteroids asteroids = new Asteroids();
    ArrayList<String> resources = new ArrayList<String>();
    TP_GATE tp_gate = new TP_GATE();
    Resource resource = new Resource();
    Game game = new Game();

    Asteroids asteroids2 = new Asteroids();

    public void Build_space_station(){


    }

    public void Travel(){
        Settler settler = new Settler();
        UnitTest.methodTest("Settler Travel()");
        settler.GetAsteroid(asteroids);
        System.out.println("GetAsteroid()");
        asteroids.GetNeighbor();
        System.out.println("GetNeighbor");
        asteroids.TransferTraveler();
        System.out.println("TransferTraveler");
        asteroids.RemoverTraveler(settler);
        System.out.println("RemoveTraveler");
        game.AddTraveler();
        System.out.println("AddTraveler()");
        UnitTest.TestEnd("Settler Travel()");
    }

    public void Build_robot(){
        Settler s = new Settler();
        s.checkresource();//to check whether the resources  for building robots are adequate
        game.AddRobot();
    }

    public void Drill(){
        Settler settler = new Settler();
        UnitTest.methodTest("Settler.Drill()");
        settler.Travel();
        System.out.println("Travel()");
        settler.GetAsteroid(asteroids);
        System.out.println("GetAsteroid()");
        settler.Drill();
        System.out.println("Drill()");
        asteroids.Getcore();
        System.out.println("Get core()");
        UnitTest.TestEnd("Settler.Drill()");
    }

     public void Mine(Asteroids a) throws IOException
	 {
         Settler settler = new Settler();
		 UnitTest.methodTest(" Settler.Mine()");
		 asteroids.LocalResource();
		 settler.CarryResource();
		 asteroids.RemoveResources();
		 UnitTest.TestEnd(" Settler.Mine()");
	 }
    public void DropResource(Resource r)
	 {
		 UnitTest.methodTest(" Settler.DropResource()");
		 asteroids.LocalResource();
		 UnitTest.TestEnd(" Settler.DropResource()");
	 }
    private ArrayList<String> CarryResource() {
        UnitTest.methodTest("Settler.CarryResource()");
        UnitTest.TestEnd("Settler.CarryResource()");
        return resources;
    }
    public void checkresource(){

    }
    public void Build_TP_Gate(){
        checkresource();//check wether the resources for building TP_Gates are enough.
        tp_gate.paired();// two TP_Gates consist of a pair, TP_Gates must be used in pairs to transfer travelers.

    }
    public void place_TP_Gate(){
        tp_gate.paired();
        asteroids.GetNeighbor();//settlers move to the neighboring asteroid with a TP_Gate.
        AddNeighbor();
    }
    public void AddNeighbor(){

    }
    


}
