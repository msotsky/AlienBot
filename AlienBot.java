/*
Assignment 2 part  1
Maxime Sotsky 0270251
COMP 1731
2019-03-16
*/
import becker.robots.*;
import java.lang.Math.*;
public class AlienBot extends RobotSE
{
    public AlienBot(City city, int street, int ave, Direction dir, int numThings)
    {
        super(city, street, ave, dir, numThings);
    }
    public void makeSquare(int num)
    {
        if (num <= 0)
        {
            return;
        }
        int count = 0;
        while (count != num)
        {
            oneRow(num);
            count++;
        }
    }
    public void oneRow(int num)
    {
        int count = 0;
        while (count != num)
        {
            putThing();
            move();
            count++;
        }
        turnLeft(2);//turnAround()
        move(num);
        turnLeft();
        move();
        turnLeft();
    }

    public void makeCircle(int num)
    {
        if ((num % 2 != 1) || (num <= 0))
        {
            return;
        }
        
        int y = (num - 1)/2;
        int x = (num - 1)/2;
        int count = 0;
        while (count != num)
        {
            oneRow(num, x, y);
            count++;
            turnAround();
            move(num);
            turnLeft();
            move();
            turnLeft();
        }
        

    }
    
    public void oneRow(int lengthStreet, int centerInt, int aveOfCenter) 
    {
        int r = ((lengthStreet -1)/2);
        int countMoves = 0;

        while (countMoves != lengthStreet)
        {
            if (Math.sqrt((Math.pow((getStreet() -centerInt), 2) + (Math.pow(getAvenue() -aveOfCenter,2)))) <= r)
            {
                putThing();
                move();
                countMoves++;
            }
            else{
                move();
                countMoves++;
                }
        }
    }
}

