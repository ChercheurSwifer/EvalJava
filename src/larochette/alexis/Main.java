package larochette.alexis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("-----------------------------------");
	    System.out.println("Km vers miles :" + fonction.km_vers_mile(1.609));
        System.out.println("Le plus grand diviseur commun est : " + fonction.pgcd(81,15));
        System.out.println("-----------------------------------");
        System.out.println(+ fonction.sumNprem(5) +" <--");

        System.out.println("\n---------------------------------------------------------");
        System.out.println("EXERCICE 1 - POLYGONES ");
        System.out.println("---------------------------------------------------------");

        Polygon polygone1 = new Polygon(5,8);
        Polygon polygone2 = new Polygon(4,9);
        polygone1.randomPolygon();
        polygone2.randomPolygon();
        System.out.println(polygone1.toString());
        System.out.println(polygone2.toString());
        System.out.println(polygone1.getPérimètre());
        System.out.println(polygone2.getPérimètre());
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        if(sc1 != null) {
            System.out.println("VOULEZ VOUS AJOUTER UN NOMBRE DE COTE ?");
            sc1.next();
            polygone1.presqueClone(sc1);
            System.out.println("Nombre de côté ajouté !");
            System.out.println("-----------------------------------");
            if(sc2 != null) {
                System.out.println("VOULEZ VOUS RETIRER UN NOMBRE DE COTE ?");
                sc2.next();
                polygone1.presqueClone(sc1);
                System.out.println("Nombre de côté retiré");
            }
        }
        System.out.println("-----------------------------------");
        System.out.println(polygone1.toString());
        System.out.println(polygone2.toString());
        System.out.println("-----------------------------------");
        if(polygone1.getPérimètre() > polygone2.getPérimètre())
        {
            System.out.println("Polygone 1 est plus grand que Polygone 2");
        }
        else
        {
            System.out.println("Polygone 1 est plus petit que Polygone2 \n");
        }
        System.out.println("\n---------------------------------------------------------");
        System.out.println("EXERCICE 2 - GESTION D'HEURE ");
        System.out.println("---------------------------------------------------------");
        IntervenantExterieur Ite = new IntervenantExterieur("RICOLAS","44");
        IntervenantFac Itf = new IntervenantFac("MEYOS","15");
        System.out.println(Ite.toString());
        System.out.println(Itf.toString());
    }

}
