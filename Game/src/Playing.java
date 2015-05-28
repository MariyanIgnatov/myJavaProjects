import java.io.IOException;


public class Playing {
    public static final char signOne = 'X';
    public static final char signTwo = 'O';
    
    public static void main(String[] args) throws IOException {
        int counter = 0;
        
        
        Player firstPlayer = new Player(signOne);
        Player secondPlayer = new Player(signTwo);
        Board board = new Board();
        Game game = new Game(firstPlayer, secondPlayer, board);
        Reader read = new Reader();
        while(game.isOver() == false){
            board.printTable();
            Point point = read.reader();
            counter++;
            if(counter%2 == 1){
                firstPlayer.makeMove(point.getCoordinateX(), point.getCoordinateY(), board);
            }
            else{
                secondPlayer.makeMove(point.getCoordinateX(), point.getCoordinateY(), board);
            }
        };
        game.getWinner(firstPlayer, secondPlayer);
        
    }
}
