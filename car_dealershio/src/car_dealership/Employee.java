package car_dealership;

public class Employee
{

    public  void handaleCustomer(Customer cust, boolean finance, Vehicle vehicle )
    {
        if (finance==true)
        {
            double loanAmount =vehicle.getPrice()-cust.getCashOnHand();
            System.out.println("customer need to loan " +loanAmount);
            runCreditHistory(cust,loanAmount);
        }
        else if (vehicle.getPrice()<= cust.getCashOnHand())
        {
            //customer pay in cash
            System.out.println("customer pay in cash");
            proccesTransactionCustomer(cust,vehicle);
        }
        else {
            System.out.println("The customer will need more money to purchesss vehicle "+vehicle);
        }
    }


    public void runCreditHistory(Customer cust, double loanAmount)
    {
        System.out.println(" Ran credit History for customer ... ");
        System.out.println(" Customer has been approved o purchase  the vehicle");


    }

    public void proccesTransactionCustomer(Customer cust, Vehicle vehicle)
    {
        System.out.println("Customer purches the vehicle "+vehicle+" for the amount of - " +vehicle.getPrice());
    }
}
