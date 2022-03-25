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


    public void Build_space_station(){


    }

    public void Build_robot(){
        Settler s = new Settler();
        s.checkresource();//to check whether the resources  for building robots are adequate
        Game.AddRobot();
    }

    public void Drill(){
        Settler settler = new Settler();
        UnitTest.methodTest("Settler.Drill()");
        settler.Travel(asteroids);
        settler.GetAsteroid(asteroids);
        settler.Drill();
        asteroids.Getcore();
        UnitTest.TestEnd("Settler.Drill()");
    }

     public void Mine(Asteroids a) throws IOException
	 {
		 Settler st= new Settler();
		 UnitTest.methodTest(" Settler.Mine()");
		 asteroids.LocalResource();
		 st.CarryResource();
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
        TP_GATE tp = new TP_GATE();
        checkresource();//check wether the resources for building TP_Gates are enough.
        tp.paired();// two TP_Gates consist of a pair, TP_Gates must be used in pairs to transfer travelers.

    }
    public void place_TP_Gate(){
        TP_GATE tp = new TP_GATE();
        Asteroids a = new Asteroids();
        tp.paired();
        a.GetNeighbor();//settlers move to the neighboring asteroid with a TP_Gate.
        AddNeighbor();

    }
    public void AddNeighbor(){

    }
    


}
