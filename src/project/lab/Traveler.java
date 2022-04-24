package project.lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Traveler {
//    Game g = new Game();
    Asteroids as = null;
    //the method is for both robot and settler
    public void Travel(Asteroids a)
    {
        if(a.AddNeighbor(as,a)==true)
        {
            as=a;
            System.out.println("successfully "+a.getaID());
        }
        else
        {
            System.out.println("Failed");
        }
    }

    public void initialposition(Asteroids a)
    {
        as=a;
    }


    public  Asteroids getA(){
        return as;
    }

    public void SetA(Asteroids a){
        this.as=a;
    }
    //the method is for both robot and settler
    //We need to check the depth of rock which should be larger than 0
    public void Drill(Asteroids a) throws IOException{
        if(a.getdepth()>0)
        {
            a.depth--;
            System.out.println("Drill "+a.getaID()+" successfully");
            System.out.println("remaining depth "+a.getdepth());
        }
        else
        {
            System.out.println("Failed");
        }
    }

    public void die(){

    }
     public void HitByExplode(){
    	 
     }

     public boolean Avoidance(Asteroids a) throws IOException{
        if(a.getdepth()==0&&a.Ishollow==true)
        {
            System.out.println("Hiden");
            return  true;

        }
        else
        {

            return false;
        }
    }

     public void GetAsteroid(Asteroids a)
     {

     }

     public void ChangeAsteroid(Asteroids asteroids){

     }

}
