package project.lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.lang.*;

public class Settler {
    Sun sun = new Sun();
    Asteroids asteroids = new Asteroids();
    ArrayList<String> resources = new ArrayList<String>();
    TP_GATE tp_gate = new TP_GATE();
    Resource resource = new Resource();

    public void Build_space_station(){

    }

    public void Build_robot(){

    }

    public void Drill(){

    }

     public void Mine(Asteroids a) throws IOException
	 {
		 Settler st= new Settler();
		 UnitTest.methodTest(" Settler.Mine()");
		 a.LocalResource();
		 st.CarryResource();
		 a.RemoveResources();
		 UnitTest.TestEnd(" Settler.Mine()");
	 }
    public void DropResource(Resources r)
	 {
		 UnitTest.methodTest(" Settler.DropResource()");
		 a.LocalResource();
		 UnitTest.TestEnd(" Settler.DropResource()");
	 }
    private ArrayList<String> CarryResource() {
        UnitTest.methodTest("Settler.CarryResource()");
        UnitTest.TestEnd("Settler.CarryResource()");
        return resources;
    }

}
