import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;



public class testes {
    public static void main(String[] args){
        Scanner objetscan=new Scanner(System.in);
        produit p=new produit();
        Date d3 = new Date("30/3/2023");
        Date d = new Date(2021,10,23);
        Date d2=new Date();
        produit p1 =new produit(1021,"lait","delice",0,d2);
        produit p2 =new produit(2510,"yaourt","vitalait",0,d);
        produit p3 =new produit(3250,"tomate","sicam",1.200,d);
        System.out.println("donner l identifier de produit");
        p.identifier=objetscan.nextInt();
        System.out.println("donner libelle de produit");
        p.libelle=objetscan.next();
        System.out.println("donner marque de produit");
        p.marque=objetscan.next();
        System.out.println("donner prix de produit");
        p.prix=objetscan.nextDouble();
        p1.affiche();
        p2.affiche();
        p3.affiche();
        p.affiche();

        p2.prix=700;
        System.out.println("le prix de produit modifier"+p2.prix);
        System.out.println(p.toString());
        p.setDate_ex(d);
        p2.setDate_ex(d3);
        p.affiche();
        p2.affiche();
        LocalDateTime t=LocalDateTime.now();
        System.out.println(t);
        System.out.println(new Date());
        System.out.println(new Date(2023-8-7));
        System.out.println(new Date(2023/8/7));
        System.out.println(new Date(7/8/2023));
        System.out.println(new Date("7/8/2023"));
        System.out.println(new Date("2023/8/7"));


                LocalDate Date = LocalDate.of(2023, 10, 23);
                System.out.println("la date donner est: " + Date);
            }
        }



