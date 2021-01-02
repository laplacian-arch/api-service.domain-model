# **RdbmsTable**
**namespace:** laplacian.arch.api.service.graphql

rdbms_table



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
data_model
- **Cardinality:** `1`

### mybatis_mapper_entries: `List<MybatisMapperEntry>`
mybatis_mapper_entries
- **Cardinality:** `*`

### mybatis_mappers: `List<MybatisMapper>`
mybatis_mappers
- **Cardinality:** `*`
- **Code:**
  ```kotlin
  mybatisMapperEntries.map{ it.mapper }
  ```