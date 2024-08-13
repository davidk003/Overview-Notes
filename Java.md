# Java overview

## Java setup:
Install the JDK(java development kit), which comes with the JRE(java runtime environment) and JVM(java virtual machine).

JDK for devs, JRE for running, both contain JVM which interprets and executes.

Java compiles your code into bytecode, which then is interpreted by the JVM which runs your hardware specific machine instructions.

generally prefix your files as `*.java`

Use `javac {file name}.java` to compile and `java {file name}` to execute.

Java is THE language of the object

java contains the main

## Primitives
boolean , byte , char , short , int , long , float and double

## Loops
Block scoped code in java is specified with the `{}` brackets.
In python you see `:` on the previous line end with indenting instead, and javascript uses `{}` as well.

```java
int i = 0;
while (i < 100)
{
    System.out.println(i);
}
for(int i = 0; i < 100; ++i)
{
    System.out.println(i);
}
```

Three chunks to the for loop.

## Function declarations

## The object
The “new” keyword



Java strings are immutable, hence we have things like the stringbuilder
```java
public class StringImmutabilityDemo {
    public static void main(String[] args) {
        // Initial string
        String original = "Hello";
        System.out.println("Original String: " + original);

        // Attempt to modify the string by concatenation
        String modified = original.concat(", World!");
        System.out.println("Modified String: " + modified);

        // The original string remains unchanged
        System.out.println("Original String after modification attempt: " + original);

        // Directly assigning a new value to the original variable
        original = original.concat(", Java!");
        System.out.println("Original String after reassignment: " + original);
    }
}

```

Public, private and protected

## Comparisons in java
For primitives, use `==`, which is fine because they are value comparisons

Java objects are compared as references when using the `==` operator. Therefore, different objects that contain the same value will result in a false output. Therefore we use the `equals()` function to compare objects.
