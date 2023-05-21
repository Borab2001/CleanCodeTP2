import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        List<String> myListOfStrings = new ArrayList<String>(Arrays.asList("First", "Second", "Third", "Fourth"));
        System.out.println(getSecondStringOf(myListOfStrings));

        List<Integer> myListOfIntegers = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
        System.out.println(getSecondIntegerOf(myListOfIntegers));

        List<Boolean> myListOfBooleans = new ArrayList<Boolean>(Arrays.asList(true, false));
        System.out.println(getSecondElementOf(myListOfStrings));
        System.out.println(getSecondElementOf(myListOfIntegers));
        System.out.println(getSecondElementOf(myListOfBooleans));

    }

    // Méthode qui récupère le deuxième élément d’une liste de string
    public static String getSecondStringOf(List<String> listOfStrings){
        return listOfStrings.get(1);
    }

    // Méthode qui récupère le deuxième élément d’une liste de Integer
    public static Integer getSecondIntegerOf(List<Integer> listOfIntegers){
        return listOfIntegers.get(1);
    }

    // Méthode générique qui récupère le deuxième élément d’une liste de type inconnu
    public static <T> T getSecondElementOf(List<T> listOfElements){
        return listOfElements.get(1);
    }
}


// La généricité en Java nous permet de créer des classes et des méthodes qui peuvent fonctionner avec différents types d'objets.
// Au lieu d'écrire des méthodes distinctes pour chaque type d'objet, nous pouvons utiliser une seule méthode qui fonctionne pour tous les types d'objets.
// En utilisant la généricité, nous pouvons écrire un code plus réutilisable et réduire la quantité de code que nous devons écrire et maintenir.
// Elle offre également une sécurité au moment de la compilation en garantissant que nous utilisons le bon type au moment de la compilation, plutôt qu'au moment de l'exécution.