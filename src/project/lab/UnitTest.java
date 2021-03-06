package project.lab;
import  java.lang.*;
import  java.io.*;
public class UnitTest {
    public static void methodTest(String m){
        System.out.println(m+"test started");
    }

    public static void TestEnd(String m){
        System.out.println(m+"test ended");
    }
    public void Test() throws IOException
	{
		 	Game game = new Game();
	        Robot robot = new Robot();
	        Settler st= new Settler();
	        Resource r= new Resource();
	        Asteroids a= new Asteroids();
	        TP_GATE tpg=new TP_GATE();
	        Sun s=new Sun();
	        String enter = "0";
	        
	        while(!enter.equals("16"))
	        {
	        	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        	 System.out.println("--Please input anything to start--");
	             br.readLine();
	             
	           //All test cases in the skeleton
	             System.out.println("Please chose the test case:");
	             System.out.println("1:StartGame");
	             System.out.println("2:Position settler");
	             System.out.println("3:Settler moves");
	             System.out.println("4:Setter drill");
	             System.out.println("5:settler mine");
	             System.out.println("6:settler put resource down");
	             System.out.println("7:perihelion");
	             System.out.println("8:sun-wind occurs(settler Avoidance)");
	             System.out.println("9:sun-wind occurs(Robot Avoidance)");
	             System.out.println("10:robot is created");
	             System.out.println("11:Robot moves");
	             System.out.println("12:Robot drill");
	             System.out.println("13:gate is created");
	             System.out.println("14:gates are deployed");
	             System.out.println("15:use TP-Gate");
	             System.out.println("16:EndTest");
	             
	             while(true)
	             {
	             //take the choose from tester
	             enter = br.readLine();
	             int num = Integer.parseInt(enter);
	             //switch for check the tester choose now
	             switch(num)
	             {
	                 
	                 case 1:
	                 game.Initial();
	                 break;

	                 case 2:
	                 game.InitialPosition(st);
	                 break;

	                 case 3:
	                 st.Travel();
	                 break;

	                 case 4:
	                 st.Drill();
	                 break;

	                 case 5:
	                 st.Mine(a);
	                 break;

	                 case 6:
	                 st.DropResource(r);
	                 break;

	                 case 7:
	                 a.CheckClosestToSun();
	                 break;

	                 case 8:
	                	 st.Avoidance();
	                 
	                 break;

	                 case 9:
	                	 robot.Avoidance();
	                 break;

	                 case 10:
	                 st.Build_robot();
	                 break;

	                 case 11:
	                	robot.Travel();
	                 break;

	                 case 12:
	                	 robot.Drill();
	                 break;

	                 case 13:
	                 st.Build_TP_Gate();
	                 break;

	                 case 14:
	                 st.place_TP_Gate();
	                 break;

	                 case 15:
	                 st.useTP_Gate(st);
	                 break;
	                 
	                 default:
	                	 System.out.println("TestEnd");

	        }
	             }
	      }
	}
	public static void main(String[] args) 
	{
		UnitTest test = new UnitTest();
        try {
			test.Test();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub

	}

}
