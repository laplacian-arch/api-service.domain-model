# **RestResource**
**namespace:** laplacian.arch.api.service

rest_resource



---

## Properties

### name: `String`
The name of this rest_resource.
- **Attributes:** *PK*

### resource_model_name: `String`
The resource_model_name of this rest_resource.

### http_client_name: `String`
The http_client_name of this rest_resource.

## Relationships

### resource_model: `Entity`
resource_model
- **Cardinality:** `1`

### operations: `List<RestOperation>`
operations
- **Cardinality:** `1..*`