# Factory Design Pattern

## Intent
Define an interface for creating an object, but let subclasses decide which class to
instantiate. Factory Method lets a class defer instantiation to subclasses.

## Motivation
Frameworks use abstract classes to define and maintain relationships between
objects. A framework is often responsible for creating these objects as well.

Consider a framework for applications that can present multiple documents to
the user. Two key abstractions in this framework are the classes Application and
Document. Both classes are abstract, and clients have to subclass them to realize
their application-specific implementations.


## Applicability
Situations when Factory Method pattern is best to use:
* a class can't anticipate the class of objects it must create.
* a class wants its subclasses to specify the objects it creates.
* classes delegate responsibility to one of several helper subclasses, and you
want to localize the knowledge of which helper subclass is the delegate.

## Participants 
* Defines the interface of objects the factory method creates.
* Implements the interface.
* declares the factory method, which returns an object of type of the interface.Creator
may also define a default implementation of the factory method that
returns a default Concrete class object of that interface type.
* may call the factory method to create a object of the given interface type.

## Consequences
