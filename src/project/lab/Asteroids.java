package project.lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

public class Asteroids implements Neighbors{
    public int depth;
    private boolean closetosun=false;
    int aID;
    int rnum;
    ArrayList<Asteroids> Nei = new ArrayList<Asteroids>();
    Resource rs ;
    boolean Ishollow;
Asteroids(int ID)
	{
		aID=ID;
        int n=new Random().nextInt(1);
        if(n==1)
        {
            Ishollow=true;
        }
        else if(n==0)
        {
            Ishollow=false;
        }
        depth = new Random().nextInt(15);
        if(depth<5)
        {
            depth = 5;
        }
        if(Ishollow==false)
        {
            int i=new Random().nextInt(3);
            if(i==0)
            {
                rs = new Carbon();
            }
            else if(i==1)
            {
                rs=new Iron();
            }
            else if (i==2)
            {
                rs=new WaterIce();
            }
            else
            {
                rs= new Uranium();
            }
        }

	}
//public void setdepth()
//	{
//        	depth = new Random().nextInt(15);
//        	if(depth<5)
//        	{
//        		depth = 5;
//        	}
//        }
    public int getdepth()
	{
        	return depth;
        }
    Resource resource = new Resource();
    Sun sun = new Sun();

    public void setClosetosun(){
        closetosun=true;
    }

    public Resource GetResource(){

    	return rs;
    }
    public int getaID(){
        return aID;
    }
    public ArrayList<Asteroids> GetNeighbor(){
    	int tid=getaID();
        int nid1=tid+1;
        int nid2=tid-1;
        return Nei;
    }

    public void RemoveResources(){
        rnum--;
        if(rnum==0)
        {
            rs=new Resource();//may BUG
        }
    }

    public void explode(){

    	RemoveResources();
    	
    }

    public void CreateCore() {

    }

    public void CreateResource() {

    }

    public void CheckClosestToSun() throws IOException {

    }

    public void RemoverTraveler(Traveler traveler) {
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
