package project.lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Game {

//	public Settler st1;
//    public Settler st2;
    Sun s = new Sun();
    public ArrayList<Asteroids> Asteroid = new ArrayList<Asteroids>();
    public ArrayList<Robot> rlist = new ArrayList<Robot>();
    public ArrayList<Settler> slist = new ArrayList<Settler>();
    public ArrayList<TP_GATE> tlist =new ArrayList<TP_GATE>();
  public void enggame(){
	  //The game end
	  System.out.println("You lost game");
  }

    public void AddAsteroids() throws IOException
    {
        String enter;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter the number of asteroids");
        enter = br.readLine();
        int num = Integer.parseInt(enter);
        if(num<15)//at least 15 asteroids
        {
            System.out.println("Not allowed value,asteroids number default:15");
            num=15;
        }
        for(int i =0;i<num;i++)//ID:00~XX
        {
            System.out.println(i+" asteroids have added to game");
            Asteroid.add(new Asteroids(i));
            System.out.println(Asteroid.get(i).GetResource().GetType());
        }

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
        AddAsteroids();
//        st1=new Settler("a");
//        slist.add(st1);
//        st1.initialposition(Asteroid.get(0));
//        System.out.println(st1.getClass().getSimpleName()+"Travel successfully");
	}
	public void MultiplePlayer() throws IOException {
        AddAsteroids();
//        st1=new Settler("a");
//        st2=new Settler("b");
//        st1.initialposition(Asteroid.get(0));
//        st2.initialposition(Asteroid.get(0));
	}

//  public void InitialPosition(Settler s,Asteroids a) throws IOException
//  {
//
//  }
//  public void AddRobot() throws IOException
//  {
//        Robot r1=new Robot();
//        rlist.add(r1);
//  }
//  public void AddTraveler(Traveler s,Asteroids a) throws IOException {
//
//      String enter;
//          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//          System.out.println("Please enter the number of settlers");
//          enter = br.readLine();
//          int num = Integer.parseInt(enter);
//
//          for(int i =1;i<num;i++)//ID:S01~SXX
//          {
//
//             if(i<10)
//               slist.add(new Settler("S"+"0"+Integer.toString(i)));
//             else if(i>=10)
//               slist.add(new Settler("S"+Integer.toString(i)));
//
//    }
//  }
  
  public void RemoveRobot(Robot r) {
  }
  
  public void RemoveSettler(Settler s) {
  }

  public void AddTraveler() {
  }


}
