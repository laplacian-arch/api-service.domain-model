<!-- @head-content@ -->
# laplacian-arch/api-service.domain-model

A domain model that represents the logical structure of API services.
This model is based on the REST resource model,
GraphQL interface definition model, and the data source access model.


*Read this in other languages*: [[日本語](README_ja.md)] [[简体中文](README_zh.md)]
<!-- @head-content@ -->

<!-- @toc@ -->
## Table of contents
- [Overview](#overview)

  * [Model overview](#model-overview)

- [Usage](#usage)

- [Index](#index)

  * [Entity list](#entity-list)

  * [Script List](#script-list)

  * [Source code list](#source-code-list)



<!-- @toc@ -->

<!-- @main-content@ -->
## Overview


### Model overview


The following diagram explains the entities included in this module and the relationship
between them.
![](./doc/image/model-diagram.svg)

## Usage

To apply this Model module, add the following entry to your project definition.
```yaml
project:
  models:
  - group: laplacian-arch
    name: api-service.domain-model
    version: 1.0.0
```

You can run the following command to see a list of resources affected by the application of this module and their contents.
```console
$ ./script/generate --dry-run

diff --color -r PROJECT_HOME/.NEXT/somewhere/something.md PROJECT_HOME/somewhere/something.md
1,26c1,10
< content: OLD CONTENT
---
> content: NEW CONTENT
```

If there is no problem, execute the following command to reflect the change.
```console
$ ./script/generate

```


## Index


### Entity list


- [**ApiCallArgument**](<./doc/entities/ApiCallArgument.md>)
An entity describing a api_call_argument.
- [**CachePolicy**](<./doc/entities/CachePolicy.md>)
An entity describing a cache_policy.
- [**HeapMemoryCachePolicy**](<./doc/entities/HeapMemoryCachePolicy.md>)
An entity describing a heap_memory_cache_policy.
- [**RedisCachePolicy**](<./doc/entities/RedisCachePolicy.md>)
An entity describing a redis_cache_policy.
- [**DataFileFetcher**](<./doc/entities/DataFileFetcher.md>)
A graphql field fetcher retrieving the value from a file located in the container.
- [**DataFile**](<./doc/entities/DataFile.md>)
An entity describing a data_file.
- [**Datasource**](<./doc/entities/Datasource.md>)
A *DataSource* represents an interface through which a client application access to a data store.
This includes the following models.
- The entity that the datastore exposes to the client
- Statement issued by the client to the datastore
- [**DatasourceEntry**](<./doc/entities/DatasourceEntry.md>)
An entity describing a datasource_entry.
- [**PostgresJdbcDatasource**](<./doc/entities/PostgresJdbcDatasource.md>)
An entity describing a postgres_jdbc_datasource.
- [**Duration**](<./doc/entities/Duration.md>)
An entity describing a duration.
- [**AvgBucketAggregate**](<./doc/entities/AvgBucketAggregate.md>)
An entity describing a avg_bucket_aggregate.
- [**BucketScriptAggregate**](<./doc/entities/BucketScriptAggregate.md>)
An entity describing a bucket_script_aggregate.
- [**BucketScriptPath**](<./doc/entities/BucketScriptPath.md>)
An entity describing a bucket_script_path.
- [**BucketSelectorAggregate**](<./doc/entities/BucketSelectorAggregate.md>)
An entity describing a bucket_selector_aggregate.
- [**BucketSortAggregate**](<./doc/entities/BucketSortAggregate.md>)
An entity describing a bucket_sort_aggregate.
- [**FieldSort**](<./doc/entities/FieldSort.md>)
An entity describing a field_sort.
- [**DateHistogramAggregate**](<./doc/entities/DateHistogramAggregate.md>)
An entity describing a date_histogram_aggregate.
- [**DateHistogramExtendedBounds**](<./doc/entities/DateHistogramExtendedBounds.md>)
An entity describing a date_histogram_extended_bounds.
- [**DateHistogramInterval**](<./doc/entities/DateHistogramInterval.md>)
An entity describing a date_histogram_interval.
- [**DateHistogramCalendarInterval**](<./doc/entities/DateHistogramCalendarInterval.md>)
An entity describing a date_histogram_calendar_interval.
- [**DateHistogramFixedInterval**](<./doc/entities/DateHistogramFixedInterval.md>)
An entity describing a date_histogram_fixed_interval.
- [**DateRangeAggregate**](<./doc/entities/DateRangeAggregate.md>)
An entity describing a date_range_aggregate.
- [**AggregateGroupRange**](<./doc/entities/AggregateGroupRange.md>)
An entity describing a aggregate_group_range.
- [**FilterAggregate**](<./doc/entities/FilterAggregate.md>)
An entity describing a filter_aggregate.
- [**FiltersAggregate**](<./doc/entities/FiltersAggregate.md>)
An entity describing a filters_aggregate.
- [**KeyedFilter**](<./doc/entities/KeyedFilter.md>)
An entity describing a keyed_filter.
- [**SumAggregate**](<./doc/entities/SumAggregate.md>)
An entity describing a sum_aggregate.
- [**AvgAggregate**](<./doc/entities/AvgAggregate.md>)
An entity describing a avg_aggregate.
- [**MinAggregate**](<./doc/entities/MinAggregate.md>)
An entity describing a min_aggregate.
- [**MaxAggregate**](<./doc/entities/MaxAggregate.md>)
An entity describing a max_aggregate.
- [**ValueCountAggregate**](<./doc/entities/ValueCountAggregate.md>)
An entity describing a value_count_aggregate.
- [**TermsAggregate**](<./doc/entities/TermsAggregate.md>)
A multi-bucket value source based aggregation where buckets are dynamically built
- one per unique value.
- [**ElasticsearchAggregate**](<./doc/entities/ElasticsearchAggregate.md>)
An entity describing a elasticsearch_aggregate.
- [**ElasticsearchIndex**](<./doc/entities/ElasticsearchIndex.md>)
An entity describing a elasticsearch_index.
- [**ElasticsearchIndexSort**](<./doc/entities/ElasticsearchIndexSort.md>)
An entity describing a elasticsearch_index_sort.
- [**ElasticsearchQueryPredicate**](<./doc/entities/ElasticsearchQueryPredicate.md>)
An entity describing a elasticsearch_query_predicate.
- [**ElasticsearchQuerySort**](<./doc/entities/ElasticsearchQuerySort.md>)
An entity describing a elasticsearch_query_sort.
- [**ElasticsearchQueryScoreSort**](<./doc/entities/ElasticsearchQueryScoreSort.md>)
An entity describing a elasticsearch_query_score_sort.
- [**ElasticsearchQueryFieldSort**](<./doc/entities/ElasticsearchQueryFieldSort.md>)
An entity describing a elasticsearch_query_field_sort.
- [**ElasticsearchQuery**](<./doc/entities/ElasticsearchQuery.md>)
An entity describing a elasticsearch_query.
- [**BoolQueryPredicate**](<./doc/entities/BoolQueryPredicate.md>)
An entity describing a bool_query_predicate.
- [**ExistsQueryPredicate**](<./doc/entities/ExistsQueryPredicate.md>)
An entity describing a exists_query_predicate.
- [**MatchAllQueryPredicate**](<./doc/entities/MatchAllQueryPredicate.md>)
An entity describing a match_all_query_predicate.
- [**MatchQueryPredicate**](<./doc/entities/MatchQueryPredicate.md>)
An entity describing a match_query_predicate.
- [**MultiMatchQueryPredicate**](<./doc/entities/MultiMatchQueryPredicate.md>)
An entity describing a multi_match_query_predicate.
- [**QueryStringPredicate**](<./doc/entities/QueryStringPredicate.md>)
An entity describing a query_string_predicate.
- [**RangeQueryPredicate**](<./doc/entities/RangeQueryPredicate.md>)
An entity describing a range_query_predicate.
- [**TermQueryPredicate**](<./doc/entities/TermQueryPredicate.md>)
An entity describing a term_query_predicate.
- [**TermsQueryPredicate**](<./doc/entities/TermsQueryPredicate.md>)
An entity describing a terms_query_predicate.
- [**GraphqlFieldFetcher**](<./doc/entities/GraphqlFieldFetcher.md>)
An entity describing a graphql_field_fetcher.
- [**GraphqlFieldLink**](<./doc/entities/GraphqlFieldLink.md>)
An entity describing a graphql_field_link.
- [**GraphqlCompositeField**](<./doc/entities/GraphqlCompositeField.md>)
An entity describing a graphql_composite_field.
- [**GraphqlField**](<./doc/entities/GraphqlField.md>)
An entity describing a graphql_field.
- [**GraphqlScalarField**](<./doc/entities/GraphqlScalarField.md>)
An entity describing a graphql_scalar_field.
- [**GraphqlTypeReference**](<./doc/entities/GraphqlTypeReference.md>)
An entity describing a graphql_type_reference.
- [**GraphqlType**](<./doc/entities/GraphqlType.md>)
An entity describing a graphql_type.
- [**MybatisFetcher**](<./doc/entities/MybatisFetcher.md>)
An entity describing a mybatis_fetcher.
- [**RestApiFetcher**](<./doc/entities/RestApiFetcher.md>)
An entity describing a rest_api_fetcher.
- [**RestOperation**](<./doc/entities/RestOperation.md>)
An entity describing a rest_operation.
- [**RestRequestParameter**](<./doc/entities/RestRequestParameter.md>)
An entity describing a rest_request_parameter.
- [**RestResource**](<./doc/entities/RestResource.md>)
An entity describing a rest_resource.
- [**Service**](<./doc/entities/Service.md>)
An entity describing a service.
- [**ElasticSearchClient**](<./doc/entities/ElasticSearchClient.md>)
An entity describing a elastic_search_client.
- [**GraphqlTypeEntry**](<./doc/entities/GraphqlTypeEntry.md>)
An entity describing a graphql_type_entry.
- [**ServiceConfiguration**](<./doc/entities/ServiceConfiguration.md>)
An entity describing a service_configuration.
- [**ServiceConfigurationCategory**](<./doc/entities/ServiceConfigurationCategory.md>)
An entity describing a service_configuration_category.
- [**ConfigurationBinding**](<./doc/entities/ConfigurationBinding.md>)
An entity describing a configuration_binding.
### Script List


- [./script/generate.sh](<./scripts/generate.sh>)

  Generates the resources in each directory of `src/` `model/` `template/` in this project.
  The results are reflected in each directory of `dest/` `doc/` `script/`.

  *Generator input files*

  - `src/`
    Stores static resources that are not processed the generator.
    The contents of this directory are copied directly into the `dest/` directory.

  - `model/`
    Stores the static model data files written in *YAML* or *JSON* format used for the generation.

  - `template/`
    This directory contains the template files used for the generation.
    Files with a extension `.hbs` will be handled as templates. All other files are copied as is.

    - `template/dest` `template/doc` `template/scripts`
      Each of these directories contains the template files of the resource to be output
      in the directory `dest/` `doc/` `scripts`.

    - `template/model` `template/template`
      These directories store template files updating the contents of `template/` and `model/` used for the generation.
      If the content of `template/` `model/` is updated as a result of the generation,
      the generation process is executed recursively.
      The changes to `template/` `model/` that occur during the above process are treated as an intermediate state
      and will be lost after the completion of the process.
      Use the *--dry-run* option to check these intermediate files.

  *Generator output files*

  - `dest/`
    Outputs the source files of applications and modules created as the result of
    the generation process.

  - `doc/`
    Outputs the project documentation.

  - `scripts/`
    Outputs various scripts used in development and operation.

  > Usage: generate.sh [OPTION]...
  >
  > -h, --help
  >
  >   Displays how to use this command.
  >   
  > -v, --verbose
  >
  >   Displays more detailed command execution information.
  >   
  > -d, --dry-run
  >
  >   After this command is processed, the generated files are output to the `.NEXT` directory
  >   without reflecting to the folders of `dest/` `doc/` `scripts/`.
  >   In addition, the difference between the contents of the `.NEXT` directory and the current files.
  >   This directory also contains any intermediate files created during the generation.
  >   
  > -r, --max-recursion [VALUE]
  >
  >   The upper limit of the number of times to execute recursively
  >   when the contents of the `model/` `template/` directory are updated
  >   during the generation process.
  >    (Default: 10)
  > , --local-module-repository [VALUE]
  >
  >   The repository path to store locally built modules.
  >   The modules in this repository have the highest priority.
  >   
  > , --updates-scripts-only
  >
  >   Updates script files only.
  >   This option is used to generate the generator script itself
  >   when the project is initially generated.
  >   
- [./script/publish-local.sh](<./scripts/publish-local.sh>)

  After the resources in the project are generated,
  the resources in the `./dest` directory are built as a model module
  and registered in the local repository.

  > Usage: publish-local.sh [OPTION]...
  >
  > -h, --help
  >
  >   Displays how to use this command.
  >   
  > -v, --verbose
  >
  >   Displays more detailed command execution information.
  >   
  > -r, --max-recursion [VALUE]
  >
  >   This option is the same as the option of the same name in [generate.sh](<./scripts/generate.sh>).
  >    (Default: 10)
  > , --skip-generation
  >
  >   This option is the same as the option of the same name in [generate.sh](<./scripts/generate.sh>).
  >   
  > , --local-module-repository [VALUE]
  >
  >   The path to the local repository where the built module will be stored.
  >   If the repository does not exist in the specified path, it will be created automatically.
  >   
### Source code list


- [model/project.yaml](<./model/project.yaml>)
- [src/model/entities/api-call-argument.yaml](<./src/model/entities/api-call-argument.yaml>)
- [src/model/entities/cache-policy/cache-policy.yaml](<./src/model/entities/cache-policy/cache-policy.yaml>)
- [src/model/entities/cache-policy/heap-memory-cache-configuration.yaml](<./src/model/entities/cache-policy/heap-memory-cache-configuration.yaml>)
- [src/model/entities/cache-policy/redis-cache-policy.yaml](<./src/model/entities/cache-policy/redis-cache-policy.yaml>)
- [src/model/entities/data_file/data-file-fetcher.yaml](<./src/model/entities/data_file/data-file-fetcher.yaml>)
- [src/model/entities/data_file/data-file.yaml](<./src/model/entities/data_file/data-file.yaml>)
- [src/model/entities/datasource/datasource_entry.yaml](<./src/model/entities/datasource/datasource_entry.yaml>)
- [src/model/entities/datasource/datasource.yaml](<./src/model/entities/datasource/datasource.yaml>)
- [src/model/entities/datasource/postgres-jdbc-datasource.yaml](<./src/model/entities/datasource/postgres-jdbc-datasource.yaml>)
- [src/model/entities/duration.yaml](<./src/model/entities/duration.yaml>)
- [src/model/entities/elasticsearch/aggregate/avg-bucket-aggregate.yaml](<./src/model/entities/elasticsearch/aggregate/avg-bucket-aggregate.yaml>)
- [src/model/entities/elasticsearch/aggregate/bucket-script-aggregate.yaml](<./src/model/entities/elasticsearch/aggregate/bucket-script-aggregate.yaml>)
- [src/model/entities/elasticsearch/aggregate/bucket-selector-aggregate.yaml](<./src/model/entities/elasticsearch/aggregate/bucket-selector-aggregate.yaml>)
- [src/model/entities/elasticsearch/aggregate/bucket-sort-aggregate.yaml](<./src/model/entities/elasticsearch/aggregate/bucket-sort-aggregate.yaml>)
- [src/model/entities/elasticsearch/aggregate/date-histogram-aggregate.yaml](<./src/model/entities/elasticsearch/aggregate/date-histogram-aggregate.yaml>)
- [src/model/entities/elasticsearch/aggregate/date-range-aggregate.yaml](<./src/model/entities/elasticsearch/aggregate/date-range-aggregate.yaml>)
- [src/model/entities/elasticsearch/aggregate/filter-aggregate.yaml](<./src/model/entities/elasticsearch/aggregate/filter-aggregate.yaml>)
- [src/model/entities/elasticsearch/aggregate/filters-aggregate.yaml](<./src/model/entities/elasticsearch/aggregate/filters-aggregate.yaml>)
- [src/model/entities/elasticsearch/aggregate/metrics-aggregations.yaml](<./src/model/entities/elasticsearch/aggregate/metrics-aggregations.yaml>)
- [src/model/entities/elasticsearch/aggregate/terms-aggregate.yaml](<./src/model/entities/elasticsearch/aggregate/terms-aggregate.yaml>)
- [src/model/entities/elasticsearch/elasticsearch-aggregate.yaml](<./src/model/entities/elasticsearch/elasticsearch-aggregate.yaml>)
- [src/model/entities/elasticsearch/elasticsearch-index.yaml](<./src/model/entities/elasticsearch/elasticsearch-index.yaml>)
- [src/model/entities/elasticsearch/elasticsearch-query-predicate.yaml](<./src/model/entities/elasticsearch/elasticsearch-query-predicate.yaml>)
- [src/model/entities/elasticsearch/elasticsearch-query-sort.yaml](<./src/model/entities/elasticsearch/elasticsearch-query-sort.yaml>)
- [src/model/entities/elasticsearch/elasticsearch-query.yaml](<./src/model/entities/elasticsearch/elasticsearch-query.yaml>)
- [src/model/entities/elasticsearch/predicate/bool-query-predicate.yaml](<./src/model/entities/elasticsearch/predicate/bool-query-predicate.yaml>)
- [src/model/entities/elasticsearch/predicate/exists-query-predicate.yaml](<./src/model/entities/elasticsearch/predicate/exists-query-predicate.yaml>)
- [src/model/entities/elasticsearch/predicate/match-all-query-predicate.yaml](<./src/model/entities/elasticsearch/predicate/match-all-query-predicate.yaml>)
- [src/model/entities/elasticsearch/predicate/match-query-predicate.yaml](<./src/model/entities/elasticsearch/predicate/match-query-predicate.yaml>)
- [src/model/entities/elasticsearch/predicate/multi-match-query-predicate.yaml](<./src/model/entities/elasticsearch/predicate/multi-match-query-predicate.yaml>)
- [src/model/entities/elasticsearch/predicate/query-string-query-predicate.yaml](<./src/model/entities/elasticsearch/predicate/query-string-query-predicate.yaml>)
- [src/model/entities/elasticsearch/predicate/range-query-predicate.yaml](<./src/model/entities/elasticsearch/predicate/range-query-predicate.yaml>)
- [src/model/entities/elasticsearch/predicate/term-query-predicate.yaml](<./src/model/entities/elasticsearch/predicate/term-query-predicate.yaml>)
- [src/model/entities/elasticsearch/predicate/terms-query-predicate.yaml](<./src/model/entities/elasticsearch/predicate/terms-query-predicate.yaml>)
- [src/model/entities/graphql-type/graphql-field-fetcher/graphql-field-fetcher.yaml](<./src/model/entities/graphql-type/graphql-field-fetcher/graphql-field-fetcher.yaml>)
- [src/model/entities/graphql-type/graphql-field-fetcher/graphql-field-link.yaml](<./src/model/entities/graphql-type/graphql-field-fetcher/graphql-field-link.yaml>)
- [src/model/entities/graphql-type/graphql-field/graphql-composite-field.yaml](<./src/model/entities/graphql-type/graphql-field/graphql-composite-field.yaml>)
- [src/model/entities/graphql-type/graphql-field/graphql-field.yaml](<./src/model/entities/graphql-type/graphql-field/graphql-field.yaml>)
- [src/model/entities/graphql-type/graphql-field/graphql-scalar-field.yaml](<./src/model/entities/graphql-type/graphql-field/graphql-scalar-field.yaml>)
- [src/model/entities/graphql-type/graphql-field/graphql-type-reference.yaml](<./src/model/entities/graphql-type/graphql-field/graphql-type-reference.yaml>)
- [src/model/entities/graphql-type/graphql-type.yaml](<./src/model/entities/graphql-type/graphql-type.yaml>)
- [src/model/entities/mybatis/mybatis-fetcher.yaml](<./src/model/entities/mybatis/mybatis-fetcher.yaml>)
- [src/model/entities/rest_resource/rest-api-fetcher.yaml](<./src/model/entities/rest_resource/rest-api-fetcher.yaml>)
- [src/model/entities/rest_resource/rest-operation.yaml](<./src/model/entities/rest_resource/rest-operation.yaml>)
- [src/model/entities/rest_resource/rest-request-parameter.yaml](<./src/model/entities/rest_resource/rest-request-parameter.yaml>)
- [src/model/entities/rest_resource/rest-resource.yaml](<./src/model/entities/rest_resource/rest-resource.yaml>)
- [src/model/entities/service/elastic-search-client.yaml](<./src/model/entities/service/elastic-search-client.yaml>)
- [src/model/entities/service/graphql_type_entry.yaml](<./src/model/entities/service/graphql_type_entry.yaml>)
- [src/model/entities/service/service_configuration.yaml](<./src/model/entities/service/service_configuration.yaml>)
- [src/model/entities/service.yml](<./src/model/entities/service.yml>)
- [src/model/value_domain_types/file_path.yaml](<./src/model/value_domain_types/file_path.yaml>)
- [src/model/value_domain_types/http_method_for_rest.yaml](<./src/model/value_domain_types/http_method_for_rest.yaml>)
- [src/model/value_domain_types/integer_or_placeholder.yaml](<./src/model/value_domain_types/integer_or_placeholder.yaml>)
- [src/model/value_domain_types/service_configuration_name.yaml](<./src/model/value_domain_types/service_configuration_name.yaml>)
- [src/model/value_domain_types/sort_order_or_placeholder.yaml](<./src/model/value_domain_types/sort_order_or_placeholder.yaml>)
- [src/model/value_domain_types/url_path_with_placeholders.yaml](<./src/model/value_domain_types/url_path_with_placeholders.yaml>)


<!-- @main-content@ -->