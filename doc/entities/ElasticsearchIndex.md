# **ElasticsearchIndex**
**namespace:** laplacian.arch.api.service.elasticsearch

elasticsearch_index



---

## Properties

### name: `String`
The name of this elasticsearch_index.
- **Attributes:** *PK*

### description: `String`
The description of this elasticsearch_index.
- **Default Value:**
  ```kotlin
  "elasticsearch index schema of ${name}"
  ```

### document_model_name: `String`
The document_model_name of this elasticsearch_index.

## Relationships

### document_model: `Entity`
document_model
- **Cardinality:** `1`

### queries: `List<ElasticsearchQuery>`
queries
- **Cardinality:** `*`