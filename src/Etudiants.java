public class Etudiants extends Personne implements Comparable<Etudiants>{
    private int matricule;
    private float[] notes;
    public Etudiants(int matricule,float[] notes,int age,String nom,String prenom){
        super(age, nom, prenom);
        this.matricule=matricule;
        this.notes=notes;
    }
    public double CalculMoyenne(){
        float sum=0;
        for ( int i=0; i<notes.length; i++ ) {
            sum += notes[i];
        }
        return (sum/notes.length);
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println(matricule);
        for ( int i=0; i<notes.length; i++ ) {
            System.out.println(notes[i]);
        }
    }

    @Override
    public void affichertype() {
        System.out.println("Le type de la classe est : " + this.getClass().getName());
    }

    @Override
    public int compareTo(Etudiants autre) {
        return Double.compare(autre.CalculMoyenne(), this.CalculMoyenne());
    }
}
