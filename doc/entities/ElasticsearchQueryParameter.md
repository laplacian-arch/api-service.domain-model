# **ElasticsearchQueryParameter**
**namespace:** laplacian.arch.api.service

elasticsearch_query_parameter



---

## Properties

### name: `String`
The name of this elasticsearch_query_parameter.
- **Attributes:** *PK*

### type: `String`
The type of this elasticsearch_query_parameter.

### required: `Boolean`
Defines this elasticsearch_query_parameter is required or not.
- **Default Value:**
  ```kotlin
  false
  ```

### default_value: `String`
The default_value of this elasticsearch_query_parameter.
- **Default Value:**
  ```kotlin
  when(type) {
      "string" -> "\"\""
      "boolean" -> "false"
      "int" -> "0"
      "datetime" -> "LocalDateTime.now()"
      "time" -> "LocalTime.now()"
      "date" -> "LocalDate.now()"
      else -> null
  }
  ```

### class_name: `String`
The class_name of this elasticsearch_query_parameter.
- **Default Value:**
  ```kotlin
  when(type) {
      "date" -> "LocalDate"
      "time" -> "LocalTime"
      "datetime" -> "LocalDateTime"
      else -> type.upperCamelize()
  }
  ```

## Relationships