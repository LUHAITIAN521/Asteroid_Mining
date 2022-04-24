package project.lab;

public class WaterIce extends Resource{
	public WaterIce(){}
	public  void UnderTheSun(Asteroids asteroids) {
    	System.out.println("Waterice close to the sun");
    	asteroids.RemoveResources();
}
}
