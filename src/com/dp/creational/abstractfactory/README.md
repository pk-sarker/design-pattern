# Abstract Factory Design Pattern

## Intent
Abstract factory pattern provides an interface to create families of related or dependent objects without specifying their concrete classes. Abstract factory pattern enhances factory design pattern.

## Motivation
Consider like a common service provider application, where request has been made for some services with some information about expected response. For example, Application A provides two services, Employee performance evaluation service and employee current salary. Then application can provide the *json* and *text* response for employee performance evaluation service. For employee current salary service the application can provide response in *json*, *html*, *xlxs*, *csv* format.


## Applicability
Use the Abstract Factory pattern when
* a system should be independent of how its products are created, composed,
and represented.
* a system should be configured with one of multiple families of products.
* a family of related product objects is designed to be used together, and you
need to enforce this constraint.
* you want to provide a class library of products, and you want to reveal just
their interfaces, not their implementations.


## Participants 
* **AbstractFactory** - declares an interface for operations that create abstract product objects.
* **ConcreteFactory** - implements the operations to create concrete product objects.
* **AbstractProduct** - declares an interface for a type of product object.
* **ConcreteProduct** - defines a product object to be created by the corresponding concrete factory. - implements the AbstractProduct interface.
* **Client** - uses only interfaces declared by AbstractFactory and AbstractProduct
classes.

## Consequences
* *It isolates concrete classes*. The Abstract Factory pattern helps you control the
classes of objects that an application creates. Because a factory encapsulates
the responsibility and the process of creating product objects, it isolates clients
from implementation classes.
* *It makes exchanging product families easy*. The class of a concrete factory appears
only once in an application—that is, where it's instantiated. This makes it
easy to change the concrete factory an application uses. It can use different
product configurations simply by changing the concrete factory. Because an
abstract factory creates a complete family of products, the whole product
family changes at once.
* *It promotes consistency among products*. When product objects in a family are
designed to work together, it's important that an application use objects from
only one family at a time. AbstractFactory makes this easy to enforce
* *Supporting new kinds of products is difficult*. Extending abstract factories to
produce new kinds of Products isn't easy.That's because theAbstractFactory
interface fixes the set of products that c an be created.