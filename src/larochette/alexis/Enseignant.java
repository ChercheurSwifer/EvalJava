package larochette.alexis;

public class Enseignant implements Enseignement
{
    /**
     * Q1 : Le père est l'enseignant, il possède 2 enfants , intervenantexterieur & enseignantfac
     * On peut utiliser une interface pour implementer les methodes
     */

    private String Nom;
    private String NbHeuresSupp;

    public Enseignant(String nom, String nbHeuresSupp) {
        Nom = nom;
        NbHeuresSupp = nbHeuresSupp;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getNbHeuresSupp() {
        return NbHeuresSupp;
    }

    public void setNbHeuresSupp(String nbHeuresSupp) {
        NbHeuresSupp = nbHeuresSupp;
    }

    @Override
    public String toString() {
        return "Enseignant{" +
                "Nom='" + Nom + '\'' +
                ", NbHeuresSupp='" + NbHeuresSupp + '\'' +
                '}';
    }

    @Override
    public void nom() {

    }

    @Override
    public void heureComp() {

    }

    @Override
    public void retribution() {

    }
}
