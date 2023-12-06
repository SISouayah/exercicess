public class cuillere extends ustensile {
    private double l;
    public cuillere(double l,int annee){
        super (annee);
        this.l=l;

    }
    public void set_longeur(double l ){
        l=l;

    }
    public double get_longeur(){
        return l;

    }

    public void afficheC(){
        System.out.println("le langeur est"+this.l+"le anne est"+get_anne());
    }}

