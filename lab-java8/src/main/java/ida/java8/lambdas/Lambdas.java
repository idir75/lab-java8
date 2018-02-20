package ida.java8.lambdas;

import java.util.Arrays;
import java.util.List;

public class Lambdas {

    public static void main( String[] args ) {
        String newLine = "\n -------------------------";
        List<String> listSting = Arrays.asList( "a", "b", "c" );
        for (String s : listSting) {
            System.out.print( s );
        }

        System.out.println( newLine );
        //Apply the function on each element of the list
        listSting.forEach( ( String e ) -> System.out.println( e ) );

        System.out.println( newLine );
        //The type is inferred automatically
        listSting.forEach(e -> System.out.println( e ) );

        System.out.println( newLine );
        List<Integer> listInt = Arrays.asList( 1, 2, 3 );

        System.out.println( newLine );
        listInt.forEach(i -> System.out.println(1 + i));

        System.out.println( newLine );
        listSting.forEach( e -> {
            //Possibility to make many operations in the same function
            System.out.print( e );
            System.out.print( e );
        } );

        System.out.println(newLine);

        //On peut accéder aux variables locales depuis l'expression lambda
        String separator = ":";
        listSting.forEach(e -> System.out.println(e + separator));

        //La fonction lambda peut retourner une valeur.
        //Il n'est pas nécessaire d'indiquer le type de la valeur de retour.
        //Le type de la valeur de retour est déterminé par le compilateur par inférene de type.
        //Les deux expressions suivantes sont donc équivalentes
        listSting.sort( ( e1, e2 ) -> e1.compareTo( e2 ) );
        System.out.println("Liste triée");
        System.out.println(listSting);

        List<String> listCapitalSting = Arrays.asList("C", "B", "A");
        listCapitalSting.sort( ( e1, e2 ) -> {
            int result = e1.compareTo( e2 );
            return result;
        } );
        System.out.println("Liste triée une autre fois");
        System.out.println(listCapitalSting);


    }
}
