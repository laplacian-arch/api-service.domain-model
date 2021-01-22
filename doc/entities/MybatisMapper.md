# **MybatisMapper**
**namespace:** laplacian.arch.api.service.rdb.mybatis

An entity describing a mybatis_mapper.



---

## Properties

### group_id: `String`
The group_id of this mybatis_mapper.
- **Attributes:** *PK*

### id: `String`
The id of this mybatis_mapper.
- **Attributes:** *PK*

### result_model_name: `String`
The result_model_name of this mybatis_mapper.

### type: `String`
The type of this mybatis_mapper.

### statement: `String`
The statement of this mybatis_mapper.

## Relationships

### parameters: `List<ApiCallArgument>`
The parameters of this mybatis_mapper.
- **Cardinality:** `*`

### result_model: `Entity?`
The result_model of this mybatis_mapper.
- **Cardinality:** `0..1`