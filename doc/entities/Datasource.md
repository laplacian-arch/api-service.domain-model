# **Datasource**
**namespace:** laplacian.arch.datasource

A *DataSource* represents a connection to a data store, such as an RDBMS.




---

## Properties

### name: `String`
The name of this datasource.

### type: `String`
The type of this datasource.

### identifier: `String`
The identifier of this datasource.
- **Default Value:**
  ```kotlin
  name.lowerUnderscorize()
  ```

### description: `String`
The description of this datasource.
- **Default Value:**
  ```kotlin
  name
  ```

### hostname: `String`
The hostname of this datasource.
- **Default Value:**
  ```kotlin
  containerName
  ```

### port: `Int`
The port of this datasource.
- **Default Value:**
  ```kotlin
  5432
  ```

### jdbc_url: `String`
The jdbc_url of this datasource.
- **Default Value:**
  ```kotlin
  if (type == "postgres") {
      "jdbc:postgresql://$hostname:$port/$dbname"
  }
  else {
      throw IllegalStateException(
          "Unknown database type: $type"
      )
  }
  ```

### dbname: `String`
The dbname of this datasource.
- **Default Value:**
  ```kotlin
  name.lowerUnderscorize()
  ```

### user: `String`
The user of this datasource.

### password: `String`
The password of this datasource.

### container_name: `String`
The container_name of this datasource.
- **Default Value:**
  ```kotlin
  "${identifier.lowerHyphenize()}"
  ```

### container_image: `String`
The container_image of this datasource.
- **Default Value:**
  ```kotlin
  when(type) {
    "postgresql" -> "postgres"
    else -> "postgres"
  }
  ```

## Relationships

### entity_references: `List<EntityReference>`
entity_references
- **Cardinality:** `*`

### entities: `List<Entity>`
entities
- **Cardinality:** `*`
- **Code:**
  ```kotlin
  entityReferences.map{ it.entity }
  ```

### top_level_entities: `List<Entity>`
top_level_entities
- **Cardinality:** `*`
- **Code:**
  ```kotlin
  entities.filter{ it.topLevel }
  ```