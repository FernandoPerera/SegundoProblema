public class VeredaGT implements Vehicle{

    private String matricula;
    private static final float MAX_ENERGY = 600;
    private float energy;
    private int movementCount;
    private static final float ENERGY_DELTA = 50;

    public VeredaGT(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public float energyLevel() {
        return 0;
    }

    @Override
    public void recharge() {

    }

    @Override
    public void move() {

    }

    @Override
    public String status() {
        return null;
    }
}
