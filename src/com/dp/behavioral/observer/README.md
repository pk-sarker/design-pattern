# Observer Design Pattern

## Intent
The aim of the builder design pattern is to solve one to many relationship between objects. When one object changes state, all its dependent objects are notified and updated automatically.

## Motivation
A common side-effect of partitioning a system into a collection of cooperating classes is the need to maintain consistency between related objects. Its not a good idea to achieve consistency by making the classes tightly coupled, because that reduces their reusability. For example, many graphical user interface toolkits separate the presentational aspects of the user interface from the underlying application data. Classes defining application data and presentations can be reused
independently. They can work together, too. Both a spreadsheet object and bar chart object can depict information in the same application data object using different presentation s.T he spreadsheet and the bar chart don't know about each other, thereby letting you reuse only the one you need. But they behave as though they do. When the user changes the information in the spreadsheet, the bar chart reflects the changes immediately and vice versa.

## Applicability

## Participants 

## Consequences
