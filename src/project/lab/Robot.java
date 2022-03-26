package project.lab;

public class Robot extends Traveler implements Neighbors {

    Traveler t = new Traveler();
    Asteroids a = new Asteroids();
    Game g = new Game();
public void Travel(){

    t.GetAsteroid(a);
    a.GetNeighbor();//find the neighbor next to the current asteroid.
    TransferTraveler();
    a.RemoverTraveler(t);//After the robot transfer to the neighboring asteroid it disappears from the original asteroid.
    g.AddRobot();
}
public void TransferTraveler(){

}
public void RobotDrill(){

    t.GetAsteroid(a);
    //t.Drill();
    a.Getcore();
}
}

