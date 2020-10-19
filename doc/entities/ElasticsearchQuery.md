# **ElasticsearchQuery**
**namespace:** laplacian.arch.api.service.elasticsearch

elasticsearch_query



---

## Properties

### name: `String`
The name of this elasticsearch_query.
- **Attributes:** *PK*

### index_name: `String`
The index_name of this elasticsearch_query.
- **Attributes:** *PK*

### description: `String`
The description of this elasticsearch_query.
- **Default Value:**
  ```kotlin
  "${name}"
  ```

### page_size: `String`
The size of the page to be returned

- **Default Value:**
  ```kotlin
  "200"
  ```

### variable_page_size: `Boolean`
Defines this elasticsearch_query is variable_page_size or not.
- **Code:**
  ```kotlin
  pageSize?.contains("\${") ?: false
  ```

### page_number: `String`
Zero-based page index.

- **Default Value:**
  ```kotlin
  "0"
  ```

### variable_page_number: `Boolean`
Defines this elasticsearch_query is variable_page_number or not.
- **Code:**
  ```kotlin
  pageNumber?.contains("\${") ?: false
  ```

## Relationships

### predicate: `ElasticsearchQueryPredicate?`
predicate
- **Cardinality:** `0..1`

### sort: `List<ElasticsearchQuerySort>`
sort
- **Cardinality:** `*`

### aggregates: `List<ElasticsearchAggregate>`
aggregates
- **Cardinality:** `*`

### parameters: `List<ElasticsearchQueryParameter>`
parameters
- **Cardinality:** `*`