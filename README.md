# Java Design Patterns

Design patterns are reusable solutions to common software design problems. They represent best practices evolved over time by experienced software developers.

## Categories of Design Patterns

### 1. Creational Patterns
- **Singleton**: Ensures a class has only one instance and provides a global point of access to it.
- **Factory Method**: Creates objects without specifying the exact class to create.
- **Abstract Factory**: Creates families of related objects without specifying their concrete classes.
- **Builder**: Separates object construction from its representation.
- **Prototype**: Creates new objects by copying an existing object.

### 2. Structural Patterns
- **Adapter**: Allows incompatible interfaces to work together.
- **Bridge**: Separates an object's interface from its implementation.
- **Composite**: Composes objects into tree structures to represent part-whole hierarchies.
- **Decorator**: Adds responsibilities to objects dynamically.
- **Facade**: Provides a simplified interface to a complex subsystem.
- **Flyweight**: Uses sharing to support large numbers of fine-grained objects efficiently.
- **Proxy**: Provides a surrogate or placeholder for another object.

### 3. Behavioral Patterns
- **Chain of Responsibility**: Passes a request along a chain of handlers.
- **Command**: Encapsulates a request as an object.
- **Interpreter**: Implements a specialized language.
- **Iterator**: Accesses elements of a collection sequentially.
- **Mediator**: Defines simplified communication between classes.
- **Memento**: Captures and restores an object's internal state.
- **Observer**: Defines a one-to-many dependency between objects.
- **State**: Allows an object to alter its behavior when its internal state changes.
- **Strategy**: Defines a family of algorithms and makes them interchangeable.
- **Template Method**: Defines the skeleton of an algorithm, deferring some steps to subclasses.
- **Visitor**: Separates an algorithm from the object structure it operates on.

## Implementation Examples

Each pattern directory in this repository contains:
- Code examples in Java
- UML diagrams
- Use cases
- Advantages and disadvantages

## Getting Started

Clone this repository and explore each pattern's directory to understand its implementation:

```bash
git clone https://github.com/yourusername/java-design-patterns.git
cd java-design-patterns
```

## References

- "Design Patterns: Elements of Reusable Object-Oriented Software" by Gamma, Helm, Johnson, and Vlissides
- "Head First Design Patterns" by Freeman and Robson
- "Effective Java" by Joshua Bloch