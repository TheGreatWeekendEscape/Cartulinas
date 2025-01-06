package org.example.cartulinas.controllers;



import org.example.cartulinas.model.characters.Character;
import org.example.cartulinas.model.characters.Danielruizelrandom;

import java.util.ArrayList;

public class CharacterController {

    static ArrayList<Character> enemies = new ArrayList<>();

    public static void createEnemies() {
        Character enemy1 = new Danielruizelrandom();
        enemies.add(new Danielruizelrandom());
    }

    public static Character getEnemyFromFloor(int floor) {
        return new Danielruizelrandom();
    }
}
