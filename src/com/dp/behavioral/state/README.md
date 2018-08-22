# State Design Pattern

## Intent
Allow an object to alter its behavior when its internal state changes. The object will appear to change its class.

## Motivation
In real world there are some entities or things that has multiple state or modes. Like, in SDSL bugs/issues are created in the testing phase. We may consider this as **Issue Raised** state. Then the state of the issue changes when that issue is assigned to someone, **Issue Assign**. Then the responsible person work on the issue, **Issue in Progress**, and fixed it and changes the state to done, **Issue Done**. As a part of done code must be checked-in to source version control system.
Then it moves to testing state, **Issue Testing**, where the testers writes test cases and execute them. If all are good then they change the state to close, **Issue Close**.

The same issue was in different state where the actions are based on the state, for example, in **Issue Assign** state the action is to assign the issue to a worker and in **Issue in Progress** state the action is the fix the issue by changing the code or something else. So the action behavior strictly tied with the state.  
  
## Applicability
Use the State pattern in either of the following cases:
* An object's behavior depends on its state, and it must change its behavior at
run-time depending on that state.
* Operations have large, multipart conditional statements that depend on the object's state. This state is usually represented by one or more enumerated constants. Often, several operations will contain this same conditional structure. The State pattern puts each branch of the conditional in a separate class.
This lets you treat the object's state as an object in its own right that can vary
independently from other objects.

## Participants 
1. Context
   - defines the interface of interest to clients.
   - maintains an instance of a Concrete State subclass that defines the current state
2. State
   - defines an interface for encapsulating the behavior associated with a particular
state of the Context.
3. ConcreteState subclasses 
   - each subclass implements behavior associated with a state of the Context.   
   	
## Collaborations
* Context delegates state-specific requests to the current ConcreteState object.
* A context may pass itself as an argument to the State object handling the request. This lets the State object access the context if necessary.
* Context is the primary interface f or clients. Clients can configure a context with
State objects. Once a context is configured, its clients don't have to deal with
the State objects directly
## Consequences
The State pattern has the following consequences:
1. It localizes state-specific behavior and partitions behavior for different states.
2. It makes state transitions explicit.
3. State objects can be shared

