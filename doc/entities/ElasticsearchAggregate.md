# **ElasticsearchAggregate**
**namespace:** laplacian.arch.api.service

elasticsearch_aggregate



---

## Properties

### name: `String`
The name of this elasticsearch_aggregate.
- **Attributes:** *PK*

### aggregation_type: `String`
The aggregation_type of this elasticsearch_aggregate.

## Relationships

### part_of: `ElasticsearchQuery`
part_of
- **Cardinality:** `1`

### fields: `List<AggregatesField>`
fields
- **Cardinality:** `*`