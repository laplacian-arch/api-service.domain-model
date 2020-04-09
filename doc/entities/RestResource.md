# **RestResource**
**namespace:** laplacian.arch.service.api

rest_resource



---

## Properties

### name: `String`
The name of this rest_resource.

### identifier: `String`
The identifier of this rest_resource.
- **Default Value:**
  ```kotlin
  name.lowerUnderscorize()
  ```

### namespace: `String`
The namespace of this rest_resource.
- **Default Value:**
  ```kotlin
  "${_context.get("project.namespace")}.resource.$identifier"
  ```

### path: `String`
The path of this rest_resource.
- **Default Value:**
  ```kotlin
  "/${identifier.lowerUnderscorize()}"
  ```

### description: `String`
The description of this rest_resource.
- **Default Value:**
  ```kotlin
  name
  ```

## Relationships

### operations: `List<RestOperation>`
operations
- **Cardinality:** `1..*`

### relating_entities: `List<Entity>`
relating_entities
- **Cardinality:** `*`
- **Code:**
  ```kotlin
  operations
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