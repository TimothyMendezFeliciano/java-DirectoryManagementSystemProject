# Directory Management System Project

**Author:** Timothy Mendez Feliciano  
**Class:** Arizona State University CSE 598 Advanced Software Analysis and Design  
**Repo URL:** [java-DirectoryManagementSystemProject](https://github.com/TimothyMendezFeliciano/java-DirectoryManagementSystemProject)  

## Purpose
Learners will evaluate a system with object-oriented design and coupling violations. Learners will gain hands-on experience with improving the software system’s quality and modifiability by refactoring the system to remove object-oriented design and coupling issues without changing the system's intended functionality. An excellent opportunity to gain further exposure to the topics discussed in the course (including object-oriented application design, modularity, coupling, and cohesion), Learners completing this project will also get to develop UML class diagrams that represent the design and implement the object-oriented design in Java.

## Objectives
Learners will be able to:
- Evaluate an object-oriented design in the form of a class diagram.
- Identify object-oriented design violations.
- Use proper UML design tools to develop class diagrams.
- Refactor a given code to eliminate object-oriented design violations, including coupling, cohesion, and object design principles.
- Implement Java code based on a UML class diagram.

## Phase 1

### Part 1
Use the Astah tool to draw a class diagram for the current implementation of the management system. Use proper UML notations while drawing your class diagram. Take a clear screenshot of your completed diagram and include this in your copy of the learner submission template in the space provided for Phase I Part 1.

### Part 2
Identify the places in the code where there are object-oriented concept violations, content coupling, common coupling, control coupling, and stamp coupling situations. Include (copy/paste or take screenshots) the code segments that correspond to each situation on your copy of the learner submission template in the space provided for Phase I Part 2. You may add pages if necessary. Explain how you would fix the object-oriented concept violations, common coupling, control coupling, and content coupling issues. Provide your answers together with the relevant code segments that you identified.

### Part 3
Refactor the code to remove the object-oriented concept violations, common coupling, control coupling, and content coupling issues without removing any intended system functionalities. You will submit your refactored code as a ZIP file.

## Phase 2

### Part 1
In the current implementation of the directory, two (2) types of Personnel objects have been developed: Person and Employee. Suppose that the directory will be extended with a few other types, including Executives, Security, and Volunteers. In order to accommodate future extensions to multiple personnel categories, incorporate the factory pattern so that after calling the createPersonnel method of the PersonnelFactory, the Personnel Directory calls the PersonnelFactory to return the appropriate personnel type. Design the PersonnelFactory class to satisfy these requirements.

### Part 2
After you have incorporated the PersonnelFactory, draw the UML class diagram of the Personnel Directory using Astah. Use proper UML notation. Take a clear screenshot of your completed diagram and include this in your copy of the learner submission template in the space provided for Phase II Part 2.

### Part 3
Use Java to implement the new PersonnelDirectory system that complies with your class diagram. You will save and submit your files as a ZIP file.

