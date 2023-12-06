public class client {
    String nom;
    String prenom;
    int cin;
   int tel;
    public client(){}
    public client(String nom,String prenom ,int cin,int tel){
        this.nom=nom;
        this.prenom=prenom;
        this.cin=cin;
        this.tel=tel;
    }
    public client(String nom,String prenom ,int cin){
        this.nom=nom;
        this.prenom=prenom;
        this.cin=cin;}

    public void affiche(){
        System.out.println(nom+prenom+cin+tel);
    }
}
