# **RestOperation**
**namespace:** laplacian.arch.api.service.rest

An entity describing a rest_operation.



---

## Properties

### method: `String`
The method of this rest_operation.

### path: `String`
The path of this rest_operation.

### name: `String`
The name of this rest_operation.
- **Attributes:** *PK*

### description: `String`
The description of this rest_operation.
- **Default Value:**
  ```kotlin
  "${method} ${path}"
  ```

### response_model_name: `String`
The response_model_name of this rest_operation.
- **Default Value:**
  ```kotlin
  restResource.resourceModelName!!
  ```

### cache_policy_name: `String`
The cache_policy_name of this rest_operation.

## Relationships

### arguments: `List<ApiCallArgument>`
The arguments of this rest_operation.
- **Cardinality:** `*`

### path_parameters: `List<RestRequestParameter>`
The path_parameters of this rest_operation.
- **Cardinality:** `*`

### query_parameters: `List<RestRequestParameter>`
The query_parameters of this rest_operation.
- **Cardinality:** `*`

### http_headers: `List<RestRequestParameter>`
The http_headers of this rest_operation.
- **Cardinality:** `*`

### response_model: `Entity`
The response_model of this rest_operation.
- **Cardinality:** `1`

### rest_resource: `RestResource`
The rest_resource of this rest_operation.
- **Cardinality:** `1`

### cache_policy: `CachePolicy?`
The cache_policy of this rest_operation.
- **Cardinality:** `0..1`

### effective_cache_policy: `CachePolicy?`
The effective_cache_policy of this rest_operation.
- **Cardinality:** `0..1`
- **Code:**
  ```kotlin
  cachePolicy ?: restResource.cachePolicy
  ```