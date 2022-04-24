package project.lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.lang.*;
import java.util.Objects;
import java.util.Scanner;

public class Settler extends Traveler {
    int ucount = 0;
    int icount =0;
    int ccount = 0;
    int wcount =0;
    int count = ucount+icount+ccount+wcount;
    String name;
//    Sun sun = new Sun();
    Asteroids as =null;
    String[] tpusedid= new String[10];
//    ArrayList<Resource> resources = new ArrayList<Resource>();
    Game g = new Game();
    int tpcount=0;
     Settler(String n){
         name=n;
     }

    public void Build_space_station(Asteroids a)
    {
        if(Objects.equals(a.GetResource().type, "Iron") &&a.rnum>2)
        {
            if(ccount>=3&&wcount>=3&&ucount>=3)
            {
                System.out.println("Player win the game");
                System.exit(0);
            }
        }
        else if(Objects.equals(a.GetResource().type, "Iron") &&a.rnum==2)
        {
            if(ccount==3&&wcount==3&&ucount==3&&icount==1)
            {
                System.out.println("Player win the game");
                System.exit(0);
            }
        }
        else if(Objects.equals(a.GetResource().type, "Carbon") &&a.rnum>2)
        {
            if(icount>=3&&wcount>=3&&ucount>=3)
            {
                System.out.println("Player win the game");
                System.exit(0);
            }
        }
        else if(Objects.equals(a.GetResource().type, "Carbon") &&a.rnum==2)
        {
            if(icount==3&&wcount==3&&ucount==3&&ccount==1)
            {
                System.out.println("Player win the game");
                System.exit(0);
            }
        }
        else if (Objects.equals(a.GetResource().type, "WaterIce") &&a.rnum>2)
        {
            if(icount>=3&&ccount>=3&&ucount>=3)
            {
                System.out.println("Player win the game");
                System.exit(0);
            }
        }
        else if (Objects.equals(a.GetResource().type, "WaterIce") &&a.rnum==2)
        {
            if(icount==3&&ccount==3&&ucount==3&&wcount==1)
            {
                System.out.println("Player win the game");
                System.exit(0);
            }
        }
        else if(Objects.equals(a.GetResource().type, "Uranium") &&a.rnum>2)
        {
            if(icount>=3&&ccount>=3&&wcount>=3)
            {
                System.out.println("Player win the game");
                System.exit(0);
            }
        }
        else if(Objects.equals(a.GetResource().type, "Uranium") &&a.rnum==2)
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
            Robot r1=new Robot();
            g.rlist.add(r1);
        icount--;
        ccount--;
        ucount--;
        System.out.println("Build successfully");
        }
        else{
            System.out.println("the resources is not enough");
        }
    }

     public void Mine(Asteroids ab) throws IOException
	 {
         if(ab.getdepth()==0&& ab.Ishollow==false&&count<10)
         {
             CarryResource(ab.GetResource(),ab);
             ab.Ishollow=true;
             System.out.println("mining"+ab.getaID()+"successfully");

         }
         else
         {
             System.out.println("failed mine");
         }
	 }
    public void DropResource(String r,Asteroids a)
	 {
        if(a.getdepth()==0&&count!=0)
        {
            if(Objects.equals(a.GetResource().type, r) ||a.Ishollow==true)
            {
                count--;
                if(Objects.equals(r, "Iron"))
                {
                    if(Objects.equals(a.GetResource().type, r))
                    {
                        icount--;
                        a.rnum++;
                    }
                    else
                    {
                        a.rs=new Iron();
                        icount--;
                        a.rnum++;
                    }
                }
                else if(Objects.equals(r, "Carbon"))
                {
                    if(Objects.equals(a.GetResource().type, r))
                    {
                        ccount--;
                        a.rnum++;
                    }
                    else
                    {
                        a.rs=new Carbon();
                        ccount--;
                        a.rnum++;
                    }
                }
                else if(Objects.equals(r, "WaterIce"))
                {
                    if(Objects.equals(a.GetResource().type, r))
                    {
                        wcount--;
                        a.rnum++;
                    }
                    else
                    {
                        a.rs=new WaterIce();
                        wcount--;
                        a.rnum++;
                    }
                }
                else
                {
                    if(Objects.equals(a.GetResource().type, r))
                    {
                        ucount--;
                        a.rnum++;
                    }
                    else
                    {
                        a.rs=new Uranium();
                        ucount--;
                        a.rnum++;
                    }
                }
                System.out.println("successfully drop "+r);
            }
            else{
                System.out.println("Failed to drop");
            }
        }
	 }
     //may BUG
    private void CarryResource(Resource r,Asteroids a) {
        count++;
        if(Objects.equals(r.type, "Iron"))
        {
            icount++;
            System.out.println(a.GetResource().GetType());
            a.RemoveResources();
            System.out.println("Successfully");
        }
        else if(Objects.equals(r.type, "Carbon"))
        {
            ccount++;
            System.out.println(a.GetResource().GetType());
            a.RemoveResources();
            System.out.println("Successfully");
        }
        else if(Objects.equals(r.type, "WaterIce"))
        {
            wcount++;
            System.out.println(a.GetResource().GetType());
            a.RemoveResources();
            System.out.println("Successfully");
        }
        else if(Objects.equals(r.type, "Uranium"))
        {
            ucount++;
            System.out.println(a.GetResource().GetType());
            a.RemoveResources();
            System.out.println("Successfully");
        }
        else {
            System.out.println("Failed to carry");
        }

    }
//    public void checkresource(){
//        if(count>10){
//            System.out.println("settlers can not carry so many resources");
//        else(){
//
//        }
//        }
//
//    }

//    public boolean checktpid(String n)
//    {
//        for(int i=0;i<tpusedid.length;i++)
//        {
//            if(Objects.equals(n, tpusedid[i]))
//            {
//                return false;
//            }
//        }
//        tpusedid[tpusedid.length-1]=n;
//        return true;
//    }

    public void Build_TP_Gate(){
         
        if(icount>=2&&wcount>=1&&ucount>=1&&tpcount==0)
        {
            String inputID;
            System.out.println("Input Gate id");
            Scanner s=new Scanner(new InputStreamReader(System.in));
            inputID=s.next();
//            if(checktpid(inputID)==true) {
                TP_GATE G1 = new TP_GATE();//create the first gate
                TP_GATE G2 = new TP_GATE();//create the second gate
                g.tlist.add(G1);
                g.tlist.add(G2);
                System.out.println(g.tlist.indexOf(G1)+" is created");
                System.out.println(g.tlist.indexOf(G2)+" is created");
                G1.SetID(inputID);
                G2.SetID(inputID);
                icount -= 2;
                wcount--;
                ucount--;
//                G1.paired(G2, G1);// two TP_Gates consist of a pair, TP_Gates must be used in pairs to transfer travelers.
                tpcount = 2;
            //}
        }
        else{
            System.out.println("the resources is not enough");
            }
        }
    public void place_TP_Gate(Asteroids a,TP_GATE tpGate)
    {
        tpGate.SetA(a);
        tpcount--;
    }
    public void AddNeighbor(){
    	
    }

    public void die(){
        g.enggame();//Game over.
    }

//    public void Avoidance() throws IOException{
//        sun.createstorm();
//        Asteroids asteroids = new Asteroids();
//        if(asteroids.checkhollow(asteroids)==1){//check whether the core of asteroid is hollow
//            asteroids.Getcore();//find the core of Asteroids to hide from sun storm
//            System.out.println("Settler hide successfully");
//        }
//        else{
//            //if()
//            die();
//            System.out.println("failed, traveller die");
//
//        }
//    }

    public void useTP_Gate(TP_GATE t)
    {
        for(int i=0;i<g.tlist.size();i++)
        {
            if(g.tlist.indexOf(t)!=i)
            {
                if(Objects.equals(t.GetID(), g.tlist.get(i).GetID()))
                {
                    as=g.tlist.get(i).GetA();
                }
            }
        }
    }
}
