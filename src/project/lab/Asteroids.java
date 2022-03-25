package project.lab;

public class Asteroids implements Neighbors{
    private int depth;
    private boolean closetosun;
    Asteroids asteroids;
    Resource resource;
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
        UnitTest.methodTest("perihelion");
        while(closetosun==true){
            asteroids.localresource();
            uranium.UnderTheSun(asteroids);
            asteroids.RemoveResources();
            asteroids.explode();
            settler.HitByExplode();
            settler.die();
            asteroids.RemoverTraveler(settler);
            sun.RemoveAsteroids();
        }
        UnitTest.TestEnd("perihelion");
    }

    private void RemoverTraveler(Settler settler) {
    }
}
