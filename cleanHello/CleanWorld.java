package cleanHello;

/**
 * Ceci est une implémentation du message traditionnel "Hello world!"
 *
 * @author L'équipe Education d'OpenClassrooms
 */
public class CleanWorld {

    /**
     * Le programme commence ici
     */
    public static void main(String[] args) {
        if (args.length==1) {
            sayHelloTo(args[0]);
        }
        else {
            sayHelloTo("world");
        }

        for (int i = 0; i <= 4; i++) {
            sayHelloTo(Integer.toString(i));
        }

        arrayLoop();

        forEachLoop();

        System.out.println("Lets go !");

        while (randomNumber() != 100) {
            System.out.println(randomNumber());
        }
        System.out.println("100 atteint");

        doWhileLoop();

        exception();

        exception2();
    }

    /**
     * affiche le message "hello" au destinataire fourni
     *
     * @param recipient
     */
    private static void sayHelloTo(String recipient) {
        System.out.println("Hello " + recipient);
    }

    private static void arrayLoop() {
        int[] myArray = new int[]{7, 2, 4};
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }

    private static void forEachLoop() {
        int[] myArray = new int[]{1, 6, 9};
        for (int number : myArray) {
            System.out.println(number);
        }
    }

    static int randomNumber() {
        return (int) ((Math.random() * ((100 - 1) + 1)) + 1);
    }

    private static void doWhileLoop() {
        // Boucle "While"
        int pushUpGoal = 0;
        while (pushUpGoal > 0) {
            System.out.println("No Push up!");
            pushUpGoal -= 1;
        }
        // Boucle "do/while"
        int pushUpGoal2 = 0;
        do {
            System.out.println("Push up!");
            pushUpGoal2 -= 1;
        } while (pushUpGoal2 > 0);
    }

    private static void exception() {
        for ( int i=0; i <10; i++) {
            System.out.println("J'en suis à " + i);
            if(i == 2 ||i == 5) {
                continue;
            }
            System.out.println("Je vaux " + i);
        }
    }

    private static void exception2() {
        for ( int i=0; i <10; i++) {
            System.out.println("J'en suis à " + i);
            if(i == 2 ||i == 5) {
                break;
            }
            System.out.println("Je vaux " + i);
        }
    }
}