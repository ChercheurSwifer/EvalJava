package larochette.alexis;

import java.awt.geom.Line2D;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Manque beaucoup trop d'infos dans l'exo du Polygone.
 * Donc je personnalise plus selon ma façon de coder et mes methodes.
 *
 *
 * Pour la fonction plusPetit , vu que je joue avec des polygones randoms je ne l'ai pas crée en function mais directement mis dans le main
 * si poly1 < poly2 alors j'affiche sinon j'affiche le contraire
 *
 * function presqueClone aucune idée de comment m'y prendre
 *
 */

public class Polygon {
    private ArrayList<Point> points = new ArrayList<Point>();
    private double x;
    private double y;


    public Polygon(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX(double x) {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY(double y) {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }

    private void addPoint(double x, double y) {
        points.add(new Point(getX(x), getY(y)));
    }

    public static double getDistance(Point p1, Point p2){
        return Math.hypot((p1.getX() - p2.getX()), (p1.getY() - p2.getY()));
    }

    public void randomPolygon() {
        Random rand = new Random();

        addPoint(rand.nextDouble() * 10, rand.nextDouble() * 10);
        addPoint(rand.nextDouble() * 10, rand.nextDouble() * 10);
        addPoint(rand.nextDouble() * 10, rand.nextDouble() * 10);

        for(int i = 0; i < 10; i++) {
            int segment = rand.nextInt(points.size());

            Point point1 = points.get((segment + 1) % points.size());
            Point point2 = points.get(segment);

            Point point3 = points.get((segment + 2) % points.size());

            boolean set = false;
            while(!set) {
                double x = rand.nextDouble() * 10;
                double y = rand.nextDouble() * 10;

                Point newPoint = new Point(x, y);
                if(croisement(point1, point2, point3, newPoint)) {
                    points.add(segment + 1, newPoint);
                    set = true;
                }
                }
            }
        }

    private boolean croisement(Point point1, Point point2, Point point3, Point point4) {

        return Line2D.linesIntersect(point1.getX(), point1.getY(),
                point2.getX()-0.001, point2.getY()-0.001,
                point3.getX(), point3.getY(),
                point4.getX(), point4.getY());
    }

    @Override
    public String toString() {
        return "Polygon{" +
                "points=" + points +
                '}';
    }

    public double getPérimètre() {

        double resultat = 0;

        Point p0 = points.get(0);
        Point pointPrécédent = p0;

        for (int i = 1; i < this.points.size(); i++){
            Point pointCourant = this.points.get(i);
            resultat += getDistance(pointPrécédent, pointCourant);
            pointPrécédent = pointCourant;
        }

        resultat += getDistance(pointPrécédent,p0);

        return resultat;
    }

    public void presqueClone(Scanner value)
    {
        // Aucune idée
    }

}
