package project.lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Asteroids implements Neighbors{
    private int depth;
    private boolean closetosun=false;
    String aID;
Asteroids(String ID)
	{
		aID=ID;
	}
public void setdepth() 
	{
        	depth = new Random().nextInt(15);
        	if(depth<5)
        	{
        		depth = 5;
        	}
        }
public int getdepth() 
	{
        	return depth;
        }
    Resource resource = new Resource();
    Sun sun = new Sun();

    public void setClosetosun(){
        closetosun=true;
    }

    public  void createcore(){
        

    }

    public Resource createresource(){
        return new Resource() ;
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
    
    public void LocalResource(Resource resource){
        A1.(resource);
        
    }

    public void CreateCore() {

    }

    public void CreateResource() {

    }

    public void CheckClosestToSun() throws IOException {
        Uranium uranium = new Uranium() ;
        Settler settler = new Settler();
        Asteroids asteroids = new Asteroids();
        WaterIce waterIce = new WaterIce();
        System.out.println("If asteroid is closes to sun(Y/N)?");
        String input;
        BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
        input = r1.readLine();//User input
        if (input.equals("Y")){
            System.out.println("If asteroid has uranium or water ice or something else(u/w/s)?");//choose resource types
            input = r1.readLine();
            asteroids.setClosetosun();
            if(input.equals("u")){
                System.out.println("The asteroid is close to sun");
                asteroids.LocalResource(uranium);//check what kind of resource currently on the asteroid.here is uranium
                System.out.println("Check the current resource is uranium");
                uranium.UnderTheSun(asteroids);
                asteroids.explode();//the asteroid exploded
                System.out.println("asteroid is exploded");
                sun.RemoveAsteroids();//the exploded asteroid will disappear.
                System.out.println("Remove it from the game field");
            }
            else if (input.equals("w")){
                asteroids.LocalResource(waterIce);
                waterIce.UnderTheSun(asteroids);
                System.out.println("Remove water ice from the asteroid");
            }
            else if (input.equals("s")){
                System.out.println("Nothing happen");
            }
            else {System.out.println("Error enter!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");}
        }
        else{
            System.out.println("Nothing happen");
        }
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

    @Override
    public void AddNeighbor() {
   
      

    }

    @Override
    public void RemoveNeighbor() {

    }
}
