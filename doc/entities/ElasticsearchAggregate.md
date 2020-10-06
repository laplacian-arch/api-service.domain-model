# **ElasticsearchAggregate**
**namespace:** laplacian.arch.api.service

elasticsearch_aggregate



---

## Properties

### name: `String`
The name of this elasticsearch_aggregate.
- **Attributes:** *PK*
- **Default Value:**
  ```kotlin
  aggregationType + '@' + fields.joinToString("|") { it.name }
  ```

### aggregation_type: `String`
The aggregation_type of this elasticsearch_aggregate.

## Relationships

### fields: `List<AggregatesField>`
fields
- **Cardinality:** `*`

### sub_aggregates: `List<ElasticsearchAggregate>`
sub_aggregates
- **Cardinality:** `*`