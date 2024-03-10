public abstract class Personne{
    private int age;
    private String nom;
    private String prenom;
    public Personne(){

    }
    public Personne(int age,String nom,String prenom){
        this.age=age;
        this.nom=nom;
        this.prenom=prenom;
    }
    public void afficher(){
        System.out.println(age);
        System.out.println(nom);
        System.out.println(prenom);
    }
    public abstract void affichertype();

    public String getNom() {
        return nom;
    }
    public String getPrenom(){
        return prenom;
    }
}

