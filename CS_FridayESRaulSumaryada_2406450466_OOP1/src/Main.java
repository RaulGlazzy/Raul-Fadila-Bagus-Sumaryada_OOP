//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{
    public static void main (String args[]){
        Costumer Rauly = new Costumer("Rauly");
        Rauly.showDetail();
        Vehicle vehicleSupraBapak = new Vehicle("Honda Supra", 1998, VehicleType.Motorcycle, 3000);
        vehicleSupraBapak.showDetail();
        Costumer Glazzy = new Costumer("Glazzy");
        Glazzy.showDetail();
        Vehicle vehicleKalcer = new Vehicle("VW Beetle", 1998, VehicleType.Car, 20000);
        vehicleKalcer.showDetail();
        Costumer PasoBeso = new Costumer("PasoBeso");
        PasoBeso.showDetail();
        Vehicle vehicleGuede = new Vehicle("Isuzu Giga", 2011, VehicleType.Truck, 30000);
        vehicleGuede.showDetail();
        System.out.println("\n--------------------------\n");

    }
}