# **Datasource**
**namespace:** laplacian.arch.api.service

A *DataSource* represents an interface through which a client application access to a data store.
This includes the following models.
- The entity that the datastore exposes to the client
- Statement issued by the client to the datastore




---

## Properties

### name: `String`
The name of this datasource.
- **Attributes:** *PK*
- **Default Value:**
  ```kotlin
  "default"
  ```

### type: `String`
The type of this datasource.

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
      "jdbc:postgresql://$hostname:$port/$dbName"
  }
  else {
      throw IllegalStateException(
          "Unknown database type: $type"
      )
  }
  ```

### db_name: `String`
The db_name of this datasource.
- **Default Value:**
  ```kotlin
  name.lowerUnderscorize()
  ```

### db_user: `String`
The db_user of this datasource.

### db_password: `String`
The db_password of this datasource.

### container_name: `String`
The container_name of this datasource.
- **Default Value:**
  ```kotlin
  "${name.lowerHyphenize()}"
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

### service: `Service`
service
- **Cardinality:** `1`

### entities: `List<Entity>`
entities
- **Cardinality:** `*`
- **Code:**
  ```kotlin
  service
  .graphqlTypeEntries
  .filter{ it.datasource == this }
  .map{ it.graphqlType.entity }
  .distinct()
  ```

### top_level_entities: `List<Entity>`
top_level_entities
- **Cardinality:** `*`
- **Code:**
  ```kotlin
  entities.filter{ it.topLevel }
  ```