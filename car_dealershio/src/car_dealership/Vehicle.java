package car_dealership;

import java.util.Objects;

public class Vehicle
{
    private String vehicleBrand;
    private String vehicleModel;
    private int vehicleYear;
    private String vehicleColor;
    private double price;


    public Vehicle( String vehicleBrand, String vehicleModel, int vehicleYear, String vehicleColor, double price )
    {
        this.vehicleBrand = vehicleBrand;
        this.vehicleModel = vehicleModel;
        this.vehicleYear = vehicleYear;
        this.vehicleColor = vehicleColor;
        this.price = price;
    }

    @Override
    public boolean equals( Object o ) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return vehicleYear == vehicle.vehicleYear &&
                Double.compare(vehicle.price, price) == 0 &&
                Objects.equals(vehicleBrand, vehicle.vehicleBrand) &&
                Objects.equals(vehicleModel, vehicle.vehicleModel) &&
                Objects.equals(vehicleColor, vehicle.vehicleColor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vehicleBrand, vehicleModel, vehicleYear, vehicleColor, price);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleBrand='" + vehicleBrand + '\'' +
                ", vehicleModel='" + vehicleModel + '\'' +
                ", vehicleYear=" + vehicleYear +
                ", vehicleColor='" + vehicleColor + '\'' +
                ", price=" + price +
                '}';
    }

    public String getVehicleBrand() {
        return vehicleBrand;
    }

    public void setVehicleBrand( String vehicleBrand ) {
        this.vehicleBrand = vehicleBrand;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel( String vehicleModel ) {
        this.vehicleModel = vehicleModel;
    }

    public int getVehicleYear() {
        return vehicleYear;
    }

    public void setVehicleYear( int vehicleYear ) {
        this.vehicleYear = vehicleYear;
    }

    public String getVehicleColor() {
        return vehicleColor;
    }

    public void setVehicleColor( String vehicleColor ) {
        this.vehicleColor = vehicleColor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice( double price ) {
        this.price = price;
    }
}
