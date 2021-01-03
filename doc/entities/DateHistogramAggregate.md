# **DateHistogramAggregate**
**namespace:** laplacian.arch.api.service

date_histogram_aggregate



---

## Properties

### format: `String`
The format of this date_histogram_aggregate.

### timezone: `String`
The timezone of this date_histogram_aggregate.

### min_doc_count: `String`
the minimum document count required per bucket


### variable_min_doc_count: `Boolean`
Defines this date_histogram_aggregate is variable_min_doc_count or not.
- **Code:**
  ```kotlin
  minDocCount?.contains("\${") ?: false
  ```

## Relationships

### interval: `DateHistogramInterval`
interval
- **Cardinality:** `1`

### extended_bounds: `DateHistogramExtendedBounds?`
extended_bounds
- **Cardinality:** `0..1`