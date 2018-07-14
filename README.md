# Design Patters
According to __Christopher Alexander__, Each pattern describes a problem which occurs over and over again in our environment, and then describes the core of the solution to that problem, in such away that you can use this solution a million times over, without ever doing it the same way twice.

Each design pattern has four essential elements

* **Pattern Name**: The *pattern name* is a handle we can use to describe a design problem, its solutions, and consequences in a word or two.
* **Problem**: The *problem* describes when to apply the pattern. It explains the problem and its
context.
* **Solution**: The *solution* describes the elements that make up the design, their relationships, responsibilities, and collaborations.
* **Consequences**: The *consequences* are the results and trade-offs of applying the patter n

A design pattern names, abstracts, and identifies the key aspects of a common design structure that make it useful for creating a reusable object-oriented design. The design pattern identifies the participating classes and instances, their roles and collaborations, and the distribution of responsibilities. Each design pattern focuses on a particular object-oriented design problem or issue. It describes when it applies, whether it can be applied in view of other design constraints, and the consequences and trade-offs of its use.

# Key elements to describe a design pattern
* **Pattern Name and Classification**: The pattern's name conveys the essence of the pattern succinctly.
* **Intent**: A short statement that answers the following questions: *What does the design pattern do?* *What is its rationale and intent?*, *What particular design issue or problem does it address?*
* **Motivation**: A scenario that illustrates a design problem and how the class and object structures in the pattern solve the problem. The scenario will help you understand the more abstract description of the pattern that follows.
* **Applicability**: What are the situations in which the design pattern can be applied? What are
examples of poor designs that the pattern can address? How can you recognize these situations?
* **Structure**: A graphical representation of the classes in the pattern using a notation based
on the Object Modeling Technique.
* **Participants**: The classes and/or objects participating in the design pattern and their responsibilities.
* **Collaborations**: How the participants collaborate to carry out their responsibilities.
* **Consequences**: *How does the pattern support its objectives?* *What are the trade-offs and results
of using the pattern?* *What aspect of system structure does it let you vary independently?*
* **Implementation**: *What pitfalls*, *hints*, or *techniques* should you be aware of when implementing
the pattern? *Are there language-specific issues?*
* **Known Uses**: Examples of the pattern found in real systems. We include at least two examples
from different domains.

# Design Patterns
* [Creational](#creational)
* [Behavioral](#behavioral)
* [Structural](#structural)

## Creational
Creational design patterns abstract the instantiation process. They help make a system
independent of how its objects are created, composed, and represented. A class creational pattern uses inheritance to vary the class that's instantiated, whereas an object creational pattern will delegate instantiation to another object. 

Creational patterns become important as systems evolve to depend more on object composition than class inheritance. As that happens, emphasis shifts away from hard coding a fixed set of behaviors toward defining a smaller set of fundamental behaviors that can be composed into any number of more complex ones. Thus creating objects with particular behaviors requires more than simply instantiating a class.

There are two recurring themes in these patterns. First, they all encapsulate knowledge about which concrete classes the system uses. Second, they hide how instances of these classes are created and put together. All the system at large knows about the objects is their interfaces as defined by abstract classes. Consequently, the creational patterns give you a lot of flexibility in *what gets created*, *who creates it*, *how it gets created*, and *when*.

## Behavioral
Content is in progress

## Structural
Content is in progress

#### Reference
* **Design Patterns**, *Elements of Reusable Object-Oriented Software* by *Erich Gamma*, *Richard Helm*, *Ralph Johnson*, *John Vlissides*.
* **Head First Design Patterns** by *Elisabeth Freeman* and *Kathy Sierra*.