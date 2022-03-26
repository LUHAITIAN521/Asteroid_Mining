package project.lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Asteroids implements Neighbors{
    private int depth;
    private boolean closetosun;

    Resource resource = new Resource();
    Sun sun;


    public Asteroids() {

    }

    public  void createcore(){

    }

    public Resource createresource(){
        return new Resource() ;
    }

    public void localresource(){

    }

    public Resource Getcore(){
        UnitTest.methodTest("Asteroid.Getcore()");
        UnitTest.TestEnd("Asteroid.Getcore()");
    	return new Resource();
    }

    public void GetNeighbor(){
    	
    }

    public void RemoveResources(){
    	UnitTest.methodTest("RemoveResource()");
    }

    public void explode(){
    	UnitTest.methodTest("explosion");
    	RemoveResources();
    	
    }
    
    public void LocalResource(){
        
    }

    public void CreateCore() {

    }

    public void CreateResource() {

    }

    public void CheckClosestToSun(){
        Uranium uranium = new Uranium() ;
        Settler settler = new Settler();
        Asteroids asteroids = new Asteroids();
        UnitTest.methodTest("perihelion");
        while(closetosun){
            asteroids.localresource();
            System.out.println("local resource()");
            uranium.UnderTheSun(asteroids);
            System.out.println("UnderTheSun()");
            asteroids.RemoveResources();
            System.out.println("RemoveResources()");
            asteroids.explode();
            System.out.println("explode()");
            settler.HitByExplode();
            System.out.println("HitByExplode()");
            settler.die();
            System.out.println("die()");
            asteroids.RemoverTraveler(settler);
            System.out.println("RemoverTraveler()");
            sun.RemoveAsteroids();
            System.out.println("RemoveAsteroids()");
        }
        UnitTest.TestEnd("perihelion");
    }

    public void RemoverTraveler(Traveler traveler) {
    }
    public int checkhollow(Asteroids asteroids) throws IOException{
    	System.out.println("Check hide or not hide(Yes/No)");
    	BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
     	String input = r.readLine();
     	if(input.equals("Yes")) {
     		return 1;
     	}else {return 2;}
    	
    }

    @Override
    public void TransferTraveler() {

    }
}
