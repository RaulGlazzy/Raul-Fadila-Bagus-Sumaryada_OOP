public class Vehicle {

    String brand;
    int year;
    VehicleType type;
    float price;

    Vehicle(String inputBrand, int inputYear, VehicleType inputVehicleType, float inputPrice){
        this.brand = inputBrand;
        this.year = inputYear;
        this.type = inputVehicleType;
        this.price = inputPrice;
    }

    public void showDetail(){
        System.out.println("Brand: " + brand + "\n");
        System.out.println("Year: " + year + "\n");
        System.out.println("Type: " + type + "\n");
        System.out.println("Price: " + price + "\n");
        System.out.println("--------------------------\n");
    }
}


