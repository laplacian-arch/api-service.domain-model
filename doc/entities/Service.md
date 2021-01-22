# **Service**
**namespace:** laplacian.arch.api.service

An entity describing a service.



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
The datasource_entries of this service.
- **Cardinality:** `*`

### datasources: `List<Datasource>`
The datasources of this service.
- **Cardinality:** `*`
- **Code:**
  ```kotlin
  datasourceEntries.map{ it.datasource }
  ```

### graphql_type_entries: `List<GraphqlTypeEntry>`
The graphql_type_entries of this service.
- **Cardinality:** `*`

### graphql_types: `List<GraphqlType>`
The graphql_types of this service.
- **Cardinality:** `*`
- **Code:**
  ```kotlin
  graphqlTypeEntries.map{ it.graphqlType }.distinct()
  ```

### graphql_types_backed_by_external_rest_resource: `List<ExternalRestResource>`
The graphql_types_backed_by_external_rest_resource of this service.
- **Cardinality:** `*`
- **Code:**
  ```kotlin
  graphqlTypes.map{ it as? ExternalRestResource }.filterNotNull()
  ```

### rest_resources_backing_graphql_type: `List<RestResource>`
The rest_resources_backing_graphql_type of this service.
- **Cardinality:** `*`
- **Code:**
  ```kotlin
  graphqlTypesBackedByExternalRestResource
  .map{ it.restResource }
  .distinct()
  ```

### graphql_types_backed_by_indexed_document: `List<IndexedDocument>`
The graphql_types_backed_by_indexed_document of this service.
- **Cardinality:** `*`
- **Code:**
  ```kotlin
  graphqlTypes.map{ it as? IndexedDocument }.filterNotNull()
  ```

### graphql_types_backed_by_rdbms_table: `List<RdbmsTable>`
The graphql_types_backed_by_rdbms_table of this service.
- **Cardinality:** `*`
- **Code:**
  ```kotlin
  graphqlTypes.map{ it as? RdbmsTable }.filterNotNull()
  ```

### graphql_types_backed_by_static_data: `List<StaticData>`
The graphql_types_backed_by_static_data of this service.
- **Cardinality:** `*`
- **Code:**
  ```kotlin
  graphqlTypes.map{ it as? StaticData }.filterNotNull()
  ```

### elastic_search_clients: `List<ElasticSearchClient>`
The elastic_search_clients of this service.
- **Cardinality:** `*`

### elasticsearch_indexes: `List<ElasticsearchIndex>`
The elasticsearch_indexes of this service.
- **Cardinality:** `*`
- **Code:**
  ```kotlin
  graphqlTypesBackedByIndexedDocument.map{ it.elasticsearchIndex }
  .distinct()
  ```

### graphql_type_relationships: `List<GraphqlTypeRelationship>`
The graphql_type_relationships of this service.
- **Cardinality:** `*`
- **Code:**
  ```kotlin
  graphqlTypes.map{ it.relationships }.flatten().distinct()
  ```

### configuration_categories: `List<ServiceConfigurationCategory>`
The configuration_categories of this service.
- **Cardinality:** `*`

### cache_policies: `List<CachePolicy>`
The cache_policies of this service.
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