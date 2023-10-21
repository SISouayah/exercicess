public class Laboratoire {
    String nom;
    String specialite;
    Adresse A;
    Bureau B[];

    public Laboratoire() {
    }

    public Laboratoire(String nom, String specialite, Adresse A, Bureau B[]) {
        this.nom = nom;
        this.specialite = specialite;
        this.A = A;
        this.B = new Bureau[50];
        this.B = B;
    }

    public void afficher() {
        System.out.println("the Name is " + nom + "Speciality" + specialite);
        this.A.afficher();
        int i;
        int n = this.B.length;
        for (i = 0; i < n; i++) {
            this.B[i].afficher();


        }
    }

    public String toString() {
        String resultat = "your name" + nom;
        resultat = resultat + specialite;
        resultat = resultat + "adresse" + A;
        int i;
        int n = this.B.length;
        for (i = 0; i < n; i++) {
            resultat = resultat + this.B[i];
        }
        for (Bureau BB : B) {
            if (BB != null)
                resultat = resultat + BB;

            }
            return resultat;
        }
    }
