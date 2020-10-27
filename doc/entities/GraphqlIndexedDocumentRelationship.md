# **GraphqlIndexedDocumentRelationship**
**namespace:** laplacian.arch.api.service.graphql

graphql_indexed_document_relationship



---

## Properties

### field_type_name: `String`
The field_type_name of this graphql_indexed_document_relationship.
- **Code:**
  ```kotlin
  "${referencingGraphqlTypeName.upperCamelize()}Document"
  ```

### resolver_name: `String`
The resolver_name of this graphql_indexed_document_relationship.
- **Code:**
  ```kotlin
  "${referencedGraphqlType.name.upperCamelize()}DocumentResolver"
  ```

## Relationships

### field_mappings: `List<GraphqlTypeRelationshipFieldMapping>`
field_mappings
- **Cardinality:** `1..*`