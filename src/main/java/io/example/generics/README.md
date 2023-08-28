### Why Generics?

Generic enables us to use types as parameter when defining classes, interfaces and methods.
This provides a way to re-use the same code with different inputs.

#### Pros

* Type-Safety checks at compile time.
* This enables us to avoid unnecessary type-cast coding and unexpected runtime errors.
* This facilitates the way to write generic algorithms.

#### Type-Cast elimination example

```java
class Example {
    public static void main() {
        List list = new ArrayList();
        list.add("Example String");
        String value = (String) list.get(0);
    }
}
```

When we re-write using generics, the code does not require type-casting.

```java
class Example {
    public static void main() {
        List<String> list = new ArrayList<>();
        list.add("Example String");
        String value = list.get(0);
    }
}
```