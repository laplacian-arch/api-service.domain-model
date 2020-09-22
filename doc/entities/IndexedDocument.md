# **IndexedDocument**
**namespace:** laplacian.arch.api.service

indexed_document



---

## Properties

### index_name: `String`
The index_name of this indexed_document.
- **Attributes:** *PK*

### document_model_name: `String`
The document_model_name of this indexed_document.

### search_engine_client_name: `String`
The search_engine_client_name of this indexed_document.
- **Default Value:**
  ```kotlin
  "default"
  ```

## Relationships

### document_model: `Entity`
document_model
- **Cardinality:** `1`