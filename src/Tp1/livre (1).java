public class livre {
    private int id;
    private String prenom;
    private String nom;
    private double prix;
    public static int count;
    public livre (int i,String p, String n ,double pr){
           this.id=i;
           this.prenom=p;
           this.nom=n;
           this.prix=pr;
           count++;




}
public livre () {
        count++;
}

    public void affiche() {
        System.out.println("id "+this.id+" nom "+this.nom+" prenom "+this.prenom+" prix "+this.prix);
    }
}
