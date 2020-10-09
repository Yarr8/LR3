package SUT.IST012m.Tarasenko.LR3.Bodies;

public class PigeonBody extends Body {

    @Override
    public float WingsForce() {
        return 4;
    }

    @Override
    public String wingsName() {
        return "pigeon";
    }

    @Override
    public float getWeight() {
        return 1;
    }
}
