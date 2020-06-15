# **RestDataItem**
**namespace:** laplacian.arch.api.service

rest_data_item



---

## Properties

### name: `String`
The name of this rest_data_item.

### identifier: `String`
The identifier of this rest_data_item.
- **Default Value:**
  ```kotlin
  name.lowerUnderscorize()
  ```

### type: `String`
The type of this rest_data_item.

### data_type: `String`
The data_type of this rest_data_item.
- **Code:**
  ```kotlin
  (
      type ?:
      entity?.className ?:
      "{" + children.joinToString(",\n"){ it.dataType } + "}"
  ) + (if (multiple) "[]" else "")
  ```

### entity_name: `String`
The entity_name of this rest_data_item.

### description: `String`
The description of this rest_data_item.
- **Default Value:**
  ```kotlin
  name
  ```

### root: `Boolean`
Defines this rest_data_item is root or not.
- **Default Value:**
  ```kotlin
  false
  ```

### multiple: `Boolean`
Defines this rest_data_item is multiple or not.
- **Default Value:**
  ```kotlin
  false
  ```

### required: `Boolean`
Defines this rest_data_item is required or not.
- **Default Value:**
  ```kotlin
  false
  ```

### default_value: `String`
The default_value of this rest_data_item.

### example_value: `String`
The example_value of this rest_data_item.
- **Default Value:**
  ```kotlin
  defaultValue ?: when (type) {
    "boolean" -> "false"
    "number" -> "42"
    "string" -> "\"hogehoge\""
    else -> "null"
  }
  ```

## Relationships

### children: `List<RestDataItem>`
children
- **Cardinality:** `*`

### parent: `RestDataItem?`
parent
- **Cardinality:** `0..1`

### entity: `Entity?`
entity
- **Cardinality:** `0..1`

### relating_entities: `List<Entity>`
relating_entities
- **Cardinality:** `*`
- **Code:**
  ```kotlin
  children.flatMap{ it.relatingEntities }.let {
      if (entity == null) {
          it
      } else {
          it + listOf(entity!!) + entity!!.relatingEntities
      }
  }.distinct()
  ```