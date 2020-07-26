package employeeApp;

public class Main 
{
    // private vs public 
    // public - can be called outside of the class
    // private - can only be called inside of the class

    // static
    // don't need to instantiate an object of the class to call

    // void
    // doesn't return anything
    private static void workWithData()
    {
        System.out.println("Welcome to Lambda's Java course!");

        HealthPlan h1 = new HealthPlan("My Health 1");
        HealthPlan h2 = new HealthPlan("My Health 2");

        Company c1 = new Company("Company 1", 100);
        Company c2 = new Company("Company 2", 200);

        Employee e1 = new Employee("Jon", "Doe", 20000.0, true, c1.id, h1.getId());
        Employee e2 = new Employee("Jane", "Doe", 30000.0, false, c2.id, h2.getId());

        System.out.println(c1);

        e1.setSalary(e1.getSalary() + 500);
        e2.setHas401k(!e2.getHas401k());
        System.out.println(e1.getSalary());
        System.out.println(e2.getHas401k());

        // int / int -> int
        System.out.println(c1.debt / 7);
        // int / double -> double
        System.out.println(c1.debt / 7.0);

        // type casting
        double result = (double) c1.debt / 7;
        System.out.println(result);
    }

    // all programs have this method to run the program
    // not all classes need this method
    public static void main(String[] args)
    {
        workWithData();
    }
}