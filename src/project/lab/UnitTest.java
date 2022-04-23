package project.lab;
import  java.lang.*;
import  java.io.*;
public class UnitTest {
    public void Test() throws IOException {
		Game game = new Game();
		Robot robot = new Robot();
		Settler st = new Settler();
		Resource r = new Resource();
		Asteroids a = new Asteroids();
		TP_GATE tpg = new TP_GATE();
		Sun s = new Sun();
		String enter = "0";

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
