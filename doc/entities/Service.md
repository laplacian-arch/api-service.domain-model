# **Service**
**namespace:** laplacian.arch.api.service

service



---

## Properties

### name: `String`
The name of this service.

### identifier: `String`
The identifier of this service.
- **Default Value:**
  ```kotlin
  name.lowerUnderscorize()
  ```

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
  "identifier.lowerHyphenize()"
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
  "/${identifier.lowerHyphenize()}"
  ```

### namespace: `String`
The namespace of this service.
- **Default Value:**
  ```kotlin
  "${_context.get("project.namespace")}.service.$identifier"
  ```

### description: `String`
The description of this service.
- **Default Value:**
  ```kotlin
  name
  ```

### datasource_name: `String`
The datasource_name of this service.

## Relationships

### resource_entries: `List<ResourceEntry>`
resource_entries
- **Cardinality:** `*`

### resources: `List<RestResource>`
resources
- **Cardinality:** `*`
- **Code:**
  ```kotlin
  resourceEntries.map{ it.resource }
  ```

### datasource: `Datasource`
datasource
- **Cardinality:** `1`

### entities_used_in_rest_service: `List<Entity>`
entities_used_in_rest_service
- **Cardinality:** `*`
- **Code:**
  ```kotlin
  resources
  .flatMap{ it.relatingEntities }
  .distinctBy{ it.fqn }
  ```

### relating_entities: `List<Entity>`
relating_entities
- **Cardinality:** `*`
- **Code:**
  ```kotlin
  entitiesUsedInRestService + entitiesUsedInGraphql
  ```

### relating_top_level_entities: `List<Entity>`
relating_top_level_entities
- **Cardinality:** `*`
- **Code:**
  ```kotlin
  relatingEntities
  .filter{ it.topLevel }
  .distinct()
  ```

### graphql_queries: `List<GraphqlQuery>`
graphql_queries
- **Cardinality:** `*`

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
  graphqlTypes.map{ it.entity }.filterNotNull()
  ```

### top_level_entities_used_in_graphql: `List<Entity>`
top_level_entities_used_in_graphql
- **Cardinality:** `*`
- **Code:**
  ```kotlin
  entitiesUsedInGraphql.filter{ it.topLevel }
  ```