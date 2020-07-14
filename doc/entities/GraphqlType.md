# **GraphqlType**
**namespace:** laplacian.arch.api.service

graphql_type



---

## Properties

### name: `String`
The name of this graphql_type.
- **Default Value:**
  ```kotlin
  entityName
  ```

### entity_name: `String`
The entity_name of this graphql_type.

### description: `String`
The description of this graphql_type.
- **Default Value:**
  ```kotlin
  "A Graphql type represents ${name}"
  ```

## Relationships

### entity: `Entity?`
entity
- **Cardinality:** `0..1`