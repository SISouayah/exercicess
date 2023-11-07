public class Bureau {
    int code;
    String nom;
    chercheur c[];
    public Bureau() {}
    public Bureau(int code, String nom, chercheur c[]) {
        this.code = code;
        this.nom = nom;
        this.c = new chercheur[5];
        this.c = c;

    }
    public void afficher() {
        System.out.println("your code" + code + "your name" + nom);
        int i;
        int n =this.c.length;
        for (i = 0; i < n; i++) {
            this.c[i].afficher();
            System.out.println(c[i].toString());
        }
    }
    public String toString() {
        String result="your code"+code+"your name"+nom;
        int i;
        int n=this.c.length;
        for (i = 0;  i < n ; i++){
            result =result+this.c[i].toString();
        }
        return result;
    }
}