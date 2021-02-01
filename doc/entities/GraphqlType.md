# **GraphqlType**
**namespace:** laplacian.arch.api.service.graphql

An entity describing a graphql_type.



---

## Properties

### name: `String`
The name of this graphql_type.
- **Attributes:** *PK*

### group: `String`
The group of this graphql_type.
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

### query_fields: `List<GraphqlField>`
The query_fields of this graphql_type.
- **Cardinality:** `*`
- **Code:**
  ```kotlin
  fields.filter{ it.operationType == "query" }
  ```

### root_query_fields: `List<GraphqlField>`
The root_query_fields of this graphql_type.
- **Cardinality:** `*`
- **Code:**
  ```kotlin
  queryFields.filter{ it.rootField }
  ```

### mutation_fields: `List<GraphqlField>`
The mutation_fields of this graphql_type.
- **Cardinality:** `*`
- **Code:**
  ```kotlin
  fields.filter{ it.operationType == "mutation" }
  ```

### root_mutation_fields: `List<GraphqlField>`
The root_mutation_fields of this graphql_type.
- **Cardinality:** `*`
- **Code:**
  ```kotlin
  mutationFields.filter{ it.rootField }
  ```

### subscription_fields: `List<GraphqlField>`
The subscription_fields of this graphql_type.
- **Cardinality:** `*`
- **Code:**
  ```kotlin
  fields.filter{ it.operationType == "subscription" }
  ```

### root_subscription_fields: `List<GraphqlField>`
The root_subscription_fields of this graphql_type.
- **Cardinality:** `*`
- **Code:**
  ```kotlin
  subscriptionFields.filter{ it.rootField }
  ```