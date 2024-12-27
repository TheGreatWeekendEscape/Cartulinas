package org.example.cartulinas.uiController;

import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import org.example.cartulinas.Game;

public class CombatController {

    private Game game;

    @FXML
    private Label pisoLabel = new Label();
    @FXML
    private Label rondaLabel = new Label();

    @FXML
    private void initialize() {
        Game game = new Game(this);
        Task<Void> gameTask = new Task<Void>() {
            @Override
            protected Void call() throws Exception {
                game.start();
                return null;
            }
            @Override
            protected void succeeded() {
                super.succeeded();
            }
            @Override
            protected void failed() {
                super.failed();
            }
        };

        Thread gameThread = new Thread(gameTask);
        gameThread.setDaemon(true);
        gameThread.start();
    }


    public void updatePisoLabel(int floor) {
        pisoLabel.setText("Piso " + floor);
    }

    public void updateRondaLabel(int ronda) {
        rondaLabel.setText("Ronda " + ronda);
    }

}
