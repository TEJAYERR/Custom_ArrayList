````markdown
# CustomArrayList

A simple **generic dynamic array** implementation in Java, similar to Java's `ArrayList<T>`.

---

## Features

- Generic support (`<T>`) for any object type.
- Dynamic resizing when capacity is full.
- Basic operations:
  - `add(T element)` → add element at the end.
  - `get(int index)` → retrieve element at a specific index.
  - `set(T element, int index)` → update element at a specific index.
  - `remove()` → remove and return the last element.
  - `size()` → get the number of elements.
- Throws `ArrayIndexOutOfBoundsException` for invalid indexes.
- Custom `toString()` prints only the active elements.

---

## Getting Started

### Clone the repository
git clone https://github.com/TEJAYERR/Custom_ArrayList.git
cd CustomArrayList
````

### Setup and Usage

1. Create a folder named `Generics` in your project.
2. Copy `CustomArrayList.java` into the `Generics` folder.
3. Compile the file:

```
javac Generics/CustomArrayList.java
```

* This will generate the `.class` file in the same folder.

4. Now you can **import and use** `CustomArrayList` in any other folder or class:

```
import Generics.CustomArrayList;

public class Main {
    public static void main(String[] args) {
        CustomArrayList<Integer> list = new CustomArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list); // [10, 20, 30]

        list.set(25, 1);
        System.out.println(list); // [10, 25, 30]

        int removed = list.remove();
        System.out.println(removed); // 30
        System.out.println(list);    // [10, 25]

        int val = list.get(0);
        System.out.println(val);     // 10
    }
}
```

---

## Notes

* Internally uses an `Object[]` array because Java does not allow creating generic arrays (`T[]`) directly.
* Type safety is maintained using generics and casting with `@SuppressWarnings("unchecked")`.
* Make sure your project is using **Java 8 or higher**.

---

## Author

**Teja**
