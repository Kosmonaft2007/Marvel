package ru.IronMan;

public class FireGupWeapon extends Weapon{
    @Override
    public String getName() {
        return "Fire Gup";
    }

    @Override
    public float damage() {
        return 200;
    }

    @Override
    public float rateOfFile() {
        return 500;
    }

    @Override
    public Integer bulletsAmount() {
        return 200;
    }

    @Override
    public String sound() {
        return "Fire sound";
    }

    @Override
    public String toString() {
        return "FireGupWeapon{}";
    }
}
