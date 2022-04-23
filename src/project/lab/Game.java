package project.lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Game {

	private Settler st1;
    private Settler st2;
    Sun s = new Sun();
  public void enggame(){
	  //The game end
	  System.out.println("You lost game");
  }

  public void Initial() throws IOException //8.2.1 test
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
	public void SinglePlayer() throws IOException {
        s.AddAsteroids();
        st1=new Settler("a");
		InitialPosition(st1);
	}
	public void MultiplePlayer() throws IOException {
        s.AddAsteroids();
        st1=new Settler("a");
        st2=new Settler("b");
		InitialPosition(st1);
		InitialPosition(st2);
	}

  public void InitialPosition(Settler s){

	AddTraveler(s);
	
  }
  public void AddRobot() throws IOException
  {
        Robot r1=new Robot();
        s.rlist.add(r1);
  }
  public void AddTraveler(Traveler s){
    {
      String enter;
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          System.out.println("Please enter the number of settlers");
          enter = br.readLine();
          int num = Integer.parseInt(enter);
       
          for(int i =1;i<num;i++)//ID:S01~SXX
          {
  
             if(i<10)
               Settler.add(new settlers("S"+"0"+Integer.toString(i)));
             else if(i>=10)
               Settler.add(new settlers("S"+Integer.toString(i)));
          }
          
    }
  }
  
  public void RemoveRobot(Robot r) {
  }
  
  public void RemoveSettler(Settler s) {
  }

  public void AddTraveler() {
  }
}
