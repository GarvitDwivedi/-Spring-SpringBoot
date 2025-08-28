# Dependency Injection (DI)

**Dependency Injection (DI)** is a technique to provide the dependencies of a class (its required objects) from an external source instead of creating them inside the class itself.  

It helps in interconnecting two classes and makes code more modular, testable, and maintainable.

---

## Example

```java
class A {                    
    void method1() { }
    void method2() { }
}

class B {       
    A a = new A(); // Dependency Injection              
    void method3() { }
    void method4() { }
}
```

---

## Types of Dependency Injection

1. Constructor Injection  
2. Setter Injection  
3. Field Injection  

---

## Ways to Achieve Dependency Injection

1. Using XML Configuration  
2. Using Annotations  

---

## XML Configuration

In XML-based Dependency Injection, we can achieve:
- Setter Injection  
- Constructor Injection  

---

### Setter Injection

Here, we use the setter methods of a class to inject dependencies.  

We define beans inside an XML configuration file (for example, `SpringBeanDi.xml`):

```xml
<!-- Student Bean Configuration -->
<bean id="student1" class="com.garvit.it.Student">
    <property name="sid" value="10001"></property>
    <property name="name" value="Garvit"></property>
    <property name="address" ref="address1"></property>
</bean>

<!-- Address Bean Configuration -->
<bean id="address1" class="com.garvit.it.Address">
    <property name="city" value="Kanpur"></property>
    <property name="pinCode" value="209715"></property>
</bean>
```

- The `<property>` tag is used to provide values to the properties (fields) of a class.  
- The `ref` attribute is used to create a reference between two classes, so that the dependent class can be injected into the main class.  

---

### Collections in Dependency Injection

If we want to inject a **List, Set, or Map**, Spring provides special tags.

#### Example: List
```xml
<property name="cities">
    <list>
        <value>Kanpur</value>
        <value>Delhi</value>
        <value>Mumbai</value>
    </list>
</property>
```

#### Example: Map
```xml
<property name="details">
    <map>
        <entry key="PinCode" value="209715"/>
        <entry key="State" value="UP"/>
    </map>
</property>
```

---

## Summary

- Dependency Injection allows interconnecting classes without hardcoding their dependencies.  
- XML-based Dependency Injection supports:  
  - Setter Injection  
  - Constructor Injection  
- Annotation-based Dependency Injection (for example, `@Autowired`, `@Component`) is the modern way, but XML configuration is still useful for learning the basics.  
