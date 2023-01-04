package ru.IronMan;

import java.util.ArrayList;
import java.util.List;

// класс оружие абстраакны для всех
public abstract class Weapon {

// поля не обявляю

    public abstract String getName();
    public abstract float damage();
    public abstract float rateOfFile();
    public abstract Integer bulletsAmount();
    public abstract String sound();
}
