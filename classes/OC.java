package classes;

public class OC {
    public static void main(String[] args) {
      Voiture ferrari = new Voiture();
      ferrari.start("Ferrari", "Bip");

      Voiture punto = new Voiture();
      punto.start("Punto", "Pouet");

      Bateau yacht = new Bateau("Yacht");
      yacht.start("Splash");
    }
}

class Vehicule{
    void start(String nom, String bruit){
        System.out.println("Ma " +nom+ " fait " + bruit);
    }
}

class Voiture extends Vehicule{

    void start(String nom, String bruit){
        super.start(nom, bruit);
        allumerFeux();
    }

    void allumerFeux(){
        System.out.println("Allumage des feux !");
    }
}

class Bateau extends Vehicule {
    private String name;

    Bateau(String name) {
        this.name = name;
    }

    void start(String bruit) {
        System.out.println("Mon " + name + " fait " + bruit);
    }
}
