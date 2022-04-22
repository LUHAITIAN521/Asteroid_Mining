package project.lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Game {

	private Settler st;
  public void enggame(){
	  //The game end
	  System.out.println("You lost game");
  }

  public void Initial() throws IOException
	{
		String enter;
	       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("0.Exit Game;1. Start Game");
        enter = br.readLine();
        int num = Integer.parseInt(enter);
        if(num==0)
        {
        	System.exit(0);
        }
        else if(num==1)
        {
        	System.out.println("1.SinglePlay;2.MutiplePlay");
        	enter = br.readLine();
            num = Integer.parseInt(enter);
            if(num==1)
            {
                SinglePlayer();
            }
            else if(num==2)
            {
                MultiplePlayer();
            }
            else 
            System.out.println("Wrong enter");
        }
        else 
        System.out.println("Wrong enter");
        
	}
	public void SinglePlayer()
	{
		Sun s=new Sun();
		Asteroids a=new Asteroids();
		s.AddAsteroids();
		a.CreateCore();
		a.CreateResource();
		InitialPosition(st);
	}
	public void MultiplePlayer()
	{
		Sun s=new Sun();
		Asteroids a=new Asteroids();
		s.AddAsteroids();
		a.CreateCore();
		a.CreateResource();
		InitialPosition(st);
		InitialPosition(st);
	}

  public void InitialPosition(Settler s){
    Sun sun = new Sun();
	AddTraveler(s);
	
  }
  public void AddRobot(){
	  Robot robot = new Robot();
  }
  public void AddTraveler(Traveler s){
  }
  
  public void RemoveRobot(Robot r) {
  }
  
  public void RemoveSettler(Settler s) {
  }

  public void AddTraveler() {
  }
}
