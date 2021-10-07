package larochette.alexis;

public class fonction {

    /**
     *  La partie fonction.java c'etait les premiers exo cela fonctionne.
     */

    public static double km_vers_mile(double km) {
        return km / 1.609;
    }


    public static int pgcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return pgcd(b, a % b);
        }
    }

    public static int sumNprem(int n) {
        int reste;
        boolean cdt = true;
        for (int i = 2; i <= n / 2; i++) {
            reste = n % i;

            if (reste == 0) {
                cdt = false;
                break;
            }
        }
        if(cdt)
        {
            System.out.println("Ceci est un nombre premier");
            return n;
        }
        else {
            System.out.println("Ceci n'est pas un nombre premier");
            return n;
        }
    }
}