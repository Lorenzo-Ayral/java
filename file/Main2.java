package file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main2 {

    public static void main(String[] args) {

        try {
            // Création d'un fileWriter pour écrire dans un fichier
            FileWriter fileWriter = new FileWriter("/path/to/the/file", false);

            // Création d'un bufferedWriter qui utilise le fileWriter
            BufferedWriter writer = new BufferedWriter(fileWriter);

            // ajout d'un texte à notre fichier
            writer.write("preferenceNewsletter=false");

            // Retour à la ligne
            writer.newLine();

            writer.write("preferenceColor=#425384");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
