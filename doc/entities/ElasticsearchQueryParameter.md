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

### description: `String`
The description of this elasticsearch_query_parameter.
- **Default Value:**
  ```kotlin
  "${name}"
  ```

### required: `Boolean`
Defines this elasticsearch_query_parameter is required or not.
- **Default Value:**
  ```kotlin
  false
  ```

### multiple: `Boolean`
Defines this elasticsearch_query_parameter is multiple or not.
- **Default Value:**
  ```kotlin
  false
  ```

### nullable: `Boolean`
Defines this elasticsearch_query_parameter is nullable or not.
- **Code:**
  ```kotlin
  !required && !containsKey("default_value")
  ```

### default_value: `String`
The default_value of this elasticsearch_query_parameter.
- **Default Value:**
  ```kotlin
  if (multiple) "emptyList()"
  else when(type) {
      "string" -> "\"\""
      "boolean" -> "false"
      "int" -> "0"
      "datetime" -> "LocalDateTime.now().toString()"
      "time" -> "LocalTime.now().toString()"
      "date" -> "LocalDate.now().toString()"
      else -> null
  }
  ```

### class_name: `String`
The class_name of this elasticsearch_query_parameter.
- **Default Value:**
  ```kotlin
  when(type) {
      "date" -> "String"
      "time" -> "String"
      "datetime" -> "String"
      else -> type.upperCamelize()
  }.let { if (multiple) "List<${it}>" else it }
  ```

## Relationships