public class SalesPerson extends Employee
{
    @Override
    public void calculateSalary()
    {
        System.out.println("the salary is: "+ (10000 + 300 - 1200) +" shekels");
    }
    @Override
    public void getDetails()
    {
        System.out.println("the name is: Shmulik\nyears in business: 10 years\nrate: 5 stars");
    }

    @Override
    public void  performTask()
    {
        System.out.println("your mission is: sell a product which worth 3000 shekels");
    }
}
