package SUT.IST012m.Tarasenko.LR3.Bodies;

public class GooseBody extends Body {

    @Override
    public float WingsForce() {
        return 8;
    }

    @Override
    public String wingsName() {
        return "goose";
    }

    @Override
    public float getWeight() {
        return 2;
    }
}
