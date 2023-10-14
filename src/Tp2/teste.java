public class teste {
    public static void main(String[] args){
        pointe p =new pointe();
        pointe q=new pointe();
        p.setCoordonneepointe(15,2);
        q.setCoordonneepointe(14,10);

        p.affichpointe();
        q.affichpointe();

        if (p.origine()){
            System.out.println("le p est l'orgine de repere");
        }else{
            System.out.println("le cordonnee de p non nule");
        }

        if (p.Egal(q)){
            System.out.println("la point p egale la point q");

        }else{
            System.out.println("la point p differant a la point q");

        }
        p.affichpointe();
        pointe rs=p.symetrie();
        System.out.println("le symetrie de cette point est "+rs.abs +","+rs.ord);
        System.out.println("le nombre de point ="+pointe.nombre);


    }
}