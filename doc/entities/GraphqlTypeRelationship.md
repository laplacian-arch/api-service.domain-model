# **GraphqlTypeRelationship**
**namespace:** laplacian.arch.api.service.graphql_type

graphql_type_relationship



---

## Properties

### name: `String`
The name of this graphql_type_relationship.
- **Attributes:** *PK*

### referencing_type_name: `String`
The referencing_type_name of this graphql_type_relationship.

## Relationships

### referencedType: `GraphqlType`
referencedType
- **Cardinality:** `1`

### referencing_type: `GraphqlType`
referencing_type
- **Cardinality:** `1`

### mappings: `List<GraphqlTypeMapping>`
mappings
- **Cardinality:** `1..*`