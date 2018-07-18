# Prototype Design Pattern

## Intent
Specify the kinds of objects to create using a prototypical instance, and create new
objects by copying this prototype.

## Motivation

## Applicability
Use the Prototype pattern when a system should be independent of how its
products are created, composed, and represented; and
* when the classes to instantiate are specified at run-time, for example, by
dynamic loading; or
* to avoid building a class hierarchy of factories that parallels the class hierarchy
of products; or
* when instances of a class can have one of only a few different combinations of state. It may be more convenient to install a corresponding number of prototypes and clone them rather than instantiating the class manually, each time with the appropriate state.

## Participants 
* **Prototype** - declares an interface for cloning itself.
* **ConcretePrototype** - implements an operation for cloning itself.
* **Client** - creates a new object by asking a prototype to clone itself.

## Consequences
Prototype has many of the same consequences that Abstract Factory and Builder have: It hides the concrete product classes from the client, thereby reducing the number of names clients know about. Moreover, these patterns let a client work with application-specific classes without modification.
Other benefits of the Prototype pattern are listed below.

* *Adding and removing products at run-time*. Prototypes let you incorporate a new concrete product class into a system simply by registering a prototypical instance with the client.

* *Specifying new objects by varying values*. Highly dynamic systems let you define
new behavior through object composition—by specifying values for an object's variables, for example—and not by defining new classes. You effectively define new kinds of objects by instantiating existing classes and registering the instances as prototypes of client objects. A client can exhibit new behavior by delegating responsibility to the prototype.

* *Specifying new objects by varying structure*. Many applications build objects
from parts and sub parts. 
 
* *Reduced subclassing*. Facto ryMethod (1 07)often produces a hierarchy of Creator classes that parallels the product class hierarchy. The Prototype pattern lets you clone a prototype instead of asking a factory method to make a new object. Hence you don't need a Creator class hierarchy at all.
* *Configuring an application with classes dynamically.*
