package transport;

import java.util.List;
import java.util.ArrayList;

public class Main 
{
    public static List<AbstractVehicle> filteredList = new ArrayList<AbstractVehicle>();

    public static void filterVehicle(List<AbstractVehicle> vehicles, CheckVehicle tester)
    {
        filteredList.clear();

        for (AbstractVehicle v: vehicles)
        {
            if (tester.test(v))
            {
                // System.out.println(v);
                filteredList.add(v);
            }
        }
    }
    public static void main(String[] args)
    {
        System.out.println("Welcome to module 2!");
        System.out.println("*** Work with Interfaces ***");

        Horse seabiscuit = new Horse("Seabiscuit");
        Horse affirmed = new Horse("Affirmed");
        Horse joe = new Horse("Joe");

        seabiscuit.eat(10);
        affirmed.eat(25);
        for (int i =0; i < 3; i++)
        {
            seabiscuit.move();
        }
        System.out.println("Seabiscuit " + seabiscuit.getFuelLevel());

        System.out.println("\n\n\n*** From Abstract Class ***");

        HorseFromVehicle secretariate = new HorseFromVehicle("Secretariat", 10);
        secretariate.addFuel(10);
        System.out.println(secretariate.toString());

        HorseFromVehicle eclipse = new HorseFromVehicle("Eclipse");
        eclipse.move(10);

        HorseFromVehicle trigger = new HorseFromVehicle("Trigger", 10);
        HorseFromVehicle seattleSlew = new HorseFromVehicle("Seattle Slew", 10);
        HorseFromVehicle americanPharoah = new HorseFromVehicle("American Pharoah", 10);

        Auto vw = new Auto(1, "Eurovan", 2000);
        Auto toyota = new Auto(10, "Tundra", 1998);
        Auto honda = new Auto(5, "Accord", 2003);

        vw.move();
        vw.move(5);

        // Collection -> List -> ArrayList
        List<AbstractVehicle> myList = new ArrayList<AbstractVehicle>();
        myList.add(secretariate);
        myList.add(vw);
        myList.add(toyota);
        myList.add(honda);
        myList.add(trigger);
        myList.add(seattleSlew);
        myList.add(americanPharoah);
        myList.add(eclipse);

        System.out.println();
        System.out.println(myList.toString());

        System.out.println("\n*** Sorted List ***");
        // uses Lambda expression to sort the list
        myList.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
        System.out.println(myList);
        System.out.println();
        myList.forEach((v) -> System.out.println(v.getName()));

        System.out.println("\n *** List of Negative Fuel ***");
        filterVehicle(myList, v -> v.getFuelLevel() < 0);
        filteredList.sort((v1, v2) -> v1.getFuelLevel() - v2.getFuelLevel());
        filteredList.forEach(v -> System.out.println(v.getFuelLevel()));

        System.out.println("\n *** List of horses with positive fuel ***");
        filterVehicle(myList, v -> (v.getFuelLevel() > 0) && (v instanceof HorseFromVehicle));
    }
}