package project.lab;
import  java.lang.*;
import  java.io.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
			Settler s=new Settler("1");

			s.g.Initial();
			s.initialposition(s.g.Asteroid.get(0));
//			Settler st=s.g.slist.get(0);
			String enter = "0";
//			s.wcount=10;
//			s.icount=10;
//			s.ccount=10;
//			s.ucount=10;
//			s.count=1;
		while(!enter.equals("15"))
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			//All test cases in the skeleton
			System.out.println("Please chose the test case:");
			System.out.println("1:Settler moves");
			System.out.println("2:Setter drill");
			System.out.println("3:settler mine");
			System.out.println("4:settler drop resource");
			System.out.println("5:Build robot(currently only support one robot)");
			System.out.println("6:Robot moves");
			System.out.println("7:Robot drill");
			System.out.println("8:Build TP_GATE");
			System.out.println("9:Place TP_GATE");
			System.out.println("10:Settler use TP-Gate");
//			System.out.println("11:Robot use TP-Gate");
			System.out.println("12:Build Space-station");
			System.out.println("13:Robot hide(you fully drilled and mined the asteroid)");
			System.out.println("14:Settler hide(you fully drilled and mined the asteroid)");
			System.out.println("15:EndTest");

			while(true)
			{
				//take the choose from tester
				enter = br.readLine();
				int num = Integer.parseInt(enter);
				//switch for check the tester choose now
				switch(num)
				{
					case 1:
						System.out.println("Which asteroid you want to travel(Neighbors are asteroid's ID +/- 1)");
						BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
						String enter1 = br1.readLine();
						int n = Integer.parseInt(enter1);
						s.Travel(s.g.Asteroid.get(n));
						break;


					case 2:
						s.Drill(s.getA());
						break;

					case 3:
						s.Mine(s.getA());
						break;

					case 4:
						System.out.println("Which type of resource you want to drop");
						BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
						String enter2 = br2.readLine();
						s.DropResource(enter2,s.getA());
						break;

					case 5:
						s.Build_robot();
						s.g.rlist.get(0).initialposition(s.getA());
						break;

					case 6:
						System.out.println("Which asteroid your robot want to travel(Neighbors are asteroid's ID +/- 1)");
						BufferedReader br5 = new BufferedReader(new InputStreamReader(System.in));
						String enter5 = br5.readLine();
						int n3 = Integer.parseInt(enter5);
						s.g.rlist.get(0).Travel(s.g.Asteroid.get(n3));
						break;

					case 7:
						s.g.rlist.get(0).Drill(s.g.rlist.get(0).getA());
						break;

					case 8:
						s.Build_TP_Gate();

						break;

					case 9:

						System.out.println("Which gate do you want to place?");
						BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));
						String enter3 = br3.readLine();
						int n1 = Integer.parseInt(enter3);
						s.place_TP_Gate(s.getA(),s.g.tlist.get(n1));
						break;

					case 10:
						System.out.println("Which gate do you want to use?");
						BufferedReader br4 = new BufferedReader(new InputStreamReader(System.in));
						String enter4 = br4.readLine();
						int n2 = Integer.parseInt(enter4);
						s.useTP_Gate(s.g.tlist.get(n2));
						break;

					case 11:
//						System.out.println("Which gate do you want to use?");
//						BufferedReader br6 = new BufferedReader(new InputStreamReader(System.in));
//						String enter6 = br6.readLine();
//						int n4 = Integer.parseInt(enter6);
//						s.g.rlist.get(0).useTP_Gate(s.g.tlist.get(n4));
						break;

					case 12:
						s.Build_space_station(s.getA());
						break;

					case 13:
						s.g.rlist.get(0).Avoidance(s.g.rlist.get(0).getA());
						break;

					case 14:
						s.Avoidance(s.getA());
						break;


					default:
						System.out.println("TestEnd");
						System.exit(0);

				}
			}
		}
	}
//			Scanner s=new Scanner(new InputStreamReader(System.in));
//
//			while(game.Asteroid.get(0).getdepth()!=0)
//			{
//				game.slist.get(0).Drill(game.Asteroid.get(0));
//			}
//			game.slist.get(0).Mine(game.Asteroid.get(0));
//			game.slist.get(0).Travel(game.Asteroid.get(1));
//			while(game.Asteroid.get(1).getdepth()!=0)
//			{
//				game.slist.get(0).Drill(game.Asteroid.get(1));
//			}

}


