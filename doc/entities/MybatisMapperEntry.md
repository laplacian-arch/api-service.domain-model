# **MybatisMapperEntry**
**namespace:** laplacian.arch.api.service.mybatis

mybatis_mapper_entry



---

## Properties

### group_id: `String`
The group_id of this mybatis_mapper_entry.
- **Attributes:** *PK*
- **Default Value:**
  ```kotlin
  graphqlType.dataModel.name
  ```

### id: `String`
The id of this mybatis_mapper_entry.
- **Attributes:** *PK*

### context_entity_name: `String`
The context_entity_name of this mybatis_mapper_entry.

## Relationships

### mapper: `MybatisMapper`
mapper
- **Cardinality:** `1`

### context_entity: `Entity?`
context_entity
- **Cardinality:** `0..1`

### graphql_type: `RdbmsTable`
graphql_type
- **Cardinality:** `1`