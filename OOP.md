# Object Oriented Programming
* Inheritance, Encapsulation and Polymorphism

The abstract idea of how objects are defined in programming languages, how they should interact, their relationships to one another, their accessibility, and adaptability.

Prerequisite Vocabulary:
parameters, arguments, definition, initialization, instantiation, function/method, function/method signature, datafield/field/member

Idea of an object

An object can inherit other objects, and their characteristics. 


# The constructor
Should intitialize the object, all constructors implicitly "create"/allocate memory for the object upon calling the constructor

### Function signatures

Multiple inheritance (or not)
Overriding
Self referential and super keywords(this, self)
interfaces, virtual functions, abstract classses

## Templates/Generics
javascript doesnt have templates/generics, typescript does however.

python does have some semblance, but again its not a typed langauge

In java, generics are a placeholder type that we can initialize a datatype/class with and we can work with an abstract assumption of what that data is.

We usually use a single letter like `T` or `K` to represent this unknown object type.

```java
// Node class
class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}

// LinkedList class
class LinkedList<T> {
    private Node<T> head;

    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
    }

    public void display() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("None");
    }
}

// Usage
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.display();  // Output: 3 -> 2 -> 1 -> None
    }
}
```
# Getters and setters
Any given public datafield should have setters and getters.


ADTs, and abstractness

Different features of OOP in python(kinda), javascript(also kinda), and Java.

```python
# Base class
class Animal:
    def __init__(self, name):
        self.name = name

    def speak(self):
        return f"{self.name} makes a sound."

# Derived class
class Dog(Animal):
    def speak(self):
        return f"{self.name} barks."

# Usage
dog = Dog("Buddy")
print(dog.speak())  # Output: Buddy barks.
```

```Java
// Base class
class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public String speak() {
        return name + " makes a sound.";
    }
}

// Derived class
class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return name + " barks.";
    }
}

// Usage
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        System.out.println(dog.speak());  // Output: Buddy barks.
    }
}

```

```javascript
// Base class
class Animal {
    constructor(name) {
        this.name = name;
    }

    speak() {
        return `${this.name} makes a sound.`;
    }
}

// Derived class
class Dog extends Animal {
    speak() {
        return `${this.name} barks.`;
    }
}

// Usage
const dog = new Dog("Buddy");
console.log(dog.speak());  // Output: Buddy barks.


```
