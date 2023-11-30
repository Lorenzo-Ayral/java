package file;

public class Lambda {
    // Interface fonctionnelle
    interface Calcul {
        int operation(int a, int b);
    }

    public static class TestLambda {
        public static void main(String[] args) {
            // Utilisation d'une expression lambda pour implémenter l'interface fonctionnelle
            Calcul addition = (a, b) -> a + b;
            Calcul multiplication = (a, b) -> a * b;

            // Appel des méthodes définies par les expressions lambda
            System.out.println(addition.operation(5, 3)); // Affiche 8
            System.out.println(multiplication.operation(5, 3)); // Affiche 15
        }
    }

}
