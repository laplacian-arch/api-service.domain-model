# **ExternalRestApi**
**namespace:** laplacian.arch.api.service

external_rest_api



---

## Properties

### rest_resource_name: `String`
The rest_resource_name of this external_rest_api.

### operation_name: `String`
The operation_name of this external_rest_api.

### rest_client_name: `String`
The rest_client_name of this external_rest_api.

## Relationships

### rest_resource: `RestResource`
rest_resource
- **Cardinality:** `1`

### rest_operation: `RestOperation`
rest_operation
- **Cardinality:** `1`
- **Code:**
  ```kotlin
  restResource.operations.find{ it.name == operationName }!!
  ```