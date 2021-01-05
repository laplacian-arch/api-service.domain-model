# **Datasource**
**namespace:** laplacian.arch.api.service.datasource

A *DataSource* represents an interface through which a client application access to a data store.
This includes the following models.
- The entity that the datastore exposes to the client
- Statement issued by the client to the datastore




---

## Properties

### type: `String`
The type of this datasource.

### name: `String`
The name of this datasource.
- **Attributes:** *PK*

### description: `String`
The description of this datasource.
- **Default Value:**
  ```kotlin
  name
  ```

## Relationships

### configurations: `List<ConfigurationBinding>`
configurations
- **Cardinality:** `*`