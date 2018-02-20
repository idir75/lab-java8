## Introduction

Ce lab a pour but de présenter les nouveautés de Java 8.

## Optionals
Optional est une classe utilitaire fournissant des méthodes pour mieux gérer les valeurs null. Cela permet une meilleure gestion des NullPointerException.
Plus concrètement, Optional est une classe qui contient une valeur qui pourrait être null ou non null.

Dans l'exemple ci-dessous, le variable `name` ne contient pas de valeur.
```java
Optional<String> name = Optional.ofNullable( null );

System.out.println( "Name is present? " + name.isPresent() );
System.out.println( "Name value : " + name.orElseGet( () -> "[name not present]" ) );
System.out.println( name.map( s -> "Hello " + s ).orElse( "Hello Unknown!" ) );
```

Résultat

```java
Name is present? false
Name value : [name not present]
Hello Unknown!
```

Dans l'exemple ci-dessous, la variable `name = "Java8"`

```java
Optional<String> nameJava8 = Optional.ofNullable( "Java8" );
System.out.println( "Name is present? " + nameJava8.isPresent() );
System.out.println( "Name value : " + nameJava8.orElseGet( () -> "[name not present]" ) );
System.out.println( nameJava8.map( s -> "Hello " + s ).orElse( "Hello World!" ) );
```

Cela donne comme résultat
```java
Name is present? true
Name value : Java8
Hello Java8
```

La méthode `isPresent()` retourne `true` si la veleur existe, `false` sinon.
La méthode `orElseGet()` permet de retourner une valeur par défaut en cas de valeur null. Elle permet de définir une lambda expression comme fonction de fallback en cas de valeur null.
La méthode `orElse()` retourne la valeur par défaut en cas de valeur null, sans fonction de fallback.

## Expressions Lambdas
Le changement le plus important dans Java 8.

```java
List<String> listString = Arrays.asList("A", "B", "C");

Collections.sort(listString, new Comparator<String>() {
    @Override
    public int compare(String a, String b) {
        return a.compareTo(b);
    }
});
```

Avec les lambda, cela devient plus simple

```java
Collections.sort(listString, (String a, String b) -> {
    return a.compareTo(b);
});
```

ou encore

```java
Collections.sort(listString, (String a, String b) -> a.compareTo(b));
```

encore plus

```java
listString.sort((a, b) -> a.compareTo(b));
```

et le résultat
```java
[A, B, C]
```

## Interfaces fonctionnelles
Annotation `@FunctionalInterface`
Une interface avec une seule méthode

## Méthodes d'interfaces

## Méthodes statiques 

## Méthodes par défaut
