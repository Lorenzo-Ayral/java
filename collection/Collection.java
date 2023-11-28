package collection;

public class Collection {
    public static void main(String[] args){
        //TODO- Déclarez une variable nommée colors qui correspond à un tableau de String de longueur 5

        String[] colors = new String[5];


        //TODO- Remplissez le tableau avec les couleurs demandées
        colors = new String[]{"Bleu", "Vert", "Jaune", "Orange", "Rouge", "Marron"};

        //TODO- Remplacez 'green' par 'emerald' dans le tableau

        colors[1] = "Emeraude";

        //Affiche le contenu du tableau
        for(String color:colors){
            System.out.println(color);
        }
    }
}