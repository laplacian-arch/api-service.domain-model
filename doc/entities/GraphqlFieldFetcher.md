# **GraphqlFieldFetcher**
**namespace:** laplacian.arch.api.service.graphql

An entity describing a graphql_field_fetcher.



---

## Properties

### type: `String`
The type of this graphql_field_fetcher.

### description: `String`
The description of this graphql_field_fetcher.
- **Default Value:**
  ```kotlin
  "The data fetcher for the ${graphqlField.name} field."
  ```

### result_filter: `String`
The result_filter of this graphql_field_fetcher.

### result_mapper: `String`
The result_mapper of this graphql_field_fetcher.
- **Default Value:**
  ```kotlin
  "${graphqlField.recordType}.from(result)"
  ```

### cache_policy_name: `String`
The cache_policy_name of this graphql_field_fetcher.

## Relationships

### graphql_field: `GraphqlField`
The graphql_field of this graphql_field_fetcher.
- **Cardinality:** `1`

### graphql_field_arguments: `List<ApiCallArgument>`
The graphql_field_arguments of this graphql_field_fetcher.
- **Cardinality:** `*`
- **Code:**
  ```kotlin
  graphqlField.arguments
  ```

### graphql_type: `GraphqlType`
The graphql_type of this graphql_field_fetcher.
- **Cardinality:** `1`
- **Code:**
  ```kotlin
  graphqlField.graphqlType
  ```

### cache_policy: `CachePolicy?`
The cache_policy of this graphql_field_fetcher.
- **Cardinality:** `0..1`