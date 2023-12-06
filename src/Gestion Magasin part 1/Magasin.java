
public class Magasin {
    String adress;
    int id;
    int Capasitee;
    static int nbr;
    Produit[] products;

    Magasin(String adress,int id,int capasitee,Produit[] p){
        this.adress=adress;
        this.id=id;
        this.Capasitee=capasitee;
        this.products = new Produit[50];
        this.products=p;
        nbr++;
    }

    void AfficherMagasin(){
        System.out.println(id +" "+ adress +" "+Capasitee);
        for (int i=0;i<products.length;i++){
            if (products[i] != null) {
            products[i].afficherProduit();
        }}
    }
}
