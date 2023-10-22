
# Some fundamentals

## Class
In Java, a class is a fundamental construct that represents a blueprint or prototype for creating objects. An object is an instance of a class, and classes are used to define the properties (attributes) and behaviors (methods) that objects created from that class will have.

Here's a basic example of a Java class:

```java
public class Person {
    // Attributes
    String name;
    int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method
    public void greet() {
        System.out.println("Hello, I'm " + name + "!");
    }

    // Getter method
    public int getAge() {
        return age;
    }

    // Setter method
    public void setAge(int newAge) {
        this.age = newAge;
    }
}
```

In this example:

- `Person` is the name of the class.
- `name` and `age` are attributes of the class, representing the properties of objects created from the class.
- The constructor method (`public Person(...)`) is used to initialize objects of type `Person` when they are created.
- The `greet()` method is an example of a behavior of the class. When called, it prints a greeting message.
- The `getAge()` and `setAge()` methods are examples of getter and setter methods, allowing you to get and set the value of the `age` attribute.

You can create an instance of this class in your main program:

```java
public class Main {
    public static void main(String[] args) {
        // Creating a Person object
        Person person1 = new Person("Alice", 30);

        // Calling a method of the class
        person1.greet();

        // Calling a getter method
        int ageOfAlice = person1.getAge();
        System.out.println("Age of Alice: " + ageOfAlice);

        // Calling a setter method
        person1.setAge(31);
        System.out.println("New age of Alice: " + person1.getAge());
    }
}
```

Classes are fundamental to object-oriented programming in Java and provide an organized way to structure code and group related data and behaviors.



## Classes:
In Java, classes and objects are fundamental concepts in object-oriented programming (OOP). Let's explore them:

A class is a blueprint or template for creating objects. It defines the structure and behavior that its objects will have. Here's a simple example of a Java class:

```java
public class Car {
    // Attributes
    String brand;
    String model;
    int year;

    // Constructor
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Method
    public void startEngine() {
        System.out.println("The engine of the " + brand + " " + model + " is started.");
    }
}
```

In this example:

- `Car` is the name of the class.
- `brand`, `model`, and `year` are attributes of the class, representing the properties of car objects.
- The constructor (`public Car(...)`) initializes objects of type `Car` when they are created.
- The `startEngine()` method is a behavior of the class. When called, it prints a message indicating that the engine is started.

## Objects:

An object is an instance of a class. It represents a specific entity based on the structure and behavior defined in the class. Here's an example of creating and using objects of the `Car` class:

```java
public class Main {
    public static void main(String[] args) {
        // Creating objects of the Car class
        Car myCar = new Car("Toyota", "Camry", 2022);
        Car anotherCar = new Car("Honda", "Accord", 2021);

        // Accessing attributes
        System.out.println("My car is a " + myCar.year + " " + myCar.brand + " " + myCar.model);

        // Calling a method
        myCar.startEngine();
        anotherCar.startEngine();
    }
}
```

In this example:

- `myCar` and `anotherCar` are objects of the `Car` class.
- The attributes (`brand`, `model`, `year`) are accessed using dot notation (`myCar.year`).
- The `startEngine()` method is called on each car object.

Classes and objects provide a way to model and organize code in a modular and reusable manner, following the principles of encapsulation and abstraction in OOP.

## Primitive Data Types:

1. **Integers:**
   - `byte`: 8 bits, from -128 to 127
   - `short`: 16 bits, from -32,768 to 32,767
   - `int`: 32 bits, from -2^31 to 2^31-1
   - `long`: 64 bits, from -2^63 to 2^63-1

   ```java
   int age = 25;
   long population = 7000000000L; // note the 'L' at the end for long
   ```

2. **Floating-Point Numbers:**
   - `float`: 32 bits
   - `double`: 64 bits

   ```java
   float pi = 3.14f; // note the 'f' at the end for float
   double price = 19.99;
   ```

3. **Characters:**
   - `char`: 16 bits, represents a single Unicode character

   ```java
   char grade = 'A';
   ```

4. **Booleans:**
   - `boolean`: represents `true` or `false`

   ```java
   boolean isJavaFun = true;
   ```

### Reference Data Types:

1. **Strings:**
   - `String`: represents a sequence of characters

   ```java
   String greeting = "Hello, World!";
   ```

2. **Arrays:**
   - Represents a collection of elements of the same type

   ```java
   int[] numbers = {1, 2, 3, 4, 5};
   ```


### Arithmetic Operators:

1. **Addition:**
   ```java
   int sum = a + b;
   ```

2. **Subtraction:**
   ```java
   int difference = a - b;
   ```

3. **Multiplication:**
   ```java
   int product = a * b;
   ```

4. **Division:**
   ```java
   int quotient = a / b;
   ```

5. **Modulus (Remainder):**
   ```java
   int remainder = a % b;
   ```

### Relational Operators:

6. **Equal to:**
   ```java
   boolean isEqual = (a == b);
   ```

7. **Not equal to:**
   ```java
   boolean isNotEqual = (a != b);
   ```

8. **Greater than:**
   ```java
   boolean isGreater = (a > b);
   ```

9. **Less than:**
   ```java
   boolean isLess = (a < b);
   ```

10. **Greater than or equal to:**
    ```java
    boolean isGreaterOrEqual = (a >= b);
    ```

11. **Less than or equal to:**
    ```java
    boolean isLessOrEqual = (a <= b);
    ```

### Logical Operators:

12. **Logical AND:**
    ```java
    boolean result = (condition1 && condition2);
    ```

13. **Logical OR:**
    ```java
    boolean result = (condition1 || condition2);
    ```

14. **Logical NOT:**
    ```java
    boolean result = !(condition);
    ```

### Assignment Operators:

15. **Assignment:**
    ```java
    int x = 10;
    ```

16. **Add and Assign:**
    ```java
    a += b; // equivalent to a = a + b;
    ```

17. **Subtract and Assign:**
    ```java
    a -= b; // equivalent to a = a - b;
    ```

18. **Multiply and Assign:**
    ```java
    a *= b; // equivalent to a = a * b;
    ```

19. **Divide and Assign:**
    ```java
    a /= b; // equivalent to a = a / b;
    ```

20. **Modulus and Assign:**
    ```java
    a %= b; // equivalent to a = a % b;
    ```

## Main
The `main` method is a special method that serves as the entry point for a Java application. When you run a Java program, the Java Virtual Machine (JVM) looks for the `main` method in the class specified as the starting point for the application. The `main` method has a specific signature, and it's where the execution of your program begins.

Here's the basic structure of the `main` method:

```java
public class MyClass {
    public static void main(String[] args) {
        // Your code here
    }
}
```

- `public`: The `main` method is declared as `public` to make it accessible from outside the class.

- `static`: The `main` method is declared as `static`, which means it belongs to the class rather than an instance of the class. This is necessary because the JVM calls the `main` method without creating an instance of the class.

- `void`: The `main` method returns `void`, meaning it doesn't return any value.

- `main`: This is the name of the method.

- `String[] args`: The `main` method takes an array of strings as a parameter. This parameter allows you to pass command-line arguments to your Java program.

Here's a simple example:

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

In this example:

- `System.out.println("Hello, World!");` is the code inside the `main` method. It prints "Hello, World!" to the console.

When you run this program, the JVM starts executing from the `main` method, and the output "Hello, World!" is displayed on the console.

You can include your program's logic, create objects, call methods, and perform various tasks within the `main` method. It acts as the starting point for the flow of execution in your Java application.

## MVC
 Certainly! The Model-View-Controller (MVC) architectural pattern is commonly used in Java applications to separate concerns and organize code in a modular way. Here's a simple example of a Java program divided into MVC components.

### Model (Model.java):

```java
public class Model {
    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
```

### View (View.java):

```java
public class View {
    public void printData(String data) {
        System.out.println("Data from Model: " + data);
    }
}
```

### Controller (Controller.java):

```java
public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processData(String newData) {
        model.setData(newData);
        String data = model.getData();
        view.printData(data);
    }
}
```

### Main Program (Main.java):

```java
public class Main {
    public static void main(String[] args) {
        // Create instances of Model, View, and Controller
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        // Simulate user input
        String userInput = "Hello, MVC!";

        // Process data through the Controller
        controller.processData(userInput);
    }
}
```

In this example:

- **Model**: Manages the data and provides methods to get and set the data.

- **View**: Displays the data. In this case, it prints the data to the console.

- **Controller**: Acts as an intermediary between the Model and View. It receives user input (simulated by `userInput` in the `Main` class), updates the Model, and updates the View accordingly.

- **Main Program**: Creates instances of the Model, View, and Controller, and simulates the flow of user input through the Controller.

This simple example demonstrates the separation of concerns in an MVC architecture, where each component has a distinct role. The Model represents the data, the View displays the data, and the Controller manages the flow of data between the Model and View.

## Encapsulation
Encapsulation is one of the four fundamental principles of Object-Oriented Programming (OOP), and it refers to the bundling of data (attributes) and methods (functions) that operate on the data into a single unit known as a class. The idea is to hide the internal details of the object and restrict access to some of its components, allowing a controlled and organized interaction with the object.

Here's how encapsulation is typically achieved in Java:

### 1. Private Access Modifier:

Attributes of a class are often declared as private to restrict direct access from outside the class. This means that these attributes can only be accessed and modified within the class itself.

```java
public class MyClass {
    private int myPrivateAttribute;

    public void setMyPrivateAttribute(int value) {
        // Validation logic can be added here
        myPrivateAttribute = value;
    }

    public int getMyPrivateAttribute() {
        return myPrivateAttribute;
    }
}
```

In this example, `myPrivateAttribute` is a private attribute, and its value can only be modified or accessed through the public methods `setMyPrivateAttribute` and `getMyPrivateAttribute`.

### 2. Accessor and Mutator Methods:

Accessor methods (getters) are used to retrieve the values of private attributes, and mutator methods (setters) are used to modify them. This allows for controlled access to the internal state of the object.

```java
public class Student {
    private String name;

    // Getter method
    public String getName() {
        return name;
    }

    // Setter method
    public void setName(String newName) {
        // Validation logic can be added here
        name = newName;
    }
}
```

In this example, `getName` is an accessor method that allows external code to retrieve the value of the private attribute `name`. `setName` is a mutator method that allows external code to modify the value of `name`, with the possibility of adding validation logic.

### Benefits of Encapsulation:

1. **Data Hiding:** The internal details of the object are hidden from external code, reducing the risk of unintended interference.

2. **Controlled Access:** Access to the object's data is controlled through public methods, allowing for validation, security, and flexibility.

3. **Flexibility in Implementation:** The internal implementation details of the object can be changed without affecting external code, as long as the public interface remains the same.

Encapsulation is a key principle in building robust and maintainable software systems by promoting modular design and reducing dependencies between different parts of the codebase.


## Inheritance

Inheritance is another fundamental concept in Object-Oriented Programming (OOP) that allows a class (subclass or derived class) to inherit the properties and behaviors of another class (superclass or base class). This promotes code reuse and the creation of a hierarchy of classes.

Let's look at a simple example of inheritance in Java:

### Superclass (Parent Class):

```java
public class Animal {
    // Attribute
    private String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Method
    public void eat() {
        System.out.println(name + " is eating.");
    }
}
```

In this example, `Animal` is the superclass, and it has an attribute `name` and a method `eat`.

### Subclass (Child Class):

```java
public class Dog extends Animal {
    // Additional attribute
    private String breed;

    // Constructor
    public Dog(String name, String breed) {
        super(name); // Call the constructor of the superclass
        this.breed = breed;
    }

    // Additional method
    public void bark() {
        System.out.println(name + " is barking.");
    }
}
```

In this example, `Dog` is the subclass of `Animal`. It inherits the attribute `name` and the method `eat` from the superclass. Additionally, it has its own attribute `breed` and a method `bark`.

### Main Program:

```java
public class Main {
    public static void main(String[] args) {
        // Create an instance of the subclass
        Dog myDog = new Dog("Buddy", "Golden Retriever");

        // Access inherited method from the superclass
        myDog.eat();

        // Access methods and attributes from the subclass
        myDog.bark();
    }
}
```

In this example, `myDog` is an instance of the `Dog` class. It can access both the inherited method `eat` from the superclass and its own method `bark`.

### Key Points:

- The `extends` keyword is used to indicate that one class is inheriting from another.
- The `super` keyword is used to call the constructor or methods of the superclass from the subclass.
- Inheritance allows for code reuse and the creation of a class hierarchy.

Keep in mind that Java supports single inheritance, meaning a class can only inherit from one superclass. However, it supports multiple interfaces, allowing a class to implement multiple interfaces.

## Polymorphism

Polymorphism is another important concept in Object-Oriented Programming (OOP) and refers to the ability of different classes to be treated as instances of the same class through a common interface. There are two types of polymorphism in Java: compile-time polymorphism (method overloading) and runtime polymorphism (method overriding).

### Compile-time Polymorphism (Method Overloading):

Method overloading occurs when a class has multiple methods with the same name but different parameter lists. The compiler determines which method to call based on the number or types of parameters.

```java
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public String add(String a, String b) {
        return a + b;
    }
}
```

In this example, the `add` method is overloaded with different parameter types. The appropriate method is chosen at compile time based on the arguments passed.

### Runtime Polymorphism (Method Overriding):

Method overriding occurs when a subclass provides a specific implementation for a method that is already defined in its superclass. It allows a subclass to provide a specialized version of a method that is already defined in its superclass.

#### Superclass:

```java
public class Animal {
    public void makeSound() {
        System.out.println("Some generic sound");
    }
}
```

#### Subclass:

```java
public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark! Bark!");
    }
}
```

In this example, the `Dog` class overrides the `makeSound` method from the `Animal` class.

#### Main Program:

```java
public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Dog();
        myAnimal.makeSound(); // Calls the overridden method in Dog
    }
}
```

In the main program, an instance of `Dog` is treated as an instance of `Animal` (upcasting). When calling `makeSound`, the overridden method in `Dog` is executed.

### Key Points:

- Polymorphism allows for more flexibility and extensibility in code.
- Compile-time polymorphism is achieved through method overloading.
- Runtime polymorphism is achieved through method overriding.
- Upcasting allows an object to be treated as an instance of its superclass.

Polymorphism contributes to code reuse, making it easier to extend and maintain object-oriented systems.

## Abstraction

Abstraction is a crucial concept in Object-Oriented Programming (OOP) that involves simplifying complex systems by modeling classes based on essential properties and behaviors, while hiding unnecessary details. Abstraction is often achieved through abstract classes and interfaces in Java.

### Abstract Class:

An abstract class is a class that cannot be instantiated and may contain abstract methods. Abstract methods are declared without providing an implementation in the abstract class. Subclasses must provide concrete implementations for these abstract methods.

```java
// Abstract class
public abstract class Shape {
    // Abstract method
    public abstract double calculateArea();

    // Concrete method
    public void display() {
        System.out.println("This is a shape.");
    }
}
```

In this example, `Shape` is an abstract class with an abstract method `calculateArea` and a concrete method `display`.

### Concrete Subclass:

```java
// Concrete subclass
public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementation of the abstract method
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
```

In the `Circle` class, which is a concrete subclass of `Shape`, the abstract method `calculateArea` is implemented.

### Interface:

An interface is a collection of abstract methods. A class implements an interface, providing concrete implementations for all the methods declared in the interface.

```java
// Interface
public interface Soundable {
    void makeSound();
}
```

### Class Implementing Interface:

```java
// Class implementing the interface
public class Dog implements Soundable {
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}
```

Here, the `Dog` class implements the `Soundable` interface, providing a concrete implementation for the `makeSound` method.

### Key Points:

- Abstraction allows you to model the essential aspects of an object while hiding unnecessary details.
- Abstract classes and interfaces are key tools for achieving abstraction in Java.
- Abstract classes can have abstract methods (with no implementation) and concrete methods (with an implementation).
- Interfaces declare methods without providing any implementation, and classes implement these methods.

Abstraction helps in creating a clear and efficient design, making it easier to manage and extend complex software systems.