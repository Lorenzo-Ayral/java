package portee;

public class Portee {
    public class Animal {
        // Accessible de partout car public
        public String nomPublic;

        // Accessible à la classe elle-même et aux sous-classes
        protected int ageProtege;

        // Accessible seulement à la classe elle-même
        private boolean estVivantPrive;

        // Accessible uniquement dans le même paquetage (package)
        String couleurParDefaut;

        // Constructeur
        public Animal(String nom, int age, boolean estVivant, String couleur) {
            this.nomPublic = nom;
            this.ageProtege = age;
            this.estVivantPrive = estVivant;
            this.couleurParDefaut = couleur;
        }
    }

    public class Chien extends Animal {
        // Constructeur appelant le constructeur de la classe parente
        public Chien(String nom, int age, boolean estVivant, String couleur) {
            super(nom, age, estVivant, couleur);
        }

        // Méthode publique accessible de partout
        public void aboyer() {
            System.out.println("Woof!");
        }

        // Méthode protégée accessible à la classe elle-même et aux sous-classes
        protected void manger() {
            System.out.println("Le chien mange.");
        }
    }
}
