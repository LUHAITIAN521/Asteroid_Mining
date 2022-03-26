package project.lab;

public class Asteroids implements Neighbors{
    private int depth;
    private boolean closetosun;

    Resource resource = new Resource();
    Sun sun;


    public Asteroids() {

    }

    public  void createcore(){

    }

    public Resource createresource(){
        return new Resource() ;
    }

    public void localresource(){

    }

    public Resource Getcore(){
        return new Resource();
    }

    public void GetNeighbor(){

    }

    public void RemoveResources(){

    }

    public void explode(){

    }
    
    public void LocalResource(){
        
    }

    public void CreateCore() {

    }

    public void CreateResource() {

    }

    public void CheckClosestToSun(){
        Uranium uranium = new Uranium() ;
        Settler settler = new Settler();
        Asteroids asteroids = new Asteroids();
        UnitTest.methodTest("perihelion");
        while(closetosun){
            asteroids.localresource();
            System.out.println("local resource()");
            uranium.UnderTheSun(asteroids);
            System.out.println("UnderTheSun()");
            asteroids.RemoveResources();
            System.out.println("RemoveResources()");
            asteroids.explode();
            System.out.println("explode()");
            settler.HitByExplode();
            System.out.println("HitByExplode()");
            settler.die();
            System.out.println("die()");
            asteroids.RemoverTraveler(settler);
            System.out.println("RemoverTraveler()");
            sun.RemoveAsteroids();
            System.out.println("RemoveAsteroids()");
        }
        UnitTest.TestEnd("perihelion");
    }

    public void RemoverTraveler(Traveler traveler) {
    }
    public int checkhollow(Asteroids asteroids){
      return 1;
    }

    @Override
    public void TransferTraveler() {

    }
}
