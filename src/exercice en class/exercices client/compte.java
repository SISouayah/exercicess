public class compte {
    private int solde;
    static  int code;
    private client p;
    public compte( ){code++;}
    public compte( int solde,client p){
        this.solde=solde;
        this.p=p;
        code++;
    }

     public void  deposer (int montant){
        this.solde=this.solde+montant;
    }
    public void rettire(int montant){
        if (montant>this.solde){
            System.out.println("le solde est insuffisant");
        }
        else {
                this.solde=this.solde-montant;}
        }
        public void virement(int montant,compte k){
       this.rettire(montant);
       k.deposer(montant);
        }
        public void affiche(){
            System.out.println(solde);


        }
        public void set(client p ){
            this.p=p;
        }

    @Override
    public String toString() {
        return "le solde est"+solde+p.nom+p.prenom;
    }


}

