package ida.java8.optional;

import java.util.Date;
import java.util.Optional;

public class Optionals {

    public static void main( String[] args ) {

        Optional<String> name = Optional.ofNullable( null );

        System.out.println( "Name is present? " + name.isPresent() );
        System.out.println( "Name value : " + name.orElseGet( () -> "[name not present]" ) );
        System.out.println( name.map( s -> "Hello " + s ).orElse( "Hello Unknown!" ) );

        Optional<String> nameJava8 = Optional.ofNullable( "Java8" );
        System.out.println( "Name is present? " + nameJava8.isPresent() );
        System.out.println( "Name value : " + nameJava8.orElseGet( () -> "[name not present]" ) );
        System.out.println( nameJava8.map( s -> "Hello " + s ).orElse( "Hello World!" ) );
    }
}
