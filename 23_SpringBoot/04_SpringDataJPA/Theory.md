# Spring Data JPA

## What is JPA?
JPA (Java Persistence API) is a specification for ORM (Object-Relational Mapping).
It lets you map Java classes to database tables and perform DB operations without writing SQL.

## What is Spring Data JPA?
Spring Data JPA is Spring's abstraction on top of JPA (using Hibernate as the default provider).
It auto-generates common queries — you just define an interface.

## Key Annotations
| Annotation | Purpose |
|------------|---------|
| `@Entity` | Marks class as a DB table |
| `@Table(name="...")` | Customize table name |
| `@Id` | Marks the primary key field |
| `@GeneratedValue` | Auto-generate primary key values |
| `@Column(name="...")` | Customize column name/constraints |
| `@OneToMany` | One entity has many related entities |
| `@ManyToOne` | Many entities belong to one |
| `@ManyToMany` | Many-to-many relationship |
| `@JoinColumn` | Specify the foreign key column |

## Repository Hierarchy
```
Repository (marker interface)
    └── CrudRepository<T, ID>       ← basic CRUD
         └── PagingAndSortingRepository  ← + pagination/sorting
              └── JpaRepository<T, ID>   ← + JPA-specific methods (flush, batch)
```
Always extend `JpaRepository` — it gives you everything.

## Auto-Generated Methods (JpaRepository)
```java
save(entity)           // INSERT or UPDATE
findById(id)           // SELECT by primary key → Optional<T>
findAll()              // SELECT all
deleteById(id)         // DELETE by primary key
existsById(id)         // check if exists
count()                // total rows
```

## Query Methods (Derived Queries)
Spring generates SQL from method names automatically:
```java
findByName(String name)
findByAgeGreaterThan(int age)
findByNameAndCity(String name, String city)
findByNameContaining(String keyword)
findByEmailIgnoreCase(String email)
findByAgeOrderByNameAsc(int age)
```

## Custom Queries with @Query
```java
@Query("SELECT u FROM User u WHERE u.email = :email")
Optional<User> findByEmail(@Param("email") String email);

// Native SQL query
@Query(value = "SELECT * FROM users WHERE city = :city", nativeQuery = true)
List<User> findByCity(@Param("city") String city);
```

## application.properties for JPA
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/mydb
spring.datasource.username=root
spring.datasource.password=secret
spring.jpa.hibernate.ddl-auto=update   # create / create-drop / validate / update
spring.jpa.show-sql=true               # print SQL in console
spring.jpa.properties.hibernate.format_sql=true
```

## ddl-auto Options
| Value | Behavior |
|-------|----------|
| `create` | Drop and recreate tables on startup |
| `create-drop` | Create on startup, drop on shutdown |
| `update` | Update schema without dropping data |
| `validate` | Validate schema, throw error if mismatch |
| `none` | Do nothing (use in production) |
