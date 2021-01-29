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
  cachePolicies.isNotEmpty()
  ```

### depends_on_redis_cache: `Boolean`
Defines this service is depends_on_redis_cache or not.
- **Code:**
  ```kotlin
  redisCachePolicies.isNotEmpty()
  ```

### depends_on_mybatis: `Boolean`
Defines this service is depends_on_mybatis or not.
- **Code:**
  ```kotlin
  mybatisFetchers.isNotEmpty()
  ```

### depends_on_postgres_jdbc: `Boolean`
Defines this service is depends_on_postgres_jdbc or not.
- **Code:**
  ```kotlin
  datasources.any { it.type == "postgres_jdbc" }
  ```

### depends_on_oracle_jdbc: `Boolean`
Defines this service is depends_on_oracle_jdbc or not.
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

### elasticsearch_indexes: `List<ElasticsearchIndex>`
The elasticsearch_indexes of this service.
- **Cardinality:** `*`
- **Code:**
  ```kotlin
  listOf<ElasticsearchIndex>()
  ```

### configuration_categories: `List<ServiceConfigurationCategory>`
The configuration_categories of this service.
- **Cardinality:** `*`

### graphql_fields: `List<GraphqlField>`
The graphql_fields of this service.
- **Cardinality:** `*`
- **Code:**
  ```kotlin
  graphqlTypes
  .flatMap{ it.fields ?: emptyList() }
  ```

### graphql_field_fetchers: `List<GraphqlFieldFetcher>`
The graphql_field_fetchers of this service.
- **Cardinality:** `*`
- **Code:**
  ```kotlin
  graphqlFields.map{ it.fetcher }.filterNotNull()
  ```

### mybatis_fetchers: `List<MybatisFetcher>`
The mybatis_fetchers of this service.
- **Cardinality:** `*`
- **Code:**
  ```kotlin
  graphqlFieldFetchers.filterIsInstance<MybatisFetcher>()
  ```

### cache_policies: `List<CachePolicy>`
The cache_policies of this service.
- **Cardinality:** `*`
- **Code:**
  ```kotlin
  graphqlFieldFetchers.map{ it.cachePolicy }.filterNotNull()
  ```

### redis_cache_policies: `List<RedisCachePolicy>`
The redis_cache_policies of this service.
- **Cardinality:** `*`
- **Code:**
  ```kotlin
  cachePolicies.filterIsInstance<RedisCachePolicy>()
  ```