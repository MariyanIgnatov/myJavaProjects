public class Game {

    private Player playerOne;
    private Player playerTwo;
    private Board board;

    public Game(Player playerOne, Player playerTwo, Board board) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        this.board = board;
    }

    public boolean isOver() {
        boolean gameFinish = false;
        if (board.isFulled() == true || this.haveWinner() == true) {
            gameFinish = true;
        }
        return gameFinish;
    }

    private Player someoneWins() {
        // player One
        if (checkForWinner(playerOne)) {
            return playerOne;
        }

        // player Two

        if (checkForWinner(playerTwo)) {
            return playerTwo;
        }

        return null;

    }

    private boolean haveWinner() {
        if (this.someoneWins() == null)
            return false;
        else {
            return true;
        }
    }

    public void getWinner(Player firstPlayer, Player secondPlayer) {

        if (this.someoneWins() == null) {
            System.out.println("--- It's a Draw! ---");
        } else {
            if (this.someoneWins() == firstPlayer) {
                System.out.println("--- The winner is First player! ---");
            }
            if (this.someoneWins() == secondPlayer) {
                System.out.println("--- The winner is Second player! ---");
            }
        }

    }

    private boolean checkForWinner(Player player) {
        return diagonalCheck(player) || reverseDiagonalCheck(player) || rowCheck(player) || colomnCheck(player);
    }

    private boolean diagonalCheck(Player player) {
        for (int i = 0; i < board.size; i++) {
            if (board.getField(i, i).getValue() != player.getSign()) {
                return false;
            }

        }

        return true;
    }

    private boolean reverseDiagonalCheck(Player player) {
        for (int i = board.size - 1; i >= 0; i--) {
            int j = board.size - 1 - i;
            if (board.getField(i, j).getValue() != player.getSign()) {
                return false;
            }

        }

        return true;
    }

    private boolean colomnCheck(Player player) {
        int counter = 0;
        for (int i = 0; i < board.size; i++) {
            for (int j = 0; j < board.size; j++) {
                if (board.getField(j, i).getValue() == player.getSign()) {
                    counter++;
                } else {
                    break;
                }
            }
            if (counter == board.size) {
                return true;
            } else {
                counter = 0;
            }

        }
        return false;
    }

    private boolean rowCheck(Player player) {
        int counter = 0;
        for (int i = 0; i < board.size; i++) {
            for (int j = 0; j < board.size; j++) {
                if (board.getField(i, j).getValue() == player.getSign()) {
                    counter++;
                } else {
                    break;
                }

            }
            if (counter == board.size) {
                return true;
            } else {
                counter = 0;
            }
        }
        return false;
    }

}
