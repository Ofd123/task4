import java.security.spec.ECPoint;

public class Developer extends Employee
{
    @Override
    public void calculateSalary()
    {
        System.out.println("the salary is: "+ (30000 + 1000 - 4000) +" shekels");
    }
    @Override
    public void getDetails()
    {
        System.out.println("the name is: Moshe\nyears in business: 7 years\nrate: 4 stars");
    }

    @Override
    public void  performTask()
    {
        System.out.println("your mission is: create an app which will help managing daily life activities");
    }
}
