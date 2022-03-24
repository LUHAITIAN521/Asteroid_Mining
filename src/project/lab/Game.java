package project.lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Game {
  Settler settler = new Settler();

  public void enggame(){
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

  public void InitialPosition(){
    Sun sun = new Sun();
  }
}
