package SUT.IST012m.Tarasenko.LR3.Heads;

import SUT.IST012m.Tarasenko.LR3.BirdPart;

public class GooseHead extends Head {
    @Override
    public void sound() {
        System.out.println("Honk-honk");
    }

    @Override
    public float getWeight() {
        return 2;
    }
}
