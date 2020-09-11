# **Service**
**namespace:** laplacian.arch.api.service

service



---

## Properties

### name: `String`
The name of this service.

### version: `String`
The version of this service.

### api_version: `String`
The api_version of this service.
- **Default Value:**
  ```kotlin
  "v1"
  ```

### endpoint: `String`
The endpoint of this service.
- **Default Value:**
  ```kotlin
  "${protocol}://${host}:${port}${path}/${apiVersion}"
  ```

### host: `String`
The host of this service.
- **Default Value:**
  ```kotlin
  "name.lowerHyphenize()"
  ```

### port: `Int`
The port of this service.
- **Default Value:**
  ```kotlin
  8080
  ```

### protocol: `String`
The protocol of this service.
- **Default Value:**
  ```kotlin
  "http"
  ```

### path: `String`
The path of this service.
- **Default Value:**
  ```kotlin
  "/${name.lowerHyphenize()}"
  ```

### namespace: `String`
The namespace of this service.
- **Default Value:**
  ```kotlin
  "${_context.get("project.namespace")}.service.${name.lowerUnderscorize()}"
  ```

### description: `String`
The description of this service.
- **Default Value:**
  ```kotlin
  name
  ```

## Relationships

### datasources: `List<Datasource>`
datasources
- **Cardinality:** `*`

### default_datasource: `Datasource?`
default_datasource
- **Cardinality:** `0..1`
- **Code:**
  ```kotlin
  datasources
  .find{ it.name == "default" }
  ```

### graphql_type_entries: `List<GraphqlTypeEntry>`
graphql_type_entries
- **Cardinality:** `*`

### graphql_types: `List<GraphqlType>`
graphql_types
- **Cardinality:** `*`
- **Code:**
  ```kotlin
  graphqlTypeEntries.map{ it.graphqlType }.distinct()
  ```

### entities_used_in_graphql: `List<Entity>`
entities_used_in_graphql
- **Cardinality:** `*`
- **Code:**
  ```kotlin
  graphqlTypes
    .map{ if (it is EntityOnDatabase) it.entity else null }
    .filterNotNull()
    .distinct()
  ```

### top_level_entities_used_in_graphql: `List<Entity>`
top_level_entities_used_in_graphql
- **Cardinality:** `*`
- **Code:**
  ```kotlin
  entitiesUsedInGraphql.filter{ it.topLevel }
  ```