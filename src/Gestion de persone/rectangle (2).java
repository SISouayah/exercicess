package com.mycompany.helloword1;

public class Rectangle {
    float longueur=200;
    float largeur=100;
    public Rectangle(float longueur,float largeur){
        this.longueur=longueur;
        this.largeur=largeur;

    }
    public float Perimetre() {
        return 2 * (largeur + Longueur);
    }
    public double Diagonale(){
        return largeur+ Longueur;}

    public void Doubler () {
        Largeur *=2;
        Longueur *=2;}
    public void Afficher () {
        System.out.println ("Longueur :"+ longueur);
        System. out.println ("Largeur :" + largeur);
        System.out.println("Perintre:"+Perimetre());
        System.out.println ("Diagonale:" + Diagonale());
    }
    public static void main(String[] args) {
        Rectangle monRectangle = new Rectangle ( longueur: 5.Of, largeur: 10.0f);
        monRectangle.Afficher();
        System.out .println ("Apres avoin les dimensions:");
        monRectangle .Doubler ();
        monRectangle.Afficher();
    }
}