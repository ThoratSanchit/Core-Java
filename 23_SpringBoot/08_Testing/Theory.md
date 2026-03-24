# Spring Boot Testing

## Testing Layers
Spring Boot supports testing at different layers — unit, slice, and integration.

| Test Type | Annotation | What it tests |
|-----------|------------|---------------|
| Unit Test | `@ExtendWith(MockitoExtension.class)` | Single class in isolation (no Spring context) |
| Slice Test | `@WebMvcTest` | Controller layer only (mocks service) |
| Slice Test | `@DataJpaTest` | Repository layer only (in-memory H2 DB) |
| Integration Test | `@SpringBootTest` | Full application context |

## Key Testing Annotations
| Annotation | Purpose |
|------------|---------|
| `@Test` | Marks a test method |
| `@BeforeEach` | Runs before each test |
| `@AfterEach` | Runs after each test |
| `@Mock` | Creates a mock object (Mockito) |
| `@InjectMocks` | Injects mocks into the class under test |
| `@MockBean` | Creates a mock Spring bean (replaces real bean in context) |
| `@Autowired` | Injects real Spring beans in integration tests |

## Mockito — Key Methods
```java
// Define behavior
when(service.findById(1L)).thenReturn(Optional.of(user));
when(service.save(any())).thenThrow(new RuntimeException("DB error"));

// Verify interactions
verify(repository, times(1)).save(user);
verify(repository, never()).deleteById(anyLong());

// Argument matchers
any(), anyLong(), anyString(), eq("specific value")
```

## MockMvc — Testing Controllers
```java
mockMvc.perform(get("/api/users/1"))
       .andExpect(status().isOk())
       .andExpect(jsonPath("$.name").value("Alice"));

mockMvc.perform(post("/api/users")
       .contentType(MediaType.APPLICATION_JSON)
       .content("{\"name\":\"Alice\",\"email\":\"alice@example.com\"}"))
       .andExpect(status().isCreated());
```

## Assertions (JUnit 5)
```java
assertEquals(expected, actual);
assertNotNull(result);
assertTrue(condition);
assertThrows(ResourceNotFoundException.class, () -> service.getById(999L));
```
