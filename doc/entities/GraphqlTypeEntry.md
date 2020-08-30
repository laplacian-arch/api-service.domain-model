# **GraphqlTypeEntry**
**namespace:** laplacian.arch.api.service

graphql_type_entry



---

## Properties

### type_name: `String`
The type_name of this graphql_type_entry.

### datasource_name: `String`
The datasource_name of this graphql_type_entry.
- **Default Value:**
  ```kotlin
  "default"
  ```

## Relationships

### service: `Service`
service
- **Cardinality:** `1`

### datasource: `Datasource`
datasource
- **Cardinality:** `1`
- **Code:**
  ```kotlin
  service.datasources.find{ it.name == datasourceName } ?: throw IllegalStateException(
    "Unknown datasource name: ${datasourceName}"
  )
  ```

### graphql_type: `GraphqlType`
graphql_type
- **Cardinality:** `1`