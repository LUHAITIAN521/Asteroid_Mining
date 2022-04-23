package project.lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.lang.*;

public class Settler extends Traveler {
    int ucount = 0;
    int icount =0;
    int ccount = 0;
    int wcount =0;
    int count = ucount+icount+ccount+wcount;
    String name;
    Sun sun = new Sun();

//    ArrayList<String> resources = new ArrayList<String>();
    TP_GATE tp_gate = new TP_GATE();
    TP_GATE tp_gate2 = new TP_GATE();
    Resource resource = new Resource();
    Game game = new Game();

     Settler(String n){
         name=n;
     }

    public void Build_space_station(Asteroids a)
    {

        if(a.GetResource().type=="Iron"&&a.rnum>2)
        {
            if(ccount>=3&&wcount>=3&&ucount>=3)
            {
                System.out.println("Player win the game");
                System.exit(0);
            }
        }
        else if(a.GetResource().type=="Iron"&&a.rnum==2)
        {
            if(ccount==3&&wcount==3&&ucount==3&&icount==1)
            {
                System.out.println("Player win the game");
                System.exit(0);
            }
        }
        else if(a.GetResource().type=="Carbon"&&a.rnum>2)
        {
            if(icount>=3&&wcount>=3&&ucount>=3)
            {
                System.out.println("Player win the game");
                System.exit(0);
            }
        }
        else if(a.GetResource().type=="Carbon"&&a.rnum==2)
        {
            if(icount==3&&wcount==3&&ucount==3&&ccount==1)
            {
                System.out.println("Player win the game");
                System.exit(0);
            }
        }
        else if (a.GetResource().type=="WaterIce"&&a.rnum>2)
        {
            if(icount>=3&&ccount>=3&&ucount>=3)
            {
                System.out.println("Player win the game");
                System.exit(0);
            }
        }
        else if (a.GetResource().type=="WaterIce"&&a.rnum==2)
        {
            if(icount==3&&ccount==3&&ucount==3&&wcount==1)
            {
                System.out.println("Player win the game");
                System.exit(0);
            }
        }
        else if(a.GetResource().type=="Uranium"&&a.rnum>2)
        {
            if(icount>=3&&ccount>=3&&wcount>=3)
            {
                System.out.println("Player win the game");
                System.exit(0);
            }
        }
        else if(a.GetResource().type=="Uranium"&&a.rnum==2)
        {
            if(icount==3&&ccount==3&&wcount==3&&ucount==1)
            {
                System.out.println("Player win the game");
                System.exit(0);
            }
        }
        else
        {
            System.out.println("Failed build space-station");
        }
    }

    public void Build_robot() throws IOException {
        if(icount>=1&&ccount>=1&&ucount>=1){
        game.AddRobot();
        icount--;
        ccount--;
        ucount--;
        System.out.println("Build successfully");
        }
        else{
            System.out.println("the resources is not enough");
        }
    }

     public void Mine(Asteroids a) throws IOException
	 {
         if(a.getdepth()==0&& a.Ishollow==false&&count<10)
         {
             CarryResource(a.GetResource());
             a.RemoveResources();
             a.Ishollow=true;
             System.out.println("mining"+a.getaID()+"successfully");
         }
         else
         {
             System.out.println("failed mine");
         }
	 }
    public void DropResource(Resource r,Asteroids a)
	 {
        if(a.getdepth()==0&&count!=0)
        {
            if(a.GetResource().type==r.type||a.Ishollow==true)
            {
                count--;
                if(r.type=="Iron")
                {
                    icount--;
                }
                else if(r.type=="Carbon")
                {
                    ccount--;
                }
                else if(r.type=="WaterIce")
                {
                    wcount--;
                }
                else
                {
                    ucount--;
                }
            }
            else{
                System.out.println("Failed to drop");
            }
        }
	 }
     //may BUG
    private void CarryResource(Resource r,Asteroids a) {
        count++;
        if(r.type=="Iron")
        {
            icount++;
            System.out.println("Successfully");
        }
        else if(r.type=="Carbon")
        {
            ccount++;
            System.out.println("Successfully");
        }
        else if(r.type=="WaterIce")
        {
            wcount++;
            System.out.println("Successfully");
        }
        else if(r.type=="Uranium")
        {
            ucount++;
            System.out.println("Successfully");
        }
        else {
            System.out.println("Failed to carry");
        }

    }
    public void checkresource(){
        if(count>10){
            System.out.println("settlers can not carry so many resources");
        else(){

        }
        }
    	
    }
    public void Build_TP_Gate(){
         
        if(icount>=2&&wcount>=1&&ucount>=1){
        TP_GATE G1=new TP_GATE();//create the first gate
        TP_GATE G2=new TP_GATE();//create the second gate
        icount-=2;
        wcount--;
        ucount--;
        G1.paired(G2);// two TP_Gates consist of a pair, TP_Gates must be used in pairs to transfer travelers.
        }
        else{
            System.out.println("the resources is not enough");
        }
    }
    public void place_TP_Gate(Asteroids a){

    }
    public void AddNeighbor(){
    	
    }

    public void die(){
        g.enggame();//Game over.
    }

    public void Avoidance() throws IOException{
        sun.createstorm();
        Asteroids asteroids = new Asteroids();
        if(asteroids.checkhollow(asteroids)==1){//check whether the core of asteroid is hollow
            asteroids.Getcore();//find the core of Asteroids to hide from sun storm
            System.out.println("Settler hide successfully");
        }
        else{
            //if()
            die();
            System.out.println("failed, traveller die");

        }
    }
}
