# Auto Wiring Modes in Spring

In **Spring Framework**, Autowiring is a feature that allows the Spring container to automatically resolve dependencies between beans without explicitly specifying them in `applicationContext.xml` or Java config.

---

## Types of Autowiring

1. **default** (`autowire="no"`)
2. **byName**
3. **byType**
4. **constructor**
5. **autodetect** (deprecated)

---

## 1. No (Default)

-> No autowiring, you must explicitly wire beans using `<property>` or constructor arguments.

```xml
<bean id="employee" class="com.example.Employee">
    <property name="address" ref="address"/>
</bean>

<bean id="address" class="com.example.Address"/>
```

Here, you must manually set the `address` property.

---

## 2. By Name

-> Spring looks for a bean with the **same name as the property** and injects it.

```xml
<bean id="employee" class="com.example.Employee" autowire="byName"/>

<bean id="address" class="com.example.Address"/>
```

If `Employee` has a setter `setAddress(Address address)`, then Spring matches property name `address` with the bean `id="address"` and injects it automatically.

---

## 3. By Type

-> Spring matches a bean by its **class type**.

```xml
<bean id="employee" class="com.example.Employee" autowire="byType"/>

<bean id="addressBean" class="com.example.Address"/>
```

If `Employee` has a property of type `Address`, then Spring finds the `Address` bean (`addressBean`) and injects it.  
[Warning] Fails if multiple beans of same type exist.

---

## 4. Constructor

-> Spring tries to match dependencies by the **constructor argument type**.

```xml
<bean id="employee" class="com.example.Employee" autowire="constructor"/>

<bean id="address" class="com.example.Address"/>
```

If `Employee` has a constructor:

```java
public Employee(Address address) {
    this.address = address;
}
```

Spring automatically injects the `address` bean.

---

## Supporting Classes

```java
// Address.java
public class Address {
    private String city;
    private String state;

    public Address() {}

    public Address(String city, String state) {
        this.city = city;
        this.state = state;
    }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public String getState() { return state; }
    public void setState(String state) { this.state = state; }

    @Override
    public String toString() {
        return city + ", " + state;
    }
}
```

```java
// Employee.java
public class Employee {
    private String name;
    private Address address;

    public Employee() {}

    public Employee(Address address) {   // For constructor autowiring
        this.address = address;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Address getAddress() { return address; }
    public void setAddress(Address address) { this.address = address; }

    @Override
    public String toString() {
        return name + " lives in " + address;
    }
}
```

---

## Autowiring with Data Injection

### 1. Autowire = no (manual injection)

```xml
<bean id="employee" class="com.example.Employee">
    <property name="name" value="Garvit"/>
    <property name="address" ref="address"/>
</bean>

<bean id="address" class="com.example.Address">
    <property name="city" value="Delhi"/>
    <property name="state" value="India"/>
</bean>
```

**Output:**  
`Garvit lives in Delhi, India`

---

### 2. Autowire = byName

```xml
<bean id="employee" class="com.example.Employee" autowire="byName">
    <property name="name" value="Garvit"/>
</bean>

<!-- Bean id matches property name 'address' -->
<bean id="address" class="com.example.Address">
    <property name="city" value="Lucknow"/>
    <property name="state" value="UP"/>
</bean>
```

**Output:**  
`Garvit lives in Lucknow, UP`

---

### 3. Autowire = byType

```xml
<bean id="employee" class="com.example.Employee" autowire="byType">
    <property name="name" value="Garvit"/>
</bean>

<!-- Bean type = Address -->
<bean id="addrBean" class="com.example.Address">
    <property name="city" value="Mumbai"/>
    <property name="state" value="Maharashtra"/>
</bean>
```

**Output:**  
`Garvit lives in Mumbai, Maharashtra`

---

### 4. Autowire = constructor

```xml
<bean id="employee" class="com.example.Employee" autowire="constructor">
    <property name="name" value="Garvit"/>
</bean>

<bean id="address" class="com.example.Address">
    <property name="city" value="Bengaluru"/>
    <property name="state" value="Karnataka"/>
</bean>
```

**Output:**  
`Garvit lives in Bengaluru, Karnataka`

---


