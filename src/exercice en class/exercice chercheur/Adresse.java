public class Adresse {
    int codepostal;
    String gouvernorat;
    String ville;



    public Adresse(){

    }
    public Adresse(int codepostal,String gouvernorat,String ville){
        this.codepostal=codepostal;
        this.gouvernorat=gouvernorat;
        this.ville=ville;
    }
    public void afficher(){
        System.out.println("le code postal est "+codepostal+"le gouvernorat est"+gouvernorat+"la ville est"+ville);
    }
    public void modifier(int c){
        this.codepostal=c;
    }
    public String toString() {
        return "code postal"+codepostal+"gouvernorat"+gouvernorat+"ville"+ville;
    }
}
