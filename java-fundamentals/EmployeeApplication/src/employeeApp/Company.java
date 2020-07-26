package employeeApp;

public class Company 
{
    private static int maxId = 0;
    // don't do this, but legecy might so will have to work with it
    public int id;
    public String name;
    public int debt;

    public Company(String name, int debt)
    {
        maxId++;
        id = maxId;
        this.name = name;
        this.debt = debt;
    }

    @Override
    public String toString()
    {
        return "Company: " + name + " debt: " + debt;
    }
}