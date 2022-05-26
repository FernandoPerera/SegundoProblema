public class VeredaGT implements Vehicle{

    private String matricula;
    private static final float MAX_ENERGY = 600;
    private float energy;
    private int movementCount = 0;
    private static final float ENERGY_DELTA = 50;

    public VeredaGT(String matricula, float energy) {
        this.matricula = matricula;
        this.energy = energy;
    }

    public String getMatricula() {
        return matricula;
    }

    public float getEnergy() {
        return energy;
    }

    public int getMovementCount() {
        return movementCount;
    }

    @Override
    public float energyLevel() {
        return getEnergy();
    }

    @Override
    public void recharge() {

        if (energy == MAX_ENERGY){
            System.out.println("La energía ya está al máximo");
        } else {
            energy = MAX_ENERGY;

            System.out.println("\n\t=======================================");
            System.out.println("\tSe ha recargado la energía del vehículo");
            System.out.println("\t=======================================");
        }

    }

    @Override
    public void move() {

        if (energy < ENERGY_DELTA || (energy - ENERGY_DELTA) < 0 ) {
            System.out.println("\n\t----------------------------------------");
            System.out.println("El vehículo no puede realizar movimientos " +
                                "no tiene la energía necesaria");
        } else {
            energy -= ENERGY_DELTA;
            System.out.println("\n | Se va ha mover el vehículo... |");

            movementCount++;
        }
    }

    @Override
    public String status() {



        return "\nEl vehículo " + getMatricula() + " tiene un nivel de carga de " +
                getEnergy() + " y se ha movido " + getMovementCount() + " veces";
    }
}
