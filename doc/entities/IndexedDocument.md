# **IndexedDocument**
**namespace:** laplacian.arch.api.service.graphql

indexed_document



---

## Properties

### index_name: `String`
The index_name of this indexed_document.
- **Default Value:**
  ```kotlin
  name
  ```

### search_engine_client_name: `String`
The search_engine_client_name of this indexed_document.
- **Default Value:**
  ```kotlin
  "default"
  ```

### default_searcher_name: `String`
The default_searcher_name of this indexed_document.
- **Default Value:**
  ```kotlin
  name.pluralize().lowerCamelize()
  ```

## Relationships

### elasticsearch_index: `ElasticsearchIndex`
elasticsearch_index
- **Cardinality:** `1`

### document_model: `Entity`
document_model
- **Cardinality:** `1`
- **Code:**
  ```kotlin
  elasticsearchIndex.documentModel
  ```