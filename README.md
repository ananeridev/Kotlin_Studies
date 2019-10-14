# Kotlin_Studies 
# 	:hugs: What I'm coding

before you get a git clone, you need to understand some concepts about the Kotlin and the codes the I made


### Exeptions
--> All classes of exeption of Kotlin are descendants of a Thorwable class and each exeption has a message and its  **StrackTrace** of errors.
> Everyone has a parent class 

 `try {
	// code here
} catch (e: SomethingException) {
	// treatment of the code
} finally {
	// Executing something forever
 }`
 
## Collections

Collections are implementations of data structures with multiple functions and can be **mutable**.
See it come collections:

### Collections: Lists

They are implementations of data structure similar to Arrays, only with more functions and can also be **mutable**
> Belong to a hierarchy of classes

`val items = listOf("SP", "RJ", "SC")
val number = mutableListOf(1, 2, 3, 4)
*// here in the mutable have a array under the hood*
val mix = arrayListOf("SP", 1, 2, 3, 4)`
### Collections: Set

It does not **allow duplicate elements**  and does not retain the order, it creates a collection that uses a hash table for storage
`val strings = hashSetOf("a", "b", "c", "c")
Strings.add("z")`

### Collections: Map

Is a  **key-value-based** implementation and although it is not directly part of the collections hierarchy, it is considered a collection.

`val map = hashMapOf("Key1'" to 1, "Key2" to 2)`

### Enum
An enum is a data type consisting of a set of constants

`enum class Direction {
	NORTH, SOUTH, EAST, WEST
}`

Enjoy :P
