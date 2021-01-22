# **Query**
**namespace:** laplacian.arch.api.service.graphql.static_data

An entity describing a query.



---

## Properties

### name: `String`
The name of this query.
- **Attributes:** *PK*

### description: `String`
The description of this query.
- **Default Value:**
  ```kotlin
  name
  ```

### result_model_name: `String`
The result_model_name of this query.
- **Default Value:**
  ```kotlin
  graphqlType.dataModel.name
  ```

### result_model_namespace: `String`
The result_model_namespace of this query.
- **Default Value:**
  ```kotlin
  graphqlType.dataModel.namespace
  ```

### snippet: `String`
The snippet of this query.

## Relationships

### graphql_type: `StaticData`
The graphql_type of this query.
- **Cardinality:** `1`

### result_model: `Entity`
The result_model of this query.
- **Cardinality:** `1`