package project.lab;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class Sun {
    public ArrayList<Asteroids> Asteroid = new ArrayList<Asteroids>();
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

           if(i<10)
        	   Asteroid.add(new Asteroids("A"+"0"+Integer.toString(i)));
           else if(i>=10)
        	   Asteroid.add(new Asteroids("A"+Integer.toString(i)));
        }
        
	}
    
    public void createstorm(){
        Sun sun = new Sun();
    }


    public void RemoveAsteroids(){

    }
}
