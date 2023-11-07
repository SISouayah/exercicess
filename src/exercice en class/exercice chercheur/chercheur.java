public class chercheur {
    static int nbc=0;
    private String nom ;
    private String poste;
    private int nmac;
                   public chercheur (){
                     nbc++;}

                 public chercheur(String nom, String poste, int nmac){
                    this.nom=nom;
                    this.poste=poste;
                    this.nmac=nmac;
                    nbc++;}
                 public void afficher (){
                     System.out.println("nom:"+nom+"poste"+poste+"nmac"+nmac);}
                 public Boolean comparer(chercheur C){
                    if (this.nmac== C.nmac) {
                        if (this.nom==C.nom) {
                            if (this.poste ==C.poste) {
                                return true;}}}
                    return false;}
                 public String toString(){
                     return "nom :" +nom+ "Poste:"+ poste+"nmac:"+nmac;}
                 public void modifier(int c) {
                     nmac=c;}


                public void setnom(String nom){
                       this.nom=nom;

                }
                public void setposte(String poste){
                       this.poste=poste;

                }
                public void setnmac(int nmac) {
                    this.nmac = nmac;
                }
                public void ajouter(String nom, String poste,int nmac) {
                      this.nom=nom;
                      this.poste=poste;
                      this.nmac=nmac;}
}