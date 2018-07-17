# Builder Design Pattern

## Intent
The aim of the builder design pattern is to separate the construction of a complex object from its representation. If the construction process is separate then the representation then the same construction process can be used for different representation.

## Applicability
Use the Builder pattern when:
* the algorithm for creating a complex object should be independent of the
parts that make up the object and how they're assembled.
* the construction process must allow different representations for the object
that's constructed

## Participants 
* **Builder**: specifies an abstract interface for creating parts of a Product object.
* **ConcreteBuilder**: constructs and assembles parts of the product by implementing the Builder
interface. Defines and keeps track of the representation it creates. Provides an interface for retrieving the product.
* **Director**: constructs an object using the Builder interface.
* **Product**: represents the complex object under construction. ConcreteBuilder builds
the product's internal representation and defines the process by which it's
assembled. Includes classes that define the constituent parts, including interfaces for
assembling the parts into the final result.
may also define a default implementation of the factory method that
returns a default Concrete class object of that interface type.
* may call the factory method to create a object of the given interface type.

## Collaborations
* The client creates the Director object and configures it with the desired Builder
object.
* Director notifies the builder whenever a part o f the product should be built.
* Builder handles requests from the director and adds parts to the product.
* The client retrieves the product from the builder.

## Consequences
* *It lets you vary a product's internal representation*. The Builder object provides
the director with an abstract interface for constructing the product. The interface
lets the builder hide the representation and internal structure of the product. It also hides how the product gets assembled. Because the product is constructed through an abstract interface, all you have to do to change the product's internal representation is define a new kind of builder.
* *It isolates code for construction and representation*. The Builder pattern improves
modularity by encapsulating the way a complex object is constructed and represented. Clients needn't know anything about the classes that define the product's internal structure; such classes don't appear in Builder's interface.
* *It gives you finer control over the construction process*. Unlike creational patterns
that construct products in one shot, the Builder pattern constructs the product step by step under the director's control. Only when the product is finished does the director retrieve it from the builder. Hence the Builder interface reflects the process of constructing the product more than other creational patterns.

