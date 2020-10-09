package SUT.IST012m.Tarasenko.LR3.Heads;

public class PigeonHead extends Head {
    @Override
    public void sound() {
        System.out.println("Coo-coo");
    }

    @Override
    public float getWeight() {
        return 1;
    }
}
