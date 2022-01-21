/*
Assignment 2 part  2
Maxime Sotsky 0270251
COMP 1731
2019-03-17
*/
import becker.robots.*;
public class FuelBot extends RobotRC
{
    private int fuel;
    public FuelBot(City city, int street, int ave, Direction dir, int fuelAMT)
    {
        super(city, street, ave, dir);
        fuel = fuelAMT;
        setFuel(0);
        
    }
    
    public void setFuel(int amt)
    {
        if (amt <= 0)
        {
            fuel = 0;
        }
        fuel = amt;
    }
    public int getFuel()
    {
        return fuel;
    }
    public void move()
    {
        if (fuel < 2)
        {
            breakRobot("You did not have enough fuel to move"); //
            this.setLabel("You did not have enough fuel to move"); //the text is very small on both of these, not sure how to increase the size..
        }
        if (fuel >= 2)
        {
            super.move();
            fuel -= 2;
            this.setLabel("Gas lvl: " + this.getFuel());
        }

    }

}