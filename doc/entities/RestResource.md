# **RestResource**
**namespace:** laplacian.arch.api.service

rest_resource



---

## Properties

### name: `String`
The name of this rest_resource.
- **Attributes:** *PK*

### description: `String`
The description of this rest_resource.
- **Default Value:**
  ```kotlin
  "${name}"
  ```

### resource_model_name: `String`
The resource_model_name of this rest_resource.

### base_url: `String`
The base_url of this rest_resource.

## Relationships

### operations: `List<RestOperation>`
operations
- **Cardinality:** `1..*`

### configurations: `List<ConfigurationBinding>`
configurations
- **Cardinality:** `*`