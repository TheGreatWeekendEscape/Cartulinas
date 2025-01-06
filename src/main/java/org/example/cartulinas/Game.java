package org.example.cartulinas;

import javafx.application.Platform;
import org.example.cartulinas.controllers.CharacterController;
import org.example.cartulinas.model.Card;
import org.example.cartulinas.model.characters.Character;
import org.example.cartulinas.model.characters.Elcartero;
import org.example.cartulinas.uiController.CombatController;


import java.util.ArrayList;
import java.util.Scanner;

public class Game {

    private int floor = 1;
    private int round = 1;
    private Character player = new Elcartero();
    private CombatController combatController;

    public Game(CombatController combatController) {

        this.combatController = combatController;
    }

    public void start() {
        boolean end = false;

        while (!end) {
            System.out.println("PISO " + floor);

            boolean victory = fight(player, CharacterController.getEnemyFromFloor(floor));

            if (victory) {
                System.out.println("Has ganado el combate");
            } else {
                System.out.println("Has muerto");
                end = true;
            }
        }


    }

    private boolean fight(Character player, Character enemy) {
        Scanner sc = new Scanner(System.in);
        boolean end = false;
        boolean victory = false;
        System.out.println("Vas a luchar contra " + enemy.getName());

        System.out.print(". . .");
        sc.nextLine();

        while (!end) {
            System.out.println("Ronda " + round);
            System.out.println(enemy.getName() + " [" + enemy.getHp() + "/" + enemy.getMaxHp() + " HP]");
            System.out.println(player.getName() + " [" + player.getHp() + "/" + player.getMaxHp() + " HP]");
            Card enemyCard = enemy.getRandCard();
            Card playerCard = player.getRandCard();
            ArrayList<Card> enemyCards = new ArrayList<>();
            ArrayList<Card> playerCards = new ArrayList<>();
            enemyCards.add(enemyCard);
            playerCards.add(playerCard);

            System.out.println(enemy.getName() + " ha sacado un " + enemyCard);
            System.out.println("Has sacado " + playerCard);

            System.out.print(". . .");
            sc.nextLine();

            int enemyValue = enemy.calculateHandValue(enemyCards);
            int playerValue = enemy.calculateHandValue(playerCards);

            System.out.println("La mano del enemigo vale: " + enemyValue);
            System.out.println("Tu mano vale: " + playerValue);

            System.out.print(". . .");
            sc.nextLine();

            if (enemyValue == playerValue) {
                System.out.println("Empate a " + playerValue);
            } else if (enemyValue > playerValue) {
                int dif = (enemyValue - playerValue);
                System.out.println("Pierdes " + dif + " puntos de vida");
                player.loseHp(dif);
            } else {
                int dif = (playerValue - enemyValue);
                System.out.println(enemy.getName() + " pierde " + dif + " puntos de vida");
                enemy.loseHp(dif);
            }

            if (player.getHp() <= 0) {
                end = true;
            }

            if (enemy.getHp() <= 0) {
                victory = true;
                end = true;
            }

            System.out.print(". . .");
            sc.nextLine();
            round++;
            Platform.runLater(() -> {
                combatController.updateRondaLabel(round);
            });

        }

        return victory;
    }
}
