package project.lab;

public class Robot extends Traveler implements Neighbors {
public void Robotmoves(){
    Traveler t = new Traveler();
    Asteroids a = new Asteroids();
    Game g = new Game();
    t.GetAsteroid();
    a.GetNeighbor();//find the neighbor next to the current asteroid.
    TransferTraveler();
    a.RemoverTraveler();//After the robot transfer to the neighboring asteroid it disappears from the original asteroid.
    g.AddRobot();
}
public void TransferTraveler(){

}
public void RobotDrill(){
    Traveler t = new Traveler();
    Asteroids a = new Asteroids();
    t.GetAsteroid();
    t.Drill();
    a.Getcore();
}
}

