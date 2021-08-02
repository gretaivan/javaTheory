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
+  [Data Structures](https://github.com/gretaivan/javaTheory/blob/main/README.md#data-types)  - <em> unchecked structures are not implemented yet</em>

### Checklist for  JAVA SE11 Exam 1ZO-819


##### Working with Java data types

- [ ] primitives  
- [ ] wrapper classes 
  - [ ] String Builder
- [ ] operators 
- [ ] parentheses 
- [ ] type promotion and casting

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
 



