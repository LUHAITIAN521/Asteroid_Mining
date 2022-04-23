package project.lab;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.BufferedReader;


public class Sun {
    public ArrayList<Asteroids> Asteroid = new ArrayList<Asteroids>();
    public ArrayList<Robot> rlist = new ArrayList<Robot>();
    public ArrayList<Settler> slist = new ArrayList<Settler>();
    public ArrayList<T>
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
        for(int i =1;i<num;i++)//ID:A01~AXX
        {
            System.out.println(num+" asteroids have added to game");
            Asteroid.add(new Asteroids(i));
        }
        
	}
    
       public void createstorm()
       {
        Sun sun = new Sun();
       }
	public void GetAsteroid(ArrayList<Asteroids> a)
	{
		this.Asteroid=a;
	}

    public void RemoveAsteroids(){

    }
}
