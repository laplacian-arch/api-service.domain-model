# **GraphqlType**
**namespace:** laplacian.arch.api.service.graphql

An entity describing a graphql_type.



---

## Properties

### name: `String`
The name of this graphql_type.
- **Attributes:** *PK*

### resolver_type: `String`
The resolver_type of this graphql_type.

### description: `String`
The description of this graphql_type.
- **Default Value:**
  ```kotlin
  "A Graphql type representing ${name}"
  ```

## Relationships

### relationships: `List<GraphqlTypeRelationship>`
The relationships of this graphql_type.
- **Cardinality:** `*`