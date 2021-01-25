# **MybatisMapper**
**namespace:** laplacian.arch.api.service.rdb.mybatis

An entity describing a mybatis_mapper.



---

## Properties

### name: `String`
The name of this mybatis_mapper.
- **Attributes:** *PK*

### description: `String`
The description of this mybatis_mapper.
- **Default Value:**
  ```kotlin
  "${type}: ${name}"
  ```

### result_model_name: `String`
The result_model_name of this mybatis_mapper.

### result_class_name: `String`
The result_class_name of this mybatis_mapper.
- **Code:**
  ```kotlin
  if (resultModel != null) "${resultModel!!.className}Result"
  else "${graphqlType.name.upperCamelize()}Record"
  ```

### type: `String`
The type of this mybatis_mapper.

### statement: `String`
The statement of this mybatis_mapper.

## Relationships

### graphql_type: `RdbmsTable`
The graphql_type of this mybatis_mapper.
- **Cardinality:** `1`

### parameters: `List<ApiCallArgument>`
The parameters of this mybatis_mapper.
- **Cardinality:** `*`

### result_model: `Entity?`
The result_model of this mybatis_mapper.
- **Cardinality:** `0..1`