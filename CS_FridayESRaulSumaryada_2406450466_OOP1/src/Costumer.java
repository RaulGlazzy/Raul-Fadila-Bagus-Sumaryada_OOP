public class Costumer {
    String name;
    Vehicle vehicle;

    Costumer(String inputName){
        this.name = inputName;
    }


    public void showDetail(){
        System.out.println("--------------------------\n");
        System.out.println("Costumer Name: " + name + "\n");
    }
}
