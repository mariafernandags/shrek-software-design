# Shrek Universe - Software Modeling Project🧙‍♂️

## Overview

This project was developed as part of the **"Software Design"** course at the Federal University of Itajubá (UNIFEI) during the second semester of 2024. The main objective was to model a fictional universe using Unified Modeling Language (UML) and implement the resulting model in Java.

For this project, I chose the **animated universe of Shrek**, a rich and imaginative world that allowed for the application of advanced object-oriented design principles and design patterns.

---

## Objectives

- Model a fictional universe (Shrek) using UML.
- Identify entities, relationships, and behaviors present in the universe.
- Apply object-oriented principles to model the system with class diagrams.
- Implement the system in Java, respecting the UML model.
- Apply at least two recognized software design patterns.

---

## UML Model Summary

The UML class diagram (included in this repository as `shrek.png`) captures the core elements of the Shrek universe. Some highlights of the model include:

### Entities

- **Being (Abstract Class):** Superclass for all main characters such as `Human`, `Ogre`, `Creature`, and their specific types like `Princess`, `Fairy`, `Wizard`, and `Witch`.
- **Flute and Melodies:** The `Flute` class can execute different melodies based on the `Melody` interface, represented by classes like `DanceMelody` and `Silence`.
- **Rumpelstiltskin:** Modeled as a Singleton to ensure a single instance with unique characteristics.
- **Contract, Curse, Potion, Kingdom, Castle:** Supporting classes that reflect magical, legal, and geographical aspects of the Shrek universe.

---

### Associations and Composition

- A `Kingdom` contains `Castles` and is located in a `Biome`.
- Characters can `sign` contracts or be involved in `Curses`.
- A `Flute` is composed of a melody (Strategy pattern via interface).
- `EnchantedObjects` are used by characters such as witches and wizards.
- The potion class has two specializations: `Transformation` and `Love`.

---

## Design Patterns

### 1. Singleton – **Rumpelstiltskin**

The class `Rumpelstiltskin` was implemented using the Singleton pattern. This ensures that only one instance of Rumpelstiltskin exists in the application, consistent with his unique personality and plot role.

- Private constructor  
- Static instance variable  
- Public `getInstance()` method  

---

### 2. State – **Flute Melodies (DanceMelody / Silence)**

The `State` pattern was applied to the `Flute` class, where different `Melody` states (`DanceMelody`, `Silence`) can be executed. This models the dynamic behavior of the flute depending on the current melody it holds.

- `Melody` is an interface with an `execute()` method.  
- Concrete states like `DanceMelody` and `Silence` implement the interface.  
- The `Flute` holds a reference to a `Melody`, allowing it to change behavior at runtime.  

---

## Implementation

The project was fully implemented in **Java**, following the modeled UML structure. Each class was created with its respective attributes and methods. The design was made to be scalable, allowing easy future extensions (e.g., adding new beings, potions, or melodies).

---

## Author

Developed by **Maria Fernanda Guimarães Soares**  
Federal University of Itajubá - UNIFEI  
Projeto de Software – 2nd Semester, 2024
