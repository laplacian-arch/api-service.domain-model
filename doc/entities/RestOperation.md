# **RestOperation**
**namespace:** laplacian.arch.service.api

rest_operation



---

## Properties

### method: `String`
The method of this rest_operation.

### path: `String`
The path of this rest_operation.
- **Default Value:**
  ```kotlin
  "/"
  ```

### name: `String`
The name of this rest_operation.
- **Default Value:**
  ```kotlin
  identifier
  ```

### identifier: `String`
The identifier of this rest_operation.
- **Default Value:**
  ```kotlin
  method.lowerUnderscorize() + "_" +
  if (path == "/") {
      resource.identifier.pluralize()
  }
  else {
      path.lowerUnderscorize()
  }
  ```

### namespace: `String`
The namespace of this rest_operation.
- **Default Value:**
  ```kotlin
  "${resource.namespace}.$identifier"
  ```

### description: `String`
The description of this rest_operation.
- **Default Value:**
  ```kotlin
  name
  ```

### response_body_type: `String`
The response_body_type of this rest_operation.
- **Code:**
  ```kotlin
  responseBodyRoot?.dataType ?:
  ("{" + responseBody.joinToString(",\n"){ it.dataType } + "}")
  ```

## Relationships

### resource: `RestResource`
resource
- **Cardinality:** `1`

### relating_entities: `List<Entity>`
relating_entities
- **Cardinality:** `*`
- **Code:**
  ```kotlin
  ( pathParameters +
    requestHeaders +
    queryParameters +
    requestBody +
    responseHeaders +
    responseBody
  )
  .flatMap{ it.relatingEntities }
  .distinct()
  ```

### relating_top_level_entities: `List<Entity>`
relating_top_level_entities
- **Cardinality:** `*`
- **Code:**
  ```kotlin
  relatingEntities.filter{ it.topLevel }
  ```

### path_parameters: `List<RestDataItem>`
path_parameters
- **Cardinality:** `*`

### request_headers: `List<RestDataItem>`
request_headers
- **Cardinality:** `*`

### query_parameters: `List<RestDataItem>`
query_parameters
- **Cardinality:** `*`

### request_body: `List<RestDataItem>`
request_body
- **Cardinality:** `*`

### response_headers: `List<RestDataItem>`
response_headers
- **Cardinality:** `*`

### response_body: `List<RestDataItem>`
response_body
- **Cardinality:** `*`

### response_body_root: `RestDataItem?`
response_body_root
- **Cardinality:** `0..1`
- **Code:**
  ```kotlin
  responseBody.find{ it.root }
  ```