# **MybatisMapperEntry**
**namespace:** laplacian.arch.api.service.rdb.mybatis

An entity describing a mybatis_mapper_entry.



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
The mapper of this mybatis_mapper_entry.
- **Cardinality:** `1`

### context_entity: `Entity?`
The context_entity of this mybatis_mapper_entry.
- **Cardinality:** `0..1`

### graphql_type: `RdbmsTable`
The graphql_type of this mybatis_mapper_entry.
- **Cardinality:** `1`