/*
Assignment 2 part  1
Maxime Sotsky 0270251
COMP 1731
2019-03-16
*/
import becker.robots.*;
import java.util.*;
public class AlienBotMain
{
    public static void main(String[] args)
    {

        Scanner userSide = new Scanner(System.in);
        System.out.print("Enter the size of the side of the square: ");
        int side = userSide.nextInt();
        int amtOfThings = (side * side);

        City city = new City();
        AlienBot Alien = new AlienBot(city, 5, 15, Direction.EAST, amtOfThings);
        Alien.makeSquare(side);
//=======================================================================================
        Scanner userSide2 = new Scanner(System.in);
        System.out.print("Enter an odd number: ");
        int side2 = userSide2.nextInt();
        int amtOfThings2 = (side * side);

        AlienBot Alien2 = new AlienBot(city, 0, 0, Direction.EAST, amtOfThings2);
        Alien2.makeCircle(side2);
    }
  
}