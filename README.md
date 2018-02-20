## Introduction

Ce lab a pour but de présenter les nouveautés de Java 8.

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
