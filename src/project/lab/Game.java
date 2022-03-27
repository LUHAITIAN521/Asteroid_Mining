package project.lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Game {


  public void enggame(){
	  UnitTest.methodTest("Game.endgame()");
	  //The game end
	  System.out.println("You lost game");
	  UnitTest.TestEnd("Game.endgame()");
  }

  public void Initial() throws IOException
	{
		String enter;
		UnitTest.methodTest("Game.Initial()");
		System.out.println("Please choose play mode:");
        System.out.println("1:SinglePlayer");
        System.out.println("2.MultiplePlayer");
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        enter = br.readLine();
        int num = Integer.parseInt(enter);
        if(num==1)
        {
            SinglePlayer();
        }
        else if(num==2){
            MultiplePlayer();
        }
        else 
        System.out.println("Invaild choose");
        
	}
	public void SinglePlayer()
	{
		UnitTest.methodTest("Game.SinglePlayer()");
		Sun s=new Sun();
		Asteroids a=new Asteroids();
		s.AddAsteroids();
		a.CreateCore();
		a.CreateResource();
		UnitTest.TestEnd(" Settler.SinglePlayer()");
	}
	public void MultiplePlayer()
	{
		UnitTest.methodTest("Game.MultiplePlayer()");
		Sun s=new Sun();
		Asteroids a=new Asteroids();
		s.AddAsteroids();
		a.CreateCore();
		a.CreateResource();
		UnitTest.TestEnd(" Settler.MultiplePlayer()");
	}

  public void InitialPosition(Settler s){
    Sun sun = new Sun();
    UnitTest.methodTest("set position");
	AddSettler(s);
	
	UnitTest.TestEnd("set position");
	
  }
  public void AddRobot(){
	  Robot robot = new Robot();
  }
  public void AddSettler(Settler s){
	  UnitTest.methodTest("add settler");
  }
  
  public void RemoveRobot(Robot r) {
	  UnitTest.methodTest("Game.RemoveRobot()");
	  //remove the robot from the map
	  System.out.println("The robot is removed from the map");
	  UnitTest.TestEnd("Game.RemoveRobot()");
  }
  
  public void RemoveSettler(Settler s) {
	  UnitTest.methodTest("Game.ReomveSettler");
	  //remove the settler from the map
	  System.out.println("The settler is removed from the map");
	  UnitTest.TestEnd("Game.ReomveSettler");
  }

}
