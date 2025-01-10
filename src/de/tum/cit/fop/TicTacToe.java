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
    private HBox box;
    private GridPane grid;
    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;
    private Button b5;
    private Button b6;
    private Button b7;
    private Button b8;
    private Button b9;

    // Used to launch the application.
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Game game = new Game();
        // TODO Implement GUI here
        state = new Label("Game Status:");
        state.setStyle(LABEL_STYLE);
        info = new Label("Player X turn");
        info.setStyle(LABEL_STYLE);

        box = new HBox(state, info);
        box.setAlignment(Pos.CENTER);

        b1 = new Button();
        b1.setMinSize(BUTTON_SIZE, BUTTON_SIZE);
        b1.setStyle(BUTTON_CELL_STYLE);
        b2 = new Button();
        b2.setMinSize(BUTTON_SIZE, BUTTON_SIZE);
        b2.setStyle(BUTTON_CELL_STYLE);
        b3 = new Button();
        b3.setMinSize(BUTTON_SIZE, BUTTON_SIZE);
        b3.setStyle(BUTTON_CELL_STYLE);
        b4 = new Button();
        b4.setMinSize(BUTTON_SIZE, BUTTON_SIZE);
        b4.setStyle(BUTTON_CELL_STYLE);
        b5 = new Button();
        b5.setMinSize(BUTTON_SIZE, BUTTON_SIZE);
        b5.setStyle(BUTTON_CELL_STYLE);
        b6 = new Button();
        b6.setMinSize(BUTTON_SIZE, BUTTON_SIZE);
        b6.setStyle(BUTTON_CELL_STYLE);
        b7 = new Button();
        b7.setMinSize(BUTTON_SIZE, BUTTON_SIZE);
        b7.setStyle(BUTTON_CELL_STYLE);
        b8 = new Button();
        b8.setMinSize(BUTTON_SIZE, BUTTON_SIZE);
        b8.setStyle(BUTTON_CELL_STYLE);
        b9 = new Button();
        b9.setMinSize(BUTTON_SIZE, BUTTON_SIZE);
        b9.setStyle(BUTTON_CELL_STYLE);

        b1.setOnAction(markCellEvent(0, 0, game, info));
        b2.setOnAction(markCellEvent(1, 0, game, info));
        b3.setOnAction(markCellEvent(2, 0, game, info));
        b4.setOnAction(markCellEvent(0, 1, game, info));
        b5.setOnAction(markCellEvent(1, 1, game, info));
        b6.setOnAction(markCellEvent(2, 1, game, info));
        b7.setOnAction(markCellEvent(0, 2, game, info));
        b8.setOnAction(markCellEvent(1, 2, game, info));
        b9.setOnAction(markCellEvent(2, 2, game, info));

        grid = new GridPane();
        grid.setHgap(GRIDPANE_GAP);
        grid.setVgap(GRIDPANE_GAP);
        grid.setAlignment(Pos.CENTER);
        grid.add(b1, 0, 0);
        grid.add(b2, 1, 0);
        grid.add(b3, 2, 0);
        grid.add(b4, 0, 1);
        grid.add(b5, 1, 1);
        grid.add(b6, 2, 1);
        grid.add(b7, 0, 2);
        grid.add(b8, 1, 2);
        grid.add(b9, 2, 2);
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
            if (game.getCurrentGameStatus().equals(GameStatus.RUNNING) && currentButton.getText().isEmpty()){
                Player currentPlayer = game.getCurrentPlayer();
                currentButton.setText(currentPlayer.name());
                game.markCell(a, b);
                if (game.getCurrentGameStatus().equals(GameStatus.RUNNING)) {
                    info.setText("Player " + game.getCurrentPlayer().name() + " turn");
                }
                else if (game.getCurrentGameStatus().equals(GameStatus.DRAW)){
                    info.setText("Draw");
                }
                else {
                    info.setText("Player " + game.getWinner().name() + " won");
                }
            }
        };
    }
}

