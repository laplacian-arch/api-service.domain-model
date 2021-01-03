<!-- @head-content@ -->
# laplacian-arch/api-service.domain-model

一种表示API服务逻辑结构的领域模型。
该模型基于REST资源模型、GraphQL接口定义模型和数据源访问模型。


*Read this in other languages*: [[English](README.md)] [[日本語](README_ja.md)]
<!-- @head-content@ -->

<!-- @toc@ -->
## Table of contents
- [概述](#概述)

  * [模式概述](#模式概述)

- [如何使用](#如何使用)

- [索引](#索引)

  * [实体清单](#实体清单)

  * [命令列表](#命令列表)

  * [源码列表](#源码列表)



<!-- @toc@ -->

<!-- @main-content@ -->
## 概述


### 模式概述


下面的图表显示了本模块所包含的每个实体的内容以及它们之间的关系。
![](./doc/image/model-diagram.svg)

## 如何使用

要应用此model模块，请在项目定义中加入以下条目

```yaml
project:
  models:
  - group: laplacian-arch
    name: api-service.domain-model
    version: 1.0.0
```

您可以运行以下命令查看受本模块应用影响的资源列表及其内容

```console
$ ./script/generate --dry-run

diff --color -r PROJECT_HOME/.NEXT/somewhere/something.md PROJECT_HOME/somewhere/something.md
1,26c1,10
< content: OLD CONTENT
---
> content: NEW CONTENT
```

如果没有问题，请执行下面的命令来反映变化

```console
$ ./script/generate

```


## 索引


### 实体清单


- [**ApiCallArgument**](<./doc/entities/ApiCallArgument.md>)
api_call_argument
- [**CachePolicy**](<./doc/entities/CachePolicy.md>)
cache_policy
- [**HeapMemoryCachePolicy**](<./doc/entities/HeapMemoryCachePolicy.md>)
heap_memory_cache_policy
- [**RedisCachePolicy**](<./doc/entities/RedisCachePolicy.md>)
redis_cache_policy
- [**Duration**](<./doc/entities/Duration.md>)
duration
- [**AvgBucketAggregate**](<./doc/entities/AvgBucketAggregate.md>)
avg_bucket_aggregate
- [**BucketScriptAggregate**](<./doc/entities/BucketScriptAggregate.md>)
bucket_script_aggregate
- [**BucketScriptPath**](<./doc/entities/BucketScriptPath.md>)
bucket_script_path
- [**BucketSelectorAggregate**](<./doc/entities/BucketSelectorAggregate.md>)
bucket_selector_aggregate
- [**BucketSortAggregate**](<./doc/entities/BucketSortAggregate.md>)
bucket_sort_aggregate
- [**FieldSort**](<./doc/entities/FieldSort.md>)
field_sort
- [**DateHistogramAggregate**](<./doc/entities/DateHistogramAggregate.md>)
date_histogram_aggregate
- [**DateHistogramExtendedBounds**](<./doc/entities/DateHistogramExtendedBounds.md>)
date_histogram_extended_bounds
- [**DateHistogramInterval**](<./doc/entities/DateHistogramInterval.md>)
date_histogram_interval
- [**DateHistogramCalendarInterval**](<./doc/entities/DateHistogramCalendarInterval.md>)
date_histogram_calendar_interval
- [**DateHistogramFixedInterval**](<./doc/entities/DateHistogramFixedInterval.md>)
date_histogram_fixed_interval
- [**DateRangeAggregate**](<./doc/entities/DateRangeAggregate.md>)
date_range_aggregate
- [**AggregateGroupRange**](<./doc/entities/AggregateGroupRange.md>)
aggregate_group_range
- [**FilterAggregate**](<./doc/entities/FilterAggregate.md>)
filter_aggregate
- [**FiltersAggregate**](<./doc/entities/FiltersAggregate.md>)
filters_aggregate
- [**KeyedFilter**](<./doc/entities/KeyedFilter.md>)
keyed_filter
- [**SumAggregate**](<./doc/entities/SumAggregate.md>)
sum_aggregate
- [**AvgAggregate**](<./doc/entities/AvgAggregate.md>)
avg_aggregate
- [**MinAggregate**](<./doc/entities/MinAggregate.md>)
min_aggregate
- [**MaxAggregate**](<./doc/entities/MaxAggregate.md>)
max_aggregate
- [**ValueCountAggregate**](<./doc/entities/ValueCountAggregate.md>)
value_count_aggregate
- [**TermsAggregate**](<./doc/entities/TermsAggregate.md>)
A multi-bucket value source based aggregation where buckets are dynamically built
- one per unique value.
- [**ElasticsearchAggregate**](<./doc/entities/ElasticsearchAggregate.md>)
elasticsearch_aggregate
- [**ElasticsearchIndex**](<./doc/entities/ElasticsearchIndex.md>)
elasticsearch_index
- [**ElasticsearchIndexSort**](<./doc/entities/ElasticsearchIndexSort.md>)
elasticsearch_index_sort
- [**ElasticsearchQueryPredicate**](<./doc/entities/ElasticsearchQueryPredicate.md>)
elasticsearch_query_predicate
- [**ElasticsearchQuerySort**](<./doc/entities/ElasticsearchQuerySort.md>)
elasticsearch_query_sort
- [**ElasticsearchQueryScoreSort**](<./doc/entities/ElasticsearchQueryScoreSort.md>)
elasticsearch_query_score_sort
- [**ElasticsearchQueryFieldSort**](<./doc/entities/ElasticsearchQueryFieldSort.md>)
elasticsearch_query_field_sort
- [**ElasticsearchQuery**](<./doc/entities/ElasticsearchQuery.md>)
elasticsearch_query
- [**BoolQueryPredicate**](<./doc/entities/BoolQueryPredicate.md>)
bool_query_predicate
- [**ExistsQueryPredicate**](<./doc/entities/ExistsQueryPredicate.md>)
exists_query_predicate
- [**MatchAllQueryPredicate**](<./doc/entities/MatchAllQueryPredicate.md>)
match_all_query_predicate
- [**MatchQueryPredicate**](<./doc/entities/MatchQueryPredicate.md>)
match_query_predicate
- [**MultiMatchQueryPredicate**](<./doc/entities/MultiMatchQueryPredicate.md>)
multi_match_query_predicate
- [**QueryStringPredicate**](<./doc/entities/QueryStringPredicate.md>)
query_string_predicate
- [**RangeQueryPredicate**](<./doc/entities/RangeQueryPredicate.md>)
range_query_predicate
- [**TermQueryPredicate**](<./doc/entities/TermQueryPredicate.md>)
term_query_predicate
- [**TermsQueryPredicate**](<./doc/entities/TermsQueryPredicate.md>)
terms_query_predicate
- [**EntityOnDatabase**](<./doc/entities/EntityOnDatabase.md>)
entity_on_database
- [**ExternalRestResource**](<./doc/entities/ExternalRestResource.md>)
external_rest_resource
- [**IndexedDocument**](<./doc/entities/IndexedDocument.md>)
indexed_document
- [**RestOperation**](<./doc/entities/RestOperation.md>)
rest_operation
- [**RestRequestParameter**](<./doc/entities/RestRequestParameter.md>)
rest_request_parameter
- [**RestResource**](<./doc/entities/RestResource.md>)
rest_resource
- [**Service**](<./doc/entities/Service.md>)
service
- [**Datasource**](<./doc/entities/Datasource.md>)
A *DataSource* represents an interface through which a client application access to a data store.
This includes the following models.
- The entity that the datastore exposes to the client
- Statement issued by the client to the datastore
- [**ElasticSearchClient**](<./doc/entities/ElasticSearchClient.md>)
elastic_search_client
- [**GraphqlType**](<./doc/entities/GraphqlType.md>)
graphql_type
- [**GraphqlTypeEntry**](<./doc/entities/GraphqlTypeEntry.md>)
graphql_type_entry
- [**GraphqlTypeRelationship**](<./doc/entities/GraphqlTypeRelationship.md>)
graphql_type_relationship
- [**GraphqlIndexedDocumentRelationship**](<./doc/entities/GraphqlIndexedDocumentRelationship.md>)
graphql_indexed_document_relationship
- [**GraphqlTypeRelationshipFieldMapping**](<./doc/entities/GraphqlTypeRelationshipFieldMapping.md>)
graphql_type_relationship_field_mapping
- [**RestClient**](<./doc/entities/RestClient.md>)
rest_client
- [**ServiceConfiguration**](<./doc/entities/ServiceConfiguration.md>)
service_configuration
- [**ServiceConfigurationCategory**](<./doc/entities/ServiceConfigurationCategory.md>)
service_configuration_category
- [**ConfigurationBinding**](<./doc/entities/ConfigurationBinding.md>)
configuration_binding
### 命令列表


- [./script/generate.sh](<./scripts/generate.sh>)

  生成本项目中每个`src/` `model/` `template/`目录下的资源。
  结果反映在`dest/` `doc/` `script/`的每个目录中。

  *生成器输入文件*

  - `src/`
    存储未被生成器处理的静态资源。
    这个目录的内容直接复制到`dest/`目录中。

  - `model/`
    存储以 *YAML* 或 *JSON* 格式编写的静态模型数据文件，用于生成。

  - `template/`
    这个目录中包含了用于生成的模板文件。
    扩展名为`.hbs`的文件将作为模板处理。所有其他文件都会被复制。

    - `template/dest` `template/doc` `template/scripts`
      这些目录中的每一个目录都包含要输出的资源的模板文件，其目录为 `dest/`doc/`scripts`。

    - `template/model` `template/template`
      这些目录存储模板文件，更新生成过程中使用的`template/`和`model/`的内容。
      如果在生成过程中更新了 `template/` `model/` 的内容，则生成过程将递归执行。
      在上述过程中发生的对 `template/` `model/` 的变化被视为中间状态，并在过程完成后丢失。
      使用 *--dry-run* 选项来检查这些中间文件。

  *生成器输出文件*

  - `dest/`
    输出作为生成过程的结果的应用程序和模块的源文件。

  - `doc/`
    输出项目文件。

  - `scripts/`
    输出开发和操作中使用的各种脚本。

  > Usage: generate.sh [OPTION]...
  >
  > -h, --help
  >
  >   显示如何使用此命令。
  >   
  > -v, --verbose
  >
  >   显示更详细的命令执行信息。
  >   
  > -d, --dry-run
  >
  >   该命令处理完毕后，生成的文件将被输出到`.NEXT`目录下。
  >   不反映到`dest/`doc/`doc/`scripts/`文件夹中。
  >   此外，`.NEXT`目录的内容与当前文件之间的差异。
  >   这个目录还包含了在生成过程中创建的任何中间文件。
  >   
  > -r, --max-recursion [VALUE]
  >
  >   当`model/` `template/`目录的内容在生成过程中被更新时，递归执行的次数上限。
  >    (Default: 10)
  > , --local-module-repository [VALUE]
  >
  >   存储本地构建的模块的存储库路径。
  >   这个存储库中的模块具有最高优先级。
  >   
  > , --updates-scripts-only
  >
  >   仅更新脚本文件。
  >   这个选项在项目初始生成时用于生成生成器脚本本身。
  >   
- [./script/publish-local.sh](<./scripts/publish-local.sh>)

  项目中的资源生成后，在`./dest`目录下的资源作为模型模块建立，并在本地资源库中注册。

  > Usage: publish-local.sh [OPTION]...
  >
  > -h, --help
  >
  >   显示如何使用此命令。
  >   
  > -v, --verbose
  >
  >   显示更详细的命令执行信息。
  >   
  > -r, --max-recursion [VALUE]
  >
  >   这个选项与[generate.sh](<./scripts/generate.sh>)中的同名选项相同。
  >    (Default: 10)
  > , --skip-generation
  >
  >   这个选项与[generate.sh](<./scripts/generate.sh>)中的同名选项相同。
  >   
  > , --local-module-repository [VALUE]
  >
  >   到本地存储库的路径。
  >   如果在指定的路径中不存在存储库，将自动创建。
  >   
### 源码列表


- [model/project.yaml](<./model/project.yaml>)
- [src/model/entities/api-call-argument.yaml](<./src/model/entities/api-call-argument.yaml>)
- [src/model/entities/cache-policy/cache-policy.yaml](<./src/model/entities/cache-policy/cache-policy.yaml>)
- [src/model/entities/cache-policy/heap-memory-cache-configuration.yaml](<./src/model/entities/cache-policy/heap-memory-cache-configuration.yaml>)
- [src/model/entities/cache-policy/redis-cache-configuration.yaml](<./src/model/entities/cache-policy/redis-cache-configuration.yaml>)
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
- [src/model/entities/graphql_type/entity_on_database.yaml](<./src/model/entities/graphql_type/entity_on_database.yaml>)
- [src/model/entities/graphql_type/external_rest_resource.yaml](<./src/model/entities/graphql_type/external_rest_resource.yaml>)
- [src/model/entities/graphql_type/indexed_document.yaml](<./src/model/entities/graphql_type/indexed_document.yaml>)
- [src/model/entities/rest_resource/rest_operation.yaml](<./src/model/entities/rest_resource/rest_operation.yaml>)
- [src/model/entities/rest_resource/rest_request_parameter.yaml](<./src/model/entities/rest_resource/rest_request_parameter.yaml>)
- [src/model/entities/rest_resource/rest_resource.yaml](<./src/model/entities/rest_resource/rest_resource.yaml>)
- [src/model/entities/service/datasource.yaml](<./src/model/entities/service/datasource.yaml>)
- [src/model/entities/service/elastic-search-client.yaml](<./src/model/entities/service/elastic-search-client.yaml>)
- [src/model/entities/service/graphql_type_entry.yaml](<./src/model/entities/service/graphql_type_entry.yaml>)
- [src/model/entities/service/graphql_type_relationship.yaml](<./src/model/entities/service/graphql_type_relationship.yaml>)
- [src/model/entities/service/graphql_type.yaml](<./src/model/entities/service/graphql_type.yaml>)
- [src/model/entities/service/rest_client.yaml](<./src/model/entities/service/rest_client.yaml>)
- [src/model/entities/service/service_configuration.yaml](<./src/model/entities/service/service_configuration.yaml>)
- [src/model/entities/service.yml](<./src/model/entities/service.yml>)
- [src/model/value_domain_types/http_method_for_rest.yaml](<./src/model/value_domain_types/http_method_for_rest.yaml>)
- [src/model/value_domain_types/integer_or_placeholder.yaml](<./src/model/value_domain_types/integer_or_placeholder.yaml>)
- [src/model/value_domain_types/service_configuration_name.yaml](<./src/model/value_domain_types/service_configuration_name.yaml>)
- [src/model/value_domain_types/sort_order_or_placeholder.yaml](<./src/model/value_domain_types/sort_order_or_placeholder.yaml>)
- [src/model/value_domain_types/url_path_with_placeholders.yaml](<./src/model/value_domain_types/url_path_with_placeholders.yaml>)


<!-- @main-content@ -->