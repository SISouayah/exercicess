public class comptetest {
    public static void main (String[]args){
compte p=new compte();
compte t=new compte();
client c=new client();
client c1=new client();
    p.deposer(1000);
    t.deposer(500);
    p.affiche();
    t.affiche();
    p.rettire(300);
    t.virement(600,p);
    t.affiche();
    p.affiche();

    c1.affiche();
    c.nom="ala";
    c.prenom="souayah";
    c.cin=234321;
    c.affiche();
}
}