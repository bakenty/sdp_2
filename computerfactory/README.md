## Clean Code Principles

### 1. Meaningful Names

We use clear names that show the purpose of each class and method.

Example:

```java
public class GamingComputerCreator extends ComputerCreator {
    public Computer createComputer() {
        return new GamingComputer();
    }
}
```

The names `GamingComputerCreator`, `createComputer()`, and `GamingComputer` clearly describe what they do.

### 2. Small Methods

Each method performs one simple task instead of doing several different things.

Example:

```java
public void startComputer() {
    Computer computer = createComputer();
    computer.start();
}
```

This method only creates a computer and starts it.

### 3. Single Responsibility

Each class has one main responsibility.

Example:

```java
public class IntelFactory implements ComputerFactory {
    public CPU createCPU() {
        return new IntelCPU();
    }

    public GPU createGPU() {
        return new NvidiaGPU();
    }
}
```

`IntelFactory` is responsible only for creating the Intel computer component family.

### 4. No Magic Numbers or Strings

The code does not contain unexplained numbers or strings that control the program's logic.

Example:

```java
public void send(String message) {
    System.out.println(message);
}
```

The message is passed as a parameter instead of being hidden inside the method.

### 5. Consistent Formatting

All classes use the same formatting, naming style, indentation, and method structure.

Example:

```java
public class AmdFactory implements ComputerFactory {

    public CPU createCPU() {
        return new AmdCPU();
    }

    public GPU createGPU() {
        return new AmdGPU();
    }
}
```

This makes the code easier to read and maintain.
