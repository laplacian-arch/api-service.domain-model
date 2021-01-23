# **RdbmsTable**
**namespace:** laplacian.arch.api.service.graphql

An entity describing a rdbms_table.



---

## Properties

### data_model_name: `String`
The data_model_name of this rdbms_table.
- **Default Value:**
  ```kotlin
  name
  ```

### table_name: `String`
The table_name of this rdbms_table.
- **Default Value:**
  ```kotlin
  name.lowerUnderscorize()
  ```

### datasource_name: `String`
The datasource_name of this rdbms_table.
- **Default Value:**
  ```kotlin
  "default"
  ```

## Relationships

### data_model: `Entity`
The data_model of this rdbms_table.
- **Cardinality:** `1`

### mybatis_mappers: `List<MybatisMapper>`
The mybatis_mappers of this rdbms_table.
- **Cardinality:** `*`