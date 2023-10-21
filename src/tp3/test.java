public class test {
    public static void main(String[]args){
        Adresse A;
        A=new Adresse();
        A.codepostal=2047;
        A.gouvernorat="Ariena";
        A.ville="borj louzir";
        A.afficher();
        A.modifier(2000);
        A.afficher();
        Adresse A1=new Adresse(1500,"tunis","tunis");
        A1.afficher();
        A1.modifier(10100);
        A1.afficher();
        System.out.println("............................................");
        chercheur c=new chercheur("Aloulou","developpeur",144);
        chercheur c1=new chercheur();
        c1.afficher();
        chercheur c2=new chercheur("GGA","Rapeur",105);
        System.out.println(c);
        System.out.println("Nombre de  chercheur"+ c.nbc);
        Boolean tes=c.comparer(c2);
        if (tes == true)
            System.out.println("les deux chercheur sont identiques");
        else
            System.out.println("les deux chercheurs sont differnets");
        c2.modifier(54545454);
        c2.modifier(21212121);
        chercheur c3=new chercheur();
        System.out.println("............................................");
        c3.ajouter("robot","bot",33);
        c3.afficher();
        System.out.println("nombre de chercheur"+c.nbc);
        chercheur ct[]={c,c2,c3};
        Bureau B1=new Bureau(123,"bures",ct);
        Bureau B2=new Bureau(321,"bure",ct);
        Bureau BT[]={B1,B2};
        Laboratoire L=new Laboratoire("labo","space",A,BT);
        System.out.println("............................................");
        L.afficher();
        System.out.println(L);
        System.out.println("..............That's Good..................");

    }
}
