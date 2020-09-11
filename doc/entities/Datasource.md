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

## Relationships

### service: `Service`
service
- **Cardinality:** `1`

### entities: `List<Entity>`
entities
- **Cardinality:** `*`
- **Code:**
  ```kotlin
  service.entitiesUsedInGraphql
  ```

### top_level_entities: `List<Entity>`
top_level_entities
- **Cardinality:** `*`
- **Code:**
  ```kotlin
  entities.filter{ it.topLevel }
  ```