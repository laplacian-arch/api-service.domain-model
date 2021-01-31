# **GraphqlTypeReference**
**namespace:** laplacian.arch.api.service.graphql

An entity describing a graphql_type_reference.



---

## Properties

### graphql_type_name: `String`
The graphql_type_name of this graphql_type_reference.

### graphql_type_group: `String`
The graphql_type_group of this graphql_type_reference.
- **Default Value:**
  ```kotlin
  graphqlType.group
  ```

## Relationships

### referencing_graphql_type: `GraphqlType`
The referencing_graphql_type of this graphql_type_reference.
- **Cardinality:** `1`