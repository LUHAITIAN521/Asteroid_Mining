package project.lab;

public interface Neighbors {
    public void TransferTraveler();//Robots or settlers move to the neighboring asteroids
    public abstract void AddNeighbor();
    public void RemoveNeighbor();
}
