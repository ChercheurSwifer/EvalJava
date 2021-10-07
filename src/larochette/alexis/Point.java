package larochette.alexis;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    /**
     *
     * @return La coordonnée X du point.
     */
    public double getX(){
        return this.x;
    }

    /**
     *
     * @return La coordonnée Y du point.
     */
    public double getY(){
        return this.y;
    }

}