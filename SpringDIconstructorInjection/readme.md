# Constructor Injection in Spring

## What is a Constructor?
A constructor is a **special method in a class** that is automatically called when you create an object of that class.  
Its primary purpose is to initialize the object's state, ensuring it starts in a valid and usable condition.

### Key Features of Constructors:
1. **Same Name as the Class** - The constructor must have the same name as the class.  
2. **Automatic Call** - It is called automatically when an object is created.  
3. **No Return Type** - Constructors do not have a return type, not even `void`.  
4. **Not Inherited** - Constructors are not inherited by subclasses.  
5. **Access Modifiers** - Constructors can have access modifiers (`public`, `private`, `protected`).  

### Types of Constructors:
- **Default Constructor**  
- **Parameterized Constructor**  
- **Copy Constructor**

---

## Constructor Injection (CI)
Constructor Injection is used when we want to **initialize a bean object with some values at the time of creation**.  

- Once initialized through a constructor, the values **cannot be changed later** (unlike Setter Injection).  
- CI is preferred when the object is **immutable** or must always be created with specific data.  

---

## Example Classes

```java
class A {
    // variables
    A() {
        // default constructor
    }

    void m1() {}
    void m2() {}
}

class B {
    // variables
    A a = new A(); // Dependency Injection

    B() {
        // default constructor
    }

    void m1() {}
    void m2() {}
}
```

---

## Spring XML Configuration (Constructor Injection)
Using **constructor-arg** tag:

```xml
<bean id="address3" class="com.garvit.it.Address">
    <constructor-arg value="2094577"></constructor-arg>
    <constructor-arg value="Ujjain"></constructor-arg>
    <constructor-arg value="India"></constructor-arg>
</bean>
```

? Note:  
- Values are passed in **the same order as in the constructor**.  
- If you want to specify, you can use **`index`** attribute as well.  

---

## Example with Student Class

```java
public class Student {

    private int id;
    private String name;
    private Address address;
    private Map<String, Integer> marks = new HashMap<>();

    public Student() {
        System.out.println("Student object Created");
    }
}
```

Since `Student` requires an `Address` object, we can inject it using constructor injection.

```xml
<bean id="address2" class="com.garvit.it.Address">
    <constructor-arg value="2094577"></constructor-arg>
    <constructor-arg value="Ujjain"></constructor-arg>
    <constructor-arg value="India"></constructor-arg>
</bean>

<bean id="student3" class="com.garvit.it.Student">
    <constructor-arg value="10001"></constructor-arg>
    <constructor-arg value="Bheeshma"></constructor-arg>
    <constructor-arg ref="address2"></constructor-arg>

    <constructor-arg>
        <map>
            <entry key="Math" value="80"/>
            <entry key="English" value="85"/>
            <entry key="Physics" value="81"/>
        </map>
    </constructor-arg>
</bean>
```

---

## Summary
- Constructor Injection is used to set values at the time of object creation.  
- Once set, these values cannot be modified later.  
- Use `constructor-arg` in XML configuration for injecting values or references.  
