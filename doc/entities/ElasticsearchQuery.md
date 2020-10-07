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

## Relationships

### predicate: `ElasticsearchQueryPredicate?`
predicate
- **Cardinality:** `0..1`

### aggregates: `List<ElasticsearchAggregate>`
aggregates
- **Cardinality:** `*`

### parameters: `List<ElasticsearchQueryParameter>`
parameters
- **Cardinality:** `*`