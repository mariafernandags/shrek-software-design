# Shrek Software Design Project

This project was developed as part of the **Software Design** course at the **Federal University of Itajubá (UNIFEI)**. It explores object-oriented design principles through the fictional universe of *Shrek*, using Java as the implementation language.

The objective was to model complex interactions between characters, kingdoms, magical elements, and events, while applying software design patterns to create a maintainable and extensible codebase.

## Applied Design Patterns

### Singleton Pattern – Rumpelstiltskin

The Singleton pattern was applied to the character **Rumpelstiltskin**, a magical being known for his manipulation and deal-making abilities. This pattern ensures that only one instance of Rumpelstiltskin exists throughout the application.

By using the Singleton, we guarantee that every interaction with Rumpelstiltskin refers to the same object instance. This is particularly useful for a character that centralizes and controls magical contracts, avoiding inconsistencies and unintended behavior due to multiple instances.

**Benefits of Singleton in this context:**
- Centralized control over all deals.
- Prevents duplicate representations of a unique magical entity.
- Ensures integrity and consistency of all magical contracts managed by Rumpelstiltskin.

### State Pattern – Magic Flute

The **State** design pattern was used in the implementation of the **Magic Flute**, a powerful object used to influence characters’ behavior. The flute can switch between different modes (states) such as:

- `SilenceState` – where the flute remains inactive.
- `DanceMelodyState` – where the flute emits a magical melody that forces characters (such as ogres) to dance involuntarily.

The use of the State pattern allows the behavior of the flute to change dynamically at runtime depending on its internal state, following the Open/Closed Principle. This abstraction simplifies the logic for managing behaviors and encapsulates them into separate classes.

**Benefits of State in this context:**
- Encapsulates state-specific logic into individual classes.
- Makes the behavior of the flute extensible without altering existing code.
- Allows for more readable and modular implementation of mode transitions.

## Project Overview

The system simulates the storyline of the first *Shrek* movie and extends it with additional narrative elements from sequels and side stories. Characters such as Shrek, Fiona, Donkey, and Rumpelstiltskin are represented as Java classes with appropriate relationships and attributes.

A UML diagram (`shrek.png`) is included in the repository, illustrating the structure of the classes and their interactions.

## Academic Context

This project was developed in 2024 as part of the **Software Design** course in the Computer Engineering program at the Federal University of Itajubá (UNIFEI). It emphasizes the practical application of design patterns in the modeling of complex systems and storytelling-based software design.

## Repository

The project source code and documentation are available at:  
[https://github.com/mariafernandags/shrek-software-design](https://github.com/mariafernandags/shrek-software-design)
