# Java Notes — Quick Revision

## File & Class Naming
- Class name should match file name
- `class ABC` → file can be `anything.java`
- `public class ABC` → file **must** be `ABC.java`
- `class ABC` without modifier = Default access

---

## Access Modifiers

| Modifier | Same Package | Subclass | Everywhere |
|---|---|---|---|
| `public` | ✅ | ✅ | ✅ |
| `protected` | ✅ | ✅ | ❌ |
| default | ✅ | ❌ | ❌ |
| `private` | ❌ | ❌ | ❌ |

---

## Constructor
- Same name as class, returns nothing
- Called once at object creation
- JVM provides default constructor always
- Creates object in **Heap Memory**
- Child class creation → runs `Parent constructor → Child constructor`

```java
Student obj = new Student();  // default constructor called
```

---

## OOP Features
- **Platform Independent** → bytecode runs on any OS
- **Multi-Threaded** → run multiple threads concurrently
- **Portable** → carry bytecode to any platform
- **Encapsulation** → wrapping data under a single unit
- **Polymorphism** → Overriding (Runtime) + Overloading (Compile time)
- **Inheritance** → child inherits methods of parent

---

## Static Methods
- Access via `ClassName.methodName()`
- No object creation needed
- Cannot access non-static variables inside static methods

---

## Relationships
- **Aggregation** → HAS-A relationship
- **Composition** → IS-A-PART-OF relationship (both dependent)
- **Interface** → IS-A relationship

---

## Compile & Run
```bash
javac FileName.java    # compiles → creates .class file
java  ClassName        # runs the class with main()
```

---

## Keywords
- `super()` → calls **parent class** constructor
- `this()` → calls **same class** constructor
- `final` → variable / method / class cannot be changed / overridden / extended
- `volatile` → variable read from main memory, not thread cache

---

## String Memory
```java
String s1 = "Hello";           // stored in String Pool (Heap)
String s2 = new String("Hello"); // new object in Heap
String s3 = s2.intern();        // saves to String Pool
```

- String Pool is part of Heap memory
- `new String()` always creates a new object
- `.intern()` saves it to the pool

---

## Main Method
- Can be overloaded, overridden, and recursed

---

## Collections
- `Vector` → thread-safe but lower performance than `ArrayList`

---

## References
- [Static Keyword](https://www.geeksforgeeks.org/static-keyword-java/)
- [Final Keyword](https://www.javatpoint.com/final-keyword)
- [String Pool](https://www.javatpoint.com/string-pool-in-java)
- [StringBuffer vs StringBuilder](https://www.javatpoint.com/difference-between-stringbuffer-and-stringbuilder)
- [Lambda Expressions](https://www.geeksforgeeks.org/lambda-expressions-java-8/)
- [Multiple Inheritance](https://www.geeksforgeeks.org/java-and-multiple-inheritance/)
- [Type Conversion](https://www.geeksforgeeks.org/type-conversion-java-examples/)
