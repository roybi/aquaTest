package car_dealership;

public class Dealership
{


    public static void main (String[]args)
    {
        Customer cust1 = new Customer("Tom","1244 Any Address",25000);
        //cust1.setName("Tom");
        //cust1.setAddress("123 Anty");
        //cust1.setCashOnHand(12000);


        Vehicle vec = new Vehicle("Honda","Accourd",2018,"Yellow",15000);
       // vec.setVehicleModel("Accoured");
       // vec.setVehicleBrand("Honda");
       // vec.setPrice(15000);


        Employee emp = new Employee();


        cust1.purchaseCar(vec,emp,false);


/*

        public void HandaleCustomer (Customer cast, booleean finance , Vehicle vehicle)
        {
            if (finance ==true)
            {
                runCreditHistory(Customer cust, double doubleAmount);
            }
            else if (vehicle.getPrice()<= cust1.getCashOnHand())
            {
                processTransaction (Customer cust, Vehicle vehicle)

            }

            else
                System.out.println("Tell the customer to bring more Money");
        }

*/
    }
}
