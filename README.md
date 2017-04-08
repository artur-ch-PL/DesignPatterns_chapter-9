# DesignPatterns_chapter-09

Iterator
==================================================================================================
Provide a way to access the elements of an aggregate object sequentially without exposing its underlying representation

Composite
==================================================================================================
Compose objects into tree structures to represent part-whole hierarchies. Composite lets clients treat individual objects and compositions of objects uniformly.


Design principle
==================================================================================================
A class should have only one reason to change

In short
==================================================================================================
* An Iterator allows access to an aggregate's elements without exposing its internal structure
* An Iterator takes the job of iterating over an  aggregate and encapsulates in another object
* When using an Iterator, we relieve the aggregate of the responsibility of supporting operations for traversing its data
* An Iterator provides a common interface for traversing the items of an aggregate, allowing you to use polymorphism when writing code that makes use of the items of the aggregate
* We should strive to assign only one responsibility to each class
* The composite pattern provides a structure to hold both individual objects and composites
* The Composite Pattern allows client to treat composites and individual objects uniformly
* A Component is any object in a Composite structure. Components may be other composites or leaf nodes.
* There are many design tradeoffs in implementing Composite. You need to balance transparency and safety with your needs
