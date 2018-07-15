# Singleton Design Pattern

## Intent
The aim of Singleton design pattern is to ensure that a class only has one instance, and provide a global point of access to it.

## Motivation
Sometime its is necessary to have one instance of some classes. For example, family members in a nuclear family are different individuals, different in most of the way but all of them may live in same address.

How do we ensure that a class has only one instance and that the instance is easily
accessible? A global variable makes an object accessible, but it doesn't keep you
from instantiating multiple objects.

A better solution is to make the class itself responsible for keeping track of its sole
instance.The class c an ensure that no other instance can be created ( by intercepting
requests to create new objects), and it can provide a way to access the instance.
This is the Singleton pattern.

## Applicability
Situations when Singleton pattern is best to use:
* there must be exactly one instance of a class, and it must be accessible to
clients or other classes from a well-known access point.
* when the sole instance should be extensible by subclassing, and clients
should be able to use an extended instance without modifying their code.

## Participants 
* defines an Instance operation that lets clients or other classes access its unique instance.
* may be responsible for creating its own unique instance.

## Consequences

* *Controlled access to sole instance*. Because the Singleton class encapsulates its
sole instance, it can have strict control over how and when clients access it.
* *Reduced name space.* The Singleton pattern is an improvement over global
variables. It avoids polluting the name space with global variables that store
sole instances.
* *Permits refinement of operations and representation*.