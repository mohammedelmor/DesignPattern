# Design Patterns
Following Head First Design Patterns, 2nd Edition

## Design Principles

- Encapsulates what varies
- Favor Composition over Inheritance (Has-A is better than Is-A)
- Program to interfaces (really means a supertype, abstract for example), not implementations
- Strive for loosely coupled designs between objects that interact

## Design Patterns

- Strategy Pattern
> Defines a family of algorithms encapsulates each one and makes them interchangeable, Strategy lets the algorithm vary independently from the clients that use it

- Observer Pattern
> Defines a one-to-many dependency between objects so that when one object changes state, all its dependants are modified and updated automatically
> Consists of **one** `(Subject/Observable)` and **many** `Observers`

