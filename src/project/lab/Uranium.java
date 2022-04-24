package project.lab;

public class Uranium extends Resource{

    public Uranium(){}
    public  void UnderTheSun(Asteroids asteroids) {
    	System.out.println("uranium close to the sun");
    	asteroids.explode();
    }
}
