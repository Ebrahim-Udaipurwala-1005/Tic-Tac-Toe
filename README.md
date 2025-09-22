# Tic Tac Toe

This project is a solution to the "Tic Tac Toe" exercise for the **INHN0002 Fundamentals of Programming** course, taught by Prof. Dr. Stefan Wagner. The goal of this assignment was to implement a complete graphical user interface (GUI) for the classic Tic Tac Toe game using **JavaFX**. The solution connects the visual components of the game to pre-existing game logic.

---

## Project Structure

The project is divided into two main packages to separate the GUI from the core game logic:
* **`de.tum.cit.fop`**: Contains the `TicTacToe` class, which is responsible for building and managing the JavaFX GUI.
* **`de.tum.cit.fop.logic`**: Contains the `Game` class, which handles all the game's logical operations, and the `GameStatus` and `Player` enums, which represent the state of the game and the current player.

---

## Implemented Functionalities

The solution successfully implements all the required GUI components and their interactions, following the provided task description.

### Part 1: Labels

Two `Label` objects, `state` and `info`, were created and initialized to display the game status and current player's turn. These labels were then placed inside an `HBox` and centered to form the top section of the game's layout.

### Part 2: Cells and Grid

The core of the game interface consists of the playable cells and their associated events.

* **Game Cells**: Nine `Button` objects were created to serve as the individual cells of the game board. Each button was styled with a minimum size and a specific look and feel.
* **Marking Event**: The `markCellEvent` method was implemented to handle player clicks. This method checks if the game is currently running and if the selected cell is empty.
    * If the conditions are met, the cell is marked with the current player's symbol (`X` or `O`), the button's text is updated, and the `info` label is changed to reflect the next player's turn.
    * If the game has ended, the `info` label is updated to display a winning message (e.g., "Player O won!") or a "Draw!" message.
* **Grid Layout**: A `GridPane` was used to arrange the nine game cell buttons in a 3x3 grid, with their positions matching the logical coordinates used by the `Game` class.

### Part 3: Final Scene Setup

This part combines all the elements into a final, runnable application.

* **Restart Button**: A `Button` with the text "restart" was created. When clicked, it closes the current application window and calls the `start` method recursively to reset the game and start a new one.
* **Main Container**: All the components—the `HBox` of labels, the `GridPane`, and the restart button—were placed inside a single `VBox` to ensure proper alignment and spacing. This `VBox` was centered and styled according to the given constants.
* **Scene and Stage**: A new `Scene` was created using the `VBox` as its root node. This scene was then set on the primary `Stage`, which was finally displayed to the user.
