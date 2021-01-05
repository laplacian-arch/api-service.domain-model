# **Service**
**namespace:** laplacian.arch.api.service

service



---

## Properties

### name: `String`
The name of this service.
- **Attributes:** *PK*

### version: `String`
The version of this service.

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
  elasticsearchIndexes.isNotEmpty()
  ```

### depends_on_cache: `Boolean`
Defines this service is depends_on_cache or not.
- **Code:**
  ```kotlin
  restResourcesBackingGraphqlType.any {
      it.cachePolicy != null || it.operations.any{ it.cachePolicy != null }
  }
  ```

### depends_on_redis_cache: `Boolean`
Defines this service is depends_on_redis_cache or not.
- **Code:**
  ```kotlin
  restResourcesBackingGraphqlType.any {
      it.cachePolicy?.storeType == "redis" ?: false ||
      it.operations.any{ it.cachePolicy?.storeType == "redis" ?: false }
  }
  ```

### depends_on_mybatis: `Boolean`
Defines this service is depends_on_mybatis or not.
- **Code:**
  ```kotlin
  graphqlTypesBackedByRdbmsTable.any { it.mybatisMappers.isNotEmpty() }
  ```

### depends_on_oracle_jdbc_driver: `Boolean`
Defines this service is depends_on_oracle_jdbc_driver or not.
- **Code:**
  ```kotlin
  datasources.any { it.type == "oracle_jdbc" }
  ```

## Relationships

### datasource_entries: `List<DatasourceEntry>`
datasource_entries
- **Cardinality:** `*`

### datasources: `List<Datasource>`
datasources
- **Cardinality:** `*`
- **Code:**
  ```kotlin
  datasourceEntries.map{ it.datasource }
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
  graphqlTypesBackedByDatabaseTable
  .map{ it.entity }
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

### graphql_types_backed_by_external_rest_resource: `List<ExternalRestResource>`
graphql_types_backed_by_external_rest_resource
- **Cardinality:** `*`
- **Code:**
  ```kotlin
  graphqlTypes.map{ it as? ExternalRestResource }.filterNotNull()
  ```

### rest_resources_backing_graphql_type: `List<RestResource>`
rest_resources_backing_graphql_type
- **Cardinality:** `*`
- **Code:**
  ```kotlin
  graphqlTypesBackedByExternalRestResource
  .map{ it.restResource }
  .distinct()
  ```

### graphql_types_backed_by_indexed_document: `List<IndexedDocument>`
graphql_types_backed_by_indexed_document
- **Cardinality:** `*`
- **Code:**
  ```kotlin
  graphqlTypes.map{ it as? IndexedDocument }.filterNotNull()
  ```

### graphql_types_backed_by_rdbms_table: `List<RdbmsTable>`
graphql_types_backed_by_rdbms_table
- **Cardinality:** `*`
- **Code:**
  ```kotlin
  graphqlTypes.map{ it as? RdbmsTable }.filterNotNull()
  ```

### rest_clients: `List<RestClient>`
rest_clients
- **Cardinality:** `*`

### elastic_search_clients: `List<ElasticSearchClient>`
elastic_search_clients
- **Cardinality:** `*`

### elasticsearch_indexes: `List<ElasticsearchIndex>`
elasticsearch_indexes
- **Cardinality:** `*`
- **Code:**
  ```kotlin
  graphqlTypesBackedByIndexedDocument.map{ it.elasticsearchIndex }
  .distinct()
  ```

### graphql_type_relationships: `List<GraphqlTypeRelationship>`
graphql_type_relationships
- **Cardinality:** `*`
- **Code:**
  ```kotlin
  graphqlTypes.map{ it.relationships }.flatten().distinct()
  ```

### configuration_categories: `List<ServiceConfigurationCategory>`
configuration_categories
- **Cardinality:** `*`

### cache_policies: `List<CachePolicy>`
cache_policies
- **Cardinality:** `*`
- **Code:**
  ```kotlin
  (
      restResourcesBackingGraphqlType.map{ it.cachePolicy } +
      restResourcesBackingGraphqlType.flatMap{ it.operations.map{ it.cachePolicy }}
  )
  .filterNotNull()
  .distinct()
  ```