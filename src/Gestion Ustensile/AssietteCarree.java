public class AssietteCarree  extends assiette{
    private double cote;
    public AssietteCarree(int annee,double cote) {
        super(annee);
        this.cote=cote;

    }
    public void set_cote(double cote ){
        this.cote=cote;

    }
    public double get_cote() {
        return this.cote;
    }
    public void afficheA(){

        System.out.println("le COTE est"+this.cote);
    }
    public double calculerValeurcarre() {
        return 5 *calculerValeur(2023);}
    public double calculSurface(){
        return cote * cote;
    }
}
