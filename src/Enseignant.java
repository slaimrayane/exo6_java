public class Enseignant extends Personne implements Comparable<Enseignant>{
    private long nss;
    private String[] modules;
    public Enseignant(long nss,String[] modules,int age,String nom,String prenom){
        super(age, nom, prenom);
        this.nss=nss;
        this.modules=modules;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println(nss);
        for ( int i=0; i<modules.length; i++ ) {
            System.out.println(modules[i]);
        }
    }

    @Override
    public void affichertype() {
        System.out.println("Le type de la classe est : " + this.getClass().getName());
    }

    @Override
    public int compareTo(Enseignant o) {
        // Comparaison des noms
        int resultatNom = this.getNom().compareTo(o.getNom());
        if (resultatNom != 0) {
            return resultatNom;
        } else {
            // Si les noms sont les mêmes, comparer les prénoms
            return this.getPrenom().compareTo(o.getPrenom());
        }
    }
}
