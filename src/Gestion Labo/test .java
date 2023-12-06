public class test {
    public static void main(String[]args){
        Adresse A;
        A=new Adresse();
        A.codepostal=2047;
        A.gouvernorat="Ariena";
        A.ville="borj louzir";
        A.afficher();
        A.codepostal=2000;
        A.afficher();
        Adresse A1=new Adresse(1500,"tunis","tunis");
        A1.afficher();
        A1.codepostal=10100;
        A1.afficher();
        System.out.println("............................................");
        chercheur c1=new chercheur();
        c1.setnom("ala");
        c1.setposte("Dw");
        c1.setnmac(4325);
        c1.afficher();
        System.out.println(c1);
        System.out.println(c1.nbc);
        chercheur c2=new chercheur("GGA","Rapeur",105);
        System.out.println("Nombre de  chercheur"+ c1.nbc);
        if (c1.comparer(c2))
            System.out.println("les deux chercheur sont identiques");
        else
            System.out.println("les deux chercheurs sont differnets");
        c2.setnmac(43251212);
        c2.setnmac(43251212);
        chercheur c3=new chercheur();
        System.out.println("............................................");
        c3.ajouter("robot","bot",33);
        c3.afficher();
        System.out.println("nombre de chercheur"+c3.nbc);
        chercheur ct[]={c1,c2,c3};
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
