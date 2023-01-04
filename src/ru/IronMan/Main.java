package ru.IronMan;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<Transformer> transformers = new ArrayList<>();

        MarvelGroup MarvelGroup = new MarvelGroup(Arrays.asList(
                new Marvel("Оптимус Прайм", 3, 80),
                new Marvel("Бамблби", 2, 40)
        ));

//        MarvelGroupIterator MarvelIt = new MarvelGroupIterator(MarvelGroup);
        Iterator<Marvel> MarvelIt = MarvelGroup.iterator();
        while (MarvelIt.hasNext()) {
            System.out.println(MarvelIt.next());
        }


        List<Weapon> weapons = new ArrayList<>();
        weapons.add(new GupWeapon());
        weapons.add(new MechineGupWeapon());
        weapons.add(new FireGupWeapon());

        for (Weapon weapon : weapons) {
            System.out.println(weapon.getName());
            defeatTarget(weapon);
            System.out.println("---------");
        }

    }

    public static void defeatTarget(Weapon weapon) {
        float health = 100;
        while (health > 0) {
            health -= weapon.damage();
            System.out.println(weapon.sound());
            System.out.println(health);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}