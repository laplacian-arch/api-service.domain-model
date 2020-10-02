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

### depends_on_elasticsearch: `Boolean`
Defines this service is depends_on_elasticsearch or not.
- **Code:**
  ```kotlin
  graphqlTypesBackedByIndexedDocument.isNotEmpty()
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

### graphql_types_backed_by_database_table: `List<EntityOnDatabase>`
graphql_types_backed_by_database_table
- **Cardinality:** `*`
- **Code:**
  ```kotlin
  graphqlTypes.map{ it as? EntityOnDatabase }.filterNotNull()
  ```

### entities_backing_graphql_type: `List<Entity>`
entities_backing_graphql_type
- **Cardinality:** `*`
- **Code:**
  ```kotlin
  ( graphqlTypesBackedByDatabaseTable.map{ it.entity } +
    graphqlTypesBackedByIndexedDocument.map{ it.documentModel }
  )
  .distinct()
  ```

### top_level_entities_backing_graphql_type: `List<Entity>`
top_level_entities_backing_graphql_type
- **Cardinality:** `*`
- **Code:**
  ```kotlin
  entitiesBackingGraphqlType
  .filter{ it.topLevel }
  ```

### graphql_types_backed_by_external_rest_api: `List<ExternalRestApi>`
graphql_types_backed_by_external_rest_api
- **Cardinality:** `*`
- **Code:**
  ```kotlin
  graphqlTypes.map{ it as? ExternalRestApi }.filterNotNull()
  ```

### rest_resources_backing_graphql_type: `List<RestResource>`
rest_resources_backing_graphql_type
- **Cardinality:** `*`
- **Code:**
  ```kotlin
  graphqlTypesBackedByExternalRestApi.map{ it.restResource }.distinct()
  ```

### graphql_types_backed_by_indexed_document: `List<IndexedDocument>`
graphql_types_backed_by_indexed_document
- **Cardinality:** `*`
- **Code:**
  ```kotlin
  graphqlTypes.map{ it as? IndexedDocument }.filterNotNull()
  ```

### graphql_types_backed_by_elasticsearch_query: `List<QueryToElasticsearch>`
graphql_types_backed_by_elasticsearch_query
- **Cardinality:** `*`
- **Code:**
  ```kotlin
  graphqlTypes.map{ it as? QueryToElasticsearch }.filterNotNull()
  ```

### rest_clients: `List<RestClient>`
rest_clients
- **Cardinality:** `*`

### search_engine_clients: `List<SearchEngineClient>`
search_engine_clients
- **Cardinality:** `*`

### elasticsearch_indices: `List<ElasticsearchIndex>`
elasticsearch_indices
- **Cardinality:** `*`
- **Code:**
  ```kotlin
  graphqlTypes.map{
      (it as? IndexedDocument)?.elasticsearchIndex ?:
      (it as? QueryToElasticsearch)?.elasticsearchIndex
  }
  .filterNotNull()
  ```