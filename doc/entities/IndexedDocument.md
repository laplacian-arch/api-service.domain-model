# **IndexedDocument**
**namespace:** laplacian.arch.api.service.graphql

An entity describing a indexed_document.



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
The elasticsearch_index of this indexed_document.
- **Cardinality:** `1`

### document_model: `Entity`
The document_model of this indexed_document.
- **Cardinality:** `1`
- **Code:**
  ```kotlin
  elasticsearchIndex.documentModel
  ```