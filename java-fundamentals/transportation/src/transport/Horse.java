package transport;

public class Horse implements Vehicle, Animal 
{
    private int fuel = 0;
    private String name;

    public Horse(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    // Animal methods
    @Override
    public void move()
    {
        fuel = fuel - 1;
    }
    
    @Override
    public void eat(int i)
    {
        fuel = fuel + i;
    }

    @Override
    public String speak()
    {
        return "Neigh";
    }

    // Vehicle methods
    @Override
    public String getPath()
    {
        return "Grass";
    }

    @Override
    public int getFuelLevel()
    {
        return fuel;
    }

    @Override
    public void addFuel(int i) 
    {
        eat(i);
    }

    @Override
    public String toString()
    {
        return "Horse: " + name + " fuel = " + fuel;
    }
}