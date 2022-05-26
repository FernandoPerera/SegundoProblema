public class Main {

    public static void main(String[] args) {

        VeredaGT cochito = new VeredaGT("VA 7777 P", 400);

        System.out.println("\n\t---------------------------------------");
        System.out.println("\tLa energía del vehículo es  " + cochito.energyLevel());
        System.out.println("\t---------------------------------------");

        cochito.move();
        cochito.move();

        System.out.println(cochito.status());

        System.out.println("\n\t---------------------------------------");
        System.out.println("\tLa energía del vehículo es  " + cochito.energyLevel());
        System.out.println("\t---------------------------------------");

        cochito.move();

        cochito.recharge();

        System.out.println("\n\t---------------------------------------");
        System.out.println("\tLa energía del vehículo es  " + cochito.energyLevel());
        System.out.println("\t---------------------------------------");

        System.out.println(cochito.status());


    }
}
