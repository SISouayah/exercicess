public class Livre1{
        int id;
        String prenom;
        String nom;
        double prix;
        public Livre1(int i,String p, String n ,double pr){
            this.id=i;
            this.prenom=p;
            this.nom=n;
            this.prix=pr;



        }
        public Livre1() {
        }

        public void affiche() {
                Livre1 l1=new Livre1(1,"java","ala",1000.0);
                Livre1 l2=new Livre1();
                System.out.println("id "+this.id+" nom "+this.nom+" prenom "+this.prenom+" prix "+this.prix);
        }
}