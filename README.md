## Introduction

Ce lab a pour but de présenter les nouveautés de Java 8.

## Expressions Lambdas
Le changement le plus important dans Java 8.

```java
List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

Collections.sort(names, new Comparator<String>() {
    @Override
    public int compare(String a, String b) {
        return b.compareTo(a);
    }
});
```

Avec les lambda, cela devient plus simple

```java
Collections.sort(names, (String a, String b) -> {
    return b.compareTo(a);
});
```

ou encore

```java
Collections.sort(names, (String a, String b) -> b.compareTo(a));
```

encore plus

```java
names.sort((a, b) -> b.compareTo(a));
```

## Interfaces fonctionnelles
Annotation `@FunctionalInterface`
Une interface avec une seule méthode

## Méthodes d'interfaces

## Méthodes statiques 

## Méthodes par défaut
