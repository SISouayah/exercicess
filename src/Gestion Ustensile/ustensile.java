public abstract class ustensile {
    private int annee;

    public ustensile() {
    }

    public ustensile(int anne) {
        this.annee = annee;
    }

    public void set_anne(int anne) {
        this.annee = annee;

    }

    public int get_anne() {
        return this.annee;
    }

    public  double calculerValeur(int anneeActuelle) {
        double age = (anneeActuelle - get_anne());
        double valeurs=0;
        if (age >=50) {
            valeurs = age - 50;
        }

        return valeurs;

    }
    }