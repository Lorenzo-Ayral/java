package cleanHello;

/** Ceci est une implémentation du message traditionnel "Hello world!"
 * @author L'équipe Education d'OpenClassrooms
 */
public class CleanWorld {

    /** Le programme commence ici */
    public static void main(String[] args) {
        sayHelloTo("world");

        for(int i= 0; i <= 150; i++){
            sayHelloTo(Integer.toString(i));
        }

        arrayLoop();

    }

    /** affiche le message "hello" au destinataire fourni
     *
     * @param recipient
     */
    private static void sayHelloTo(String recipient) {
        System.out.println("Hello " + recipient);
    }

    private static void arrayLoop() {
        int[] myArray = new int[]{7,2,4};
        for (int i=0; i<myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }

}