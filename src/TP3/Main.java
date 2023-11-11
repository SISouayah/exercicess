  import java.util.Date;
import java.util.Locale;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Date date =new Date("31/2/2024");
        Produit product1 =new Produit(1021,"Lait","Delice",0,date);
        Produit product2 =new Produit(2510,"Yaourt","Vitalait",0,date);
        Produit product3 =new Produit(3250,"Tomate","Sicam",1.200,date);
        product1.afficherProduit();
        product2.afficherProduit();
        product3.afficherProduit();
        product1.setPrix(0.700);
        product1.afficherProduit();

        Scanner scan = new Scanner(System.in);
        System.out.println("donner le prix du produit "+product2+" :");
        double prix= scan.nextDouble();
        product2.setPrix(prix);
        product2.afficherProduit();
        product1.toString();
        product1.toString();
        product1.toString();
        LocalDateTime t= LocalDateTime.now();
        System.out.println(t);
        System.out.println("donner le nombre des produit dans la Magasin: ");
        int nombreProduits=0;
       do{  nombreProduits=scan.nextInt();}while (nombreProduits>50 || nombreProduits<0);
        Produit pr =new Produit();
        Produit[] TP = new Produit[50];
        for (int i=0;i<nombreProduits;i++){

            pr.prix=-0.1;
            while (pr.prix<=0){ System.out.println("donner le prix du Produit: ");
                pr.prix=scan.nextDouble();}

            System.out.println("donner Libellee du produit: ");

            pr.libelee=scan.next();
            pr.setLibelee(pr.libelee);
            System.out.println("donner mark: ");
            pr.mark=scan.next();
            pr.setMark(pr.mark);
            pr.setId(i);
            TP[i]=pr;


        }


        Magasin mg =new Magasin("Tunis",23234,9844,TP);
        System.out.println(Magasin.nbr);
mg.AfficherMagasin();





    }
}