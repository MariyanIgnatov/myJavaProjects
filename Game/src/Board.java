
public class Board {
    private Field[][] board;
    public final int size=3;
    public Board(){
        this.board = (new Field[size][size]);
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                board[i][j] = new Field();
            }
        }
    }
    public void setField(int x, int y, Player player){
        this.board[x][y].set(player);
    }
    public Field getField(int x, int y){
        return this.board[x][y];
    }
    public boolean isFulled(){
        int counter =0;
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                if(board[i][j].isEmpty() == false){
                    counter++;
                }
            }
        }
        return counter == size*size;
    }
    
    public void printTable(){
        for(int i=0; i<this.size; i++){
            for(int j=0; j<this.size; j++){
                System.out.print(this.getField(i, j).getValue() + " ");
            }
            System.out.println();
        }
    }
}
