# **RestResource**
**namespace:** laplacian.arch.api.service.rest

An entity describing a rest_resource.



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

### cache_policy_name: `String`
The cache_policy_name of this rest_resource.

### enable_automatic_cookie_handling: `Boolean`
Defines this rest_resource is enable_automatic_cookie_handling or not.
- **Default Value:**
  ```kotlin
  false
  ```

## Relationships

### operations: `List<RestOperation>`
The operations of this rest_resource.
- **Cardinality:** `1..*`

### configurations: `List<ConfigurationBinding>`
The configurations of this rest_resource.
- **Cardinality:** `*`

### cache_policy: `CachePolicy?`
The cache_policy of this rest_resource.
- **Cardinality:** `0..1`