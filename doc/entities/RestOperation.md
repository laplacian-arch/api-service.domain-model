# **RestOperation**
**namespace:** laplacian.arch.api.service

rest_operation



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

### enable_cache: `Boolean`
Defines this rest_operation is enable_cache or not.
- **Default Value:**
  ```kotlin
  restResource.enableCache
  ```

## Relationships

### arguments: `List<ApiCallArgument>`
arguments
- **Cardinality:** `*`

### path_parameters: `List<RestRequestParameter>`
path_parameters
- **Cardinality:** `*`

### query_parameters: `List<RestRequestParameter>`
query_parameters
- **Cardinality:** `*`

### http_headers: `List<RestRequestParameter>`
http_headers
- **Cardinality:** `*`

### response_model: `Entity`
response_model
- **Cardinality:** `1`

### rest_resource: `RestResource`
rest_resource
- **Cardinality:** `1`