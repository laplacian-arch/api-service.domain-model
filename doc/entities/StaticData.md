# **StaticData**
**namespace:** laplacian.arch.api.service.graphql

An entity describing a static_data.



---

## Properties

### data_model_name: `String`
The data_model_name of this static_data.
- **Default Value:**
  ```kotlin
  name
  ```

### default_query_name: `String`
The default_query_name of this static_data.
- **Default Value:**
  ```kotlin
  "all"
  ```

## Relationships

### data_model: `Entity`
The data_model of this static_data.
- **Cardinality:** `1`

### queries: `List<Query>`
The queries of this static_data.
- **Cardinality:** `*`