import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//            AssietteCarree  A =new AssietteCarree (1943,0);
//            AssietteRonde  S =new AssietteRonde (19,1955);
//
//            cuillere C =new cuillere(12,1965);
//            A.set_cote(5.55);
//            C.set_longeur(12);
//            S.set_Ronde(3.33);
//             A.afficheA();
//             C.afficheC();
//            S.afficheR();
//            System.out.println(A.calculerValeurcarre());
//            System.out.println(S.calculerValeur(2023));
//            System.out.println(C.calculerValeur(2023));
//        System.out.println("calcule Surface est ");
//        System.out.println(S.calculSurface());
//        System.out.println("calcule assiette ronde  est ");
//        System.out.println(S.calculAssietteRonde());
//        System.out.println("la langueur de cuillere est");
//        System.out.println(C.get_longeur());

        ustensile[] us = new ustensile[5];
        us[0] = new AssietteRonde(1943, 5);
        us[1] = new cuillere(1950, 10);
        us[2] = new AssietteCarree(1960, 7.0);
        us[3] = new cuillere(1975, 8);
        us[4] = new AssietteRonde(1985, 6);

        AfficheNbrCuillere(us);
        affichersurAS(us);
        affichervalototal(us);
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < us.length; i++) {
            System.out.println("Veuillez entrer les informations pour l'ustensile " + (i + 1));

            System.out.print("Année de fabrication : ");
            int anneeFabrication = scan.nextInt();

            System.out.print("Type d'ustensile (1 pour AssietteRonde, 2 pour AssietteCarree, 3 pour Cuillere) : ");
            int typeUstensile = scan.nextInt();

            switch (typeUstensile) {
                case 1:
                    System.out.print("Rayon de l'assiette ronde : ");
                    int rayonRonde = scan.nextInt();
                    us[i] = new AssietteRonde(anneeFabrication, rayonRonde);
                    break;
                case 2:
                    System.out.print("Côté de l'assiette carrée : ");
                    double coteCarree = scan.nextDouble();
                    us[i] = new AssietteCarree(anneeFabrication, coteCarree);
                    break;
                case 3:
                    System.out.print("Longueur de la cuillère : ");
                    int l= scan.nextInt();
                    us[i] = new cuillere(anneeFabrication,l);
                    break;
                default:
                    System.out.println("Type d'ustensile non valide. Veuillez réessayer.");
                    i--;
                    break;
            }
        }

        AfficheNbrCuillere(us);


        for (int i = 0; i < us.length; i++) {
            if (us[i] instanceof assiette) {
                assiette as = (assiette) us[i];
                double surface = as.calculSurface();
                System.out.println("Surface de l'assiette : " + surface);
            }
        }
        }
        public static void AfficheNbrCuillere(ustensile  us[]) {
           int nbr=0;
           for(int i=0;i < us.length;i++ ){
           if (us[i]instanceof cuillere){
               nbr++;
           }
           }
            System.out.println("le nbr de cuillere est"+nbr);
        }
          public static void affichersurAS(ustensile  us[]) {
        int nbr=0;
        double somme=0;
        for(int i=0;i < us.length;i++ ){

            if (us[i]instanceof assiette){
                somme=somme+((assiette) us[i]).calculSurface();
            }

}}
            public static void affichervalototal(ustensile  us[]) {
                int nbr=0;
                double somme=0;
                for(int i=0;i < us.length;i++ ){
                    somme=somme+us[i].calculerValeur(2023);}

System.out.println("valeur totale de colllection est"+somme);}}
