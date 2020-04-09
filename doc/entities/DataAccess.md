# **DataAccess**
**namespace:** laplacian.arch.datasource

A *DataAccess* represents an interface through which an client retrieve data from a *DataSource*.




---

## Properties

### entity_name: `String`
The entity_name of this data_access.
- **Attributes:** *PK*

### cardinality: `String`
The cardinality of this data_access.
- **Default Value:**
  ```kotlin
  "*"
  ```

### multiple: `Boolean`
Defines this data_access is multiple or not.
- **Default Value:**
  ```kotlin
  cardinality.let{ it.contains("*") }
  ```

### type: `String`
The type of this data_access.
- **Default Value:**
  ```kotlin
  "${entityName.upperCamelize()}Entity".let { className ->
      if (multiple) "List<$className>" else className
  }
  ```

### name: `String`
The name of this data_access.
- **Attributes:** *PK*

### identifier: `String`
The identifier of this data_access.
- **Default Value:**
  ```kotlin
  name.lowerUnderscorize()
  ```

### description: `String`
The description of this data_access.
- **Default Value:**
  ```kotlin
  name
  ```

### script_type: `String`
The script_type of this data_access.

### script_body: `String`
The script_body of this data_access.

## Relationships

### entity: `Entity`
entity
- **Cardinality:** `1`