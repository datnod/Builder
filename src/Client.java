public class Client {

    public static void main(String[] args){

        Vehicle vehicle = new
                VehicleBuilder().setType("Motorbike").setLicense("13X-44S").setColor("White").setWheel(4).builder();

        System.out.println(vehicle);


    }
}
