# **GraphqlTypeMapping**
**namespace:** laplacian.arch.api.service.graphql_type

graphql_type_mapping



---

## Properties

### from: `String`
The from of this graphql_type_mapping.
- **Attributes:** *PK*

### to: `String`
The to of this graphql_type_mapping.
- **Attributes:** *PK*

## Relationships

### part_of: `GraphqlTypeRelationship`
part_of
- **Cardinality:** `1`

### referencing_type: `GraphqlType`
referencing_type
- **Cardinality:** `1`
- **Code:**
  ```kotlin
  partOf.referencingType
  ```