package org.example.cartulinas.handler;



import org.example.cartulinas.model.characters.Character;
import org.example.cartulinas.model.characters.Danielruizelrandom;

import java.util.ArrayList;

public class CharacterHandler {

    static ArrayList<Character> enemies = new ArrayList<>();

    public static void createEnemies() {
        Character enemy1 = new Danielruizelrandom();
        enemies.add(new Danielruizelrandom());
    }

    public static Character getEnemyFromFloor(int floor) {
        return new Danielruizelrandom();
    }
}
