public class AssietteRonde  extends assiette{
    private double rayon;
    public  AssietteRonde (double rayon,int annee){
        super(annee);
        this.rayon=rayon;

    }
    public void set_Ronde(double rayon ){
        this.rayon=rayon;

    }
    public double get_Ronde() {
        return this.rayon;

    }
    public void afficheR(){
        System.out.println("le rayon est"+this.rayon);
    }
    public double calculAssietteRonde() {
        return 3.14 * rayon * rayon;
    }
    public double calculSurface(){
        return 3.14 * rayon * rayon;
    }
}
