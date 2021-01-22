# **GraphqlTypeRelationship**
**namespace:** laplacian.arch.api.service.graphql

An entity describing a graphql_type_relationship.



---

## Properties

### name: `String`
The name of this graphql_type_relationship.

### description: `String`
The description of this graphql_type_relationship.
- **Default Value:**
  ```kotlin
  "$name"
  ```

### type: `String`
The type of this graphql_type_relationship.

### referencing_graphql_type_name: `String`
The referencing_graphql_type_name of this graphql_type_relationship.

### multiple: `Boolean`
Defines this graphql_type_relationship is multiple or not.
- **Default Value:**
  ```kotlin
  true
  ```

### nullable: `Boolean`
Defines this graphql_type_relationship is nullable or not.
- **Default Value:**
  ```kotlin
  false
  ```

## Relationships

### referenced_graphql_type: `GraphqlType`
The referenced_graphql_type of this graphql_type_relationship.
- **Cardinality:** `1`

### referencing_graphql_type: `GraphqlType`
The referencing_graphql_type of this graphql_type_relationship.
- **Cardinality:** `1`