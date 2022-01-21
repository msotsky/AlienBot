/*
Assignment 2 part  2
Maxime Sotsky 0270251
COMP 1731
2019-03-17
*/
import becker.robots.*;
import java.util.*;
public class FuelBotMain
{
    public static void main(String[] args)
    {
        City city = new City();

        Scanner userFuel = new Scanner(System.in);
        System.out.print("Enter the size of the side of the square: ");
        int fuel = userFuel.nextInt();

        FuelBot bot = new FuelBot(city, 5, 5, Direction.EAST, fuel);
        bot.setFuel(fuel);
        bot.setLabel("Gas lvl: " + bot.getFuel());
        
    }
}