package collection;

import java.util.*;

public class Collection {
    public static void main(String[] args){
        //TODO- Déclarez une variable nommée colors qui correspond à un tableau de String de longueur 5

        String[] colors = new String[5];


        //TODO- Remplissez le tableau avec les couleurs demandées
        colors = new String[]{"Bleu", "Vert", "Jaune", "Orange", "Rouge", "Marron"};

        //TODO- Remplacez 'green' par 'emerald' dans le tableau

        colors[1] = "Emeraude";

        System.out.println(colors.length);

        //Affiche le contenu du tableau
        for(String color:colors){
            System.out.println(color);
        }

        //Liste ordonnée
        List<Integer> myList = new ArrayList<Integer>(); // -> []

        myList.add(7); // -> [7]
        myList.add(5); //-> [7, 5]
        myList.add(1,12); //-> [7, 12, 5]
        myList.set(0,4); // -> [4, 12, 5]
        myList.remove(1); // removed 12 -> [4, 5]
        System.out.println(myList.size());

        //Ensemble
        Set<String> ingredients = new HashSet<String>();

        ingredients.add("eggs");
        ingredients.add("sugar");
        ingredients.add("butter");
        ingredients.add("salt");
        ingredients.remove("salt"); //enlevez du sel des ingrédients
        System.out.println(ingredients.size());

        //Dictionnaire (Map), permet de stocker des paires clé-valeur
        Map<String, Integer> map = new HashMap<String, Integer>();

        map.put("Jean", 34);
        map.put("Jeannette", 22);
        map.put("Jean", 98);
        map.put("Paul", 31);
        // Définissez des clés en tant que constantes dans votre classe
        final String KJENNY = "Jenny";
        final String KLIVIA = "Livia";
        final String KPAUL = "Paul";
        // Utilisez des constantes en tant que keys
        map.put(KJENNY, 34);
        map.put(KLIVIA, 28);
        map.put(KPAUL, 31);
        System.out.println(map.get("Jenny"));

        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println(map.size());
    }
}

//    Dans ce chapitre, vous avez appris les bases pour travailler avec des conteneurs qui stockent plusieurs éléments d'un type de données en particulier :
//
//        conteneurs de taille fixe : Arrays – les éléments d'un tableau sont indexés à partir de 0 et sont accessibles à l'aide de cet index. Le nombre d'éléments ne peut pas être modifié ;
//
//        listes ordonnées : Lists – les éléments d'une liste se comportent comme un tableau. Le nombre d'éléments peut évoluer en ajoutant et en supprimant des éléments ;
//
//        listes non ordonnées : Sets – les éléments d'un ensemble sont stockés sans ordre particulier. Vous pouvez y accéder en les énumérant ;
//
//        dictionnaires : Maps – les éléments d'un dictionnaire sont organisés par paires clé-valeur et sont accessibles à l'aide d'une clé ;
//
//        les actions les plus courantes effectuées avec les collections sont :
//
//        accéder à un élément,
//
//        ajouter un nouvel élément,
//
//        supprimer un élément,
//
//        modifier un élément,
//
//        compter tous les éléments,
//
//        parcourir tous les éléments.