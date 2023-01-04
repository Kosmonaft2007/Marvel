package ru.IronMan;

public class MechineGupWeapon extends Weapon{
    @Override
    public String getName() {
        return "AK47";
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
        return "Bach-Bach";
    }

    @Override
    public String toString() {
        return "MechineGupWeapon{}";
    }
}
