package SUT.IST012m.Tarasenko.LR3;

import SUT.IST012m.Tarasenko.LR3.Bodies.Body;
import SUT.IST012m.Tarasenko.LR3.Heads.Head;
import SUT.IST012m.Tarasenko.LR3.Legs.Legs;

public class Bird {
    public void setHead(Head head) {
        this.head = head;
    }
    public void setBody(Body body) {
        this.body = body;
    }

    public void setLegs(Legs legs){
        this.legs = legs;
    }

    public Head head;
    public Body body;
    public Legs legs;

    public Bird(){}

    public Bird(Head head, Body body, Legs legs)
    {
        this.head = head;
        this.body = body;
        this.legs = legs;
    }

    public void sound()
    {
        head.sound();
    }

    public void isFlying()
    {
        float weight = head.getWeight() + body.getWeight() + legs.getWeight();
        if (weight <= body.WingsForce())
            System.out.println("My " + body.wingsName() + " wings are great, so I can aviate!");
        else
            System.out.println("My " + body.wingsName() + " wings are small, so I'd better stroll.");
    }

    public void isSwimming()
    {
        if (legs.canSwim())
            System.out.println("(can swim)");
        else
            System.out.println("(can't swim)");
    }
}
