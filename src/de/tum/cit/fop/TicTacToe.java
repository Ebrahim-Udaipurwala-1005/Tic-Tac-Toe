package de.tum.cit.fop;

import de.tum.cit.fop.logic.Game;
import de.tum.cit.fop.logic.GameStatus;
import de.tum.cit.fop.logic.Player;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TicTacToe extends Application {
    // Configuration Constants
    private static final String FONT_SIZE = "-fx-font-size: 20";
    private static final String GRIDPANE_STYLE = "-fx-background-color:rgb(40, 40, 43);"
            + "-fx-border-color: rgb(40, 40, 43);"
            + "-fx-text-fill: #D3D3D3;"
            + FONT_SIZE;
    private static final String BOX_STYLE = "-fx-background-color: rgb(40, 40, 43);"
            + FONT_SIZE;

    private static final String LABEL_STYLE = "-fx-background-color: rgb(40, 40, 43);"
            + "-fx-text-fill: rgb(96, 130, 182);"
            + FONT_SIZE;
    private static final String BUTTON_CELL_STYLE = "-fx-background-color: rgb(54, 69, 79);"
            + "-fx-border-color: rgb(115, 147, 179);"
            + "-fx-text-fill: #D3D3D3;"
            + FONT_SIZE;
    private static final double BOX_SPACING = 10;
    private static final double GRIDPANE_GAP = 3;
    private static final double BUTTON_SIZE = 50;
    private static final double SCENE_SIZE = 270;
    private Label state;
    private Label info;

    // Used to launch the application.
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Game game = new Game();
        // TODO Implement GUI here
        state = new Label();
        state.setText("Game status:");
        info = new Label();
        info.setText("Player X turn");
    }

    /**
     * Marks the cells with according to the current player and updates the game
     * status.
     *
     * @param a    Cell's row.
     * @param b    Cell's column.
     * @param game Link to the actual game logic.
     * @param info Information/Status label.
     * @return Configured event.
     */
    private EventHandler<ActionEvent> markCellEvent(int a, int b, Game game, Label info) {
        return value -> {
            Button currentButton = (Button) value.getSource();
            // TODO Implement the event logic
        };
    }
}

