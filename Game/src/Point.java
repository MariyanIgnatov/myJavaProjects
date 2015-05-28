
public class Point {
    private int coordinateX;
    private int coordinateY;
    public Point(){
        this.coordinateX = -1;
        this.coordinateY = -1;
    }
    public Point(int coordianteX, int coordinateY){
        this.coordinateX= coordianteX;
        this.coordinateY= coordinateY;
    }
    public int getCoordinateY() {
        return coordinateY;
    }
    public void setCoordinateY(int coordinateY) {
        this.coordinateY = coordinateY;
    }
    public int getCoordinateX() {
        return coordinateX;
    }
    public void setCoordinateX(int coordinateX) {
        this.coordinateX = coordinateX;
    }
    
}
