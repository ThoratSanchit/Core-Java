# Dependency Injection & IoC in Spring Boot

## What is IoC (Inversion of Control)?
Instead of your class creating its own dependencies, Spring creates and injects them for you.
You give control of object creation to the Spring container — that's IoC.

## What is Dependency Injection (DI)?
DI is the mechanism Spring uses to implement IoC.
Spring injects the required objects (beans) into your class automatically.

## Types of Dependency Injection

### 1. Constructor Injection (Recommended)
```java
@Service
public class OrderService {
    private final PaymentService paymentService;

    // Spring injects PaymentService via constructor
    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
}
```
✅ Best practice — makes dependencies explicit and supports immutability.

### 2. Setter Injection
```java
@Service
public class OrderService {
    private PaymentService paymentService;

    @Autowired
    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
}
```

### 3. Field Injection (Not recommended)
```java
@Service
public class OrderService {
    @Autowired
    private PaymentService paymentService; // Spring injects directly into field
}
```
❌ Avoid — makes testing harder and hides dependencies.

## Key Annotations
| Annotation | Purpose |
|------------|---------|
| `@Autowired` | Tells Spring to inject a dependency |
| `@Component` | Generic Spring-managed bean |
| `@Service` | Service layer bean |
| `@Repository` | DAO/data layer bean |
| `@Bean` | Manually declare a bean in a `@Configuration` class |
| `@Qualifier("name")` | Specify which bean to inject when multiple exist |
| `@Primary` | Mark a bean as the default when multiple exist |

## Bean Scopes
| Scope | Meaning |
|-------|---------|
| `singleton` (default) | One instance per Spring container |
| `prototype` | New instance every time it's requested |
| `request` | One instance per HTTP request (web apps) |
| `session` | One instance per HTTP session (web apps) |

```java
@Component
@Scope("prototype")
public class MyBean { }
```
