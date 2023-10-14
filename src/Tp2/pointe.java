public class pointe {
    int ord;
    int abs;
    static int nombre;
    int numero;

    pointe() {
        abs = 0;
        ord = 0;
        nombre++;
    }
    void setCoordonneepointe(int u, int v) {
        abs = u;
        ord = v;
    }
    void Translate(int u, int v) {
        abs = abs + u;
        ord = ord + v;
    }

    void affichpointe() {
        System.out.println("les cordonner de la point est " + abs + ", " + ord);
    }

    boolean origine() {
        return abs == 0 && ord == 0;
    }
    boolean Egal(pointe q) {
        return abs == q.abs && ord == q.ord;
    }
    void autrePointe(pointe p2) {
        abs = p2.abs;
        ord = p2.ord;
    }
    pointe symetrie(){
        pointe sp=new pointe();
        sp.abs=0-abs;
        sp.ord=0-ord;
        return sp;
    }
}