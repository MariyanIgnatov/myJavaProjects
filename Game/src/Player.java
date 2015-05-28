//import java.util.Stack;


public class Player {

private char sign;
//private Stack<Field> movies;
public char getSign() {
    return sign;
}
public Player(char sign){
    this.sign = sign;
}
public void setSign(char sign) {
    this.sign = sign;
}
public void makeMove(int x, int y, Board board){
    board.setField(x, y, this);
}

}
