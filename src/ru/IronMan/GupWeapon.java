package ru.IronMan;

public class GupWeapon extends Weapon{
    @Override
    public String getName() {
        return "Eagle";
    }

    @Override
    public float damage() {
        return 10;
    }

    @Override
    public float rateOfFile() {
        return 15;
    }

    @Override
    public Integer bulletsAmount() {
        return 10;
    }

    @Override
    public String sound() {
        return "Woof";
    }
}
