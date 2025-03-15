## The Singleton Pattern

The Singleton Pattern is a creational design pattern that ensures a class has only one instance while providing a global access point to this instance. It's useful when exactly one object is needed across the entire system.


## The inner workings
- **Private Constructor: Prevents** direct instantiation outside the class
- **Private static instance**: Holds the single instance of the class
- **Public Access Method** : Provides global access to this instance

In short, the pattern ensures that:-
- Only one instance exists
- The instance is globally accessible
- The instance is created _only_ when first needed
