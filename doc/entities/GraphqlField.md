# **GraphqlField**
**namespace:** laplacian.arch.api.service.graphql

An entity describing a graphql_field.



---

## Properties

### name: `String`
The name of this graphql_field.
- **Attributes:** *PK*

### field_type: `String`
The field_type of this graphql_field.

### multiple: `Boolean`
Defines this graphql_field is multiple or not.
- **Default Value:**
  ```kotlin
  false
  ```

### optional: `Boolean`
Defines this graphql_field is optional or not.
- **Default Value:**
  ```kotlin
  false
  ```

### root_query_field: `Boolean`
Specifies whether this field is located on the root query object.

- **Default Value:**
  ```kotlin
  false
  ```

### root_mutation_field: `Boolean`
Specifies whether this field is located on the root modification object.

- **Default Value:**
  ```kotlin
  false
  ```

### root_subscription_field: `Boolean`
Specifies whether this field is located on the root subscription object.

- **Default Value:**
  ```kotlin
  false
  ```

## Relationships

### graphql_type: `GraphqlType`
The graphql_type of this graphql_field.
- **Cardinality:** `1`

### fetcher: `GraphqlFieldFetcher?`
The fetcher of this graphql_field.
- **Cardinality:** `0..1`