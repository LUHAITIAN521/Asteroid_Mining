package project.lab;

public interface Neighbors {
    public void TransferTraveler();//Robots or settlers move to the neighboring asteroids
    public boolean AddNeighbor(Asteroids a1,Asteroids a2);

    public void RemoveNeighbor();
}
