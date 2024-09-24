public class Manager extends Employee
{
    @Override
    public void calculateSalary()
    {
        System.out.println("the salary is: "+ (600000 + 10000 - 6000) +" shekels");
    }
    @Override
    public void getDetails()
    {
        System.out.println("the name is: Tsion\nyears in business: 3 years\nrate: 3.5 stars");
    }

    @Override
    public void  performTask()
    {
        System.out.println("your mission is: make sure you workers get along in the work and work just fine");
    }
}
