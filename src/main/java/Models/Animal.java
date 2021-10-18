package Models;

import Services.FunctionsOfMyAnimals;

public class Animal implements FunctionsOfMyAnimals {

    private String name;
    private long limbs;
    private int eyes;
    private int ears;

    public Animal(String name, long limbs, int eyes, int ears) {
        this.name = name;
        this.limbs = limbs;
        this.eyes = eyes;
        this.ears = ears;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getLimbs() {
        return limbs;
    }

    public void setLimbs(long limbs) {
        this.limbs = limbs;
    }

    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public int getEars() {
        return ears;
    }

    public void setEars(int ears) {
        this.ears = ears;
    }

    @Override
    public void move() {
        System.out.println("I am moving");
    }

    @Override
    public String makeSound(String animalSounds) {
        return animalSounds;
    }

    @Override
    public void waveTail() {
        System.out.println("Wow! I have a tail and it is waving");
    }

    @Override
    public void countMyLimbs() {
        System.out.println(this.getLimbs());
    }
    //TODO check class before setting field
    public void checkName(){
        Person tega = new Person("Mr Okonkwo", "72", "principal", 123465453l);
        if (this.getClass().getName().contains("Animal")) {
            tega.setName("Mamude");
            System.out.println(tega.getName());
        }
        else {
            System.out.println("I can not set your name. Go and hug transformer!!");
        }
    }
}
