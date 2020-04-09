# **GraphqlQuery**
**namespace:** laplacian.arch.service.api

graphql_query



---

## Properties

### name: `String`
The name of this graphql_query.

### identifier: `String`
The identifier of this graphql_query.
- **Default Value:**
  ```kotlin
  name.lowerUnderscorize()
  ```

### description: `String`
The description of this graphql_query.
- **Default Value:**
  ```kotlin
  "$name query."
  ```

### query: `String`
The query of this graphql_query.

### multiple: `Boolean`
Defines this graphql_query is multiple or not.
- **Default Value:**
  ```kotlin
  false
  ```

### record_entity_name: `String`
The record_entity_name of this graphql_query.

### record_type: `String`
The record_type of this graphql_query.
- **Default Value:**
  ```kotlin
  recordEntity?.className ?: throw IllegalStateException(
      "It is needed to define record_type or record_entity_name."
  )
  ```

### return_type: `String`
The return_type of this graphql_query.
- **Default Value:**
  ```kotlin
  recordType + if (multiple) "[]" else ""
  ```

## Relationships

### service: `Service`
service
- **Cardinality:** `1`

### record_entity: `Entity?`
record_entity
- **Cardinality:** `0..1`