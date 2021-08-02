# Java Theory
general notes of interest and experimentation with general knowledge 

## Contents 
> topics that are in JAVA SE11 Exam are in italics

+ Java Exceptions 
+ Arrays 
+ Lists
+ Abstract and Interface class setup 
+ Objects
+ Threading basics
+ Threading with concurrency
+ Regex
+ Graphical User Interface frames and panels basics
+ File object
+ String - string are immutable. Thus, everytime any change is made it creates a new String instance. 
+ <em>String Builder</em> - note it is not a string, it is a buffer, once the desired content is achieved, it requires extraction to be a string
+ Type casting - explicit casting is converting to the lower value primitive variable, which results in the data loss, so is not automatic. Implicit is when conversion is from lower data type to higher and there is no data loss. 
+ Variable amount of arguments - vaargs or ellipse in the methods
+  [Data Structures](https://github.com/gretaivan/javaTheory/blob/main/README.md#data-types)  - <em> unchecked structures are not implemented yet</em>


## Checklist for  JAVA SE11 Exam 1ZO-819


##### Working with Java data types

- [x] primitives  
- [ ] wrapper classes 
  - [x] String n String Builder
- [ ] operators, parentheses 
- [ ] type promotion and casting
- [ ] use local variable type inference, including as lambda parameters

##### Controlling Program Flow
- [x] Create and use loops, if/else, and switch statements

##### Java Object-Oriented Approach
- [ ] Declare and instantiate Java objects including nested class objects, and explain objects' lifecycles (including creation, dereferencing by reassignment, and garbage collection)
- [x] Define and use fields and methods, including instance, static and overloaded methods
- [x] Initialize objects and their members using instance and static initialiser statements and constructors
- [ ] Understand variable scopes, apply encapsulation and make objects immutable
- [ ] create and use subclasses and superclasses, including abstract classes
- [ ] Utilize polymorphism and casting to call methods, differentiate object type versus reference type
- [ ] Create and use interfaces, identify functional interfaces, and utilize private, static, and default methods
- [ ] Create and use enumerations

##### Exception Handling
- [ ] Handle exceptions using try/catch/finally clauses, try-with-resource, and multi-catch statements
- [ ] Create and use custom exceptions

##### Working with Arrays and Collections
- [ ] Use generics, including wildcards
- [ ] Use a Java array and List, Set, Map and Deque collections, including convenience methods
- [ ] Sort collections and arrays using Comparator and Comparable interfaces

##### Working with Streams and Lambda expressions
- [ ] Implement functional interfaces using lambda expressions, including interfaces from the java.util.function package
- [ ] Use Java Streams to filter, transform and process data
- [ ] Perform decomposition and reduction, including grouping and partitioning on sequential and parallel streams

##### Java Platform Module System
- [ ] Deploy and execute modular applications, including automatic modules
- [ ] Declare, use, and expose modules, including the use of services

##### Concurrency
- [ ] Create worker threads using Runnable and Callable, and manage concurrency using an ExecutorService and java.util.concurrent API
- [ ] Develop thread-safe code, using different locking mechanisms and java.util.concurrent API

##### Java I/O API
- [ ] Read and write console and file data using I/O Streams
- [ ] Implement serialization and deserialization techniques on Java objects
- [ ] Handle file system objects using java.nio.file API

##### Secure Coding in Java SE Application
- [ ] Develop code that mitigates security threats such as denial of service, code injection, input validation and ensure data integrity
- [ ] Secure resource access including filesystems, manage policies and execute privileged code

##### Database Applications with JDBC
- [ ] Connect to and perform database SQL operations, process query results using JDBC API

##### Localization

- [ ] Implement Localization using Locale, resource bundles, and Java APIs to parse and format messages, dates, and numbers

##### Annotations
- [ ] Create, apply, and process annotations

<hr>

## <a src="#1">Data Structures</a>
### Linear data structures
- [ ] Linked List - [see implementation](https://github.com/gretaivan/javaTheory/blob/main/src/linkedListJavaCustom/Node.java)
> covers methods: add, add at the head, remove, traverse, find
- [ ] Doubly Linked List
- [ ] Queues
- [ ] Stacks

<hr>

#### For additional examples see game that was moved out to the separate repository as required dependencies to be setup, for that maven had to be used,  see [Monster Game repo](https://github.com/gretaivan/MonsterGameJava/blob/main/README.md), and [Calculator Engine](https://github.com/gretaivan/CalculatorEngine_Java/edit/main/README.md)




## TODO
- [ ]  Sort algorithms
- [ ]  Search algorithms
- [ ]  Dictionary - stores key value pairs. One data type is used for keys and another one for values. Every key is associated at most one value. Dictionaries are parent classes to: 
  - [ ] Hashtable - similar to HashMap as stores key-value pairs in a hashable, but unlike HashMap it does not allow ```null```  neither in key or value. And each key is hashed to get a hash code.
  - [ ] HashMap
  - [ ] LinkedHashMap
  - [ ] TreeMap
<hr>

#### Style Guides 

| [Twitter Style guide](https://github.com/twitter-archive/commons/blob/master/src/java/com/twitter/common/styleguide.md) | [Google Style guide](https://google.github.io/styleguide/javaguide.html) |
|  :----:  |  :----:  |
 



