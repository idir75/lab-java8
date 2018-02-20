package ida.java8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lambda {

    public static void main( String[] args ) {
        String newLine = "\n -------------------------";
        List<String> listString = Arrays.asList( "C", "B", "A" );
        for (String s : listString) {
            System.out.print( s );
        }

        System.out.println( newLine );
        //Apply the function on each element of the list
        listString.forEach( ( String e ) -> System.out.println( e ) );

        System.out.println( newLine );
        //The type is inferred automatically
        listString.forEach(e -> System.out.println( e ) );

        System.out.println( newLine );
        List<Integer> listInt = Arrays.asList( 1, 2, 3 );

        System.out.println( newLine );
        listInt.forEach(i -> System.out.println(1 + i));

        System.out.println( newLine );
        listString.forEach( e -> {
            //Possibility to make many operations in the same function
            System.out.print( e );
            System.out.print( e );
        } );

        System.out.println(newLine);

        //On peut accéder aux variables locales depuis l'expression lambda
        String separator = ":";
        listString.forEach(e -> System.out.println(e + separator));

        //La fonction lambda peut retourner une valeur.
        //Il n'est pas nécessaire d'indiquer le type de la valeur de retour.
        //Le type de la valeur de retour est déterminé par le compilateur par inférene de type.
        //Les expressions suivantes sont donc toutes équivalentes

        Collections.sort(listString, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return a.compareTo(b);
            }
        });
        System.out.println("Liste triée 1 : " + listString);

        listString = Arrays.asList( "C", "B", "A" );
        Collections.sort(listString, (String a, String b) -> {
            return a.compareTo(b);
        });
        System.out.println("Liste triée 2 : " + listString);

        listString = Arrays.asList( "C", "B", "A" );
        Collections.sort(listString, (String a, String b) -> a.compareTo(b));
        System.out.println("Liste triée 3 : " + listString);

        listString = Arrays.asList( "C", "B", "A" );
        listString.sort((a, b) -> a.compareTo(b));
        System.out.println("Liste triée 4 : " + listString);

        //Tri inversé
        listString.sort(Collections.reverseOrder());
        System.out.println("Liste triée à l'inverse 5 : " + listString);
    }
}
