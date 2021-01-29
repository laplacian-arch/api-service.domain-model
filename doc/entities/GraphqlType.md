# **GraphqlType**
**namespace:** laplacian.arch.api.service.graphql

An entity describing a graphql_type.



---

## Properties

### name: `String`
The name of this graphql_type.
- **Attributes:** *PK*

### description: `String`
The description of this graphql_type.
- **Default Value:**
  ```kotlin
  "A Graphql type representing ${name}"
  ```

### data_model_name: `String`
The data_model_name of this graphql_type.

### data_model_namespace: `String`
The data_model_namespace of this graphql_type.

## Relationships

### data_model: `Entity?`
The data_model of this graphql_type.
- **Cardinality:** `0..1`

### fields: `List<GraphqlField>`
The fields of this graphql_type.
- **Cardinality:** `*`