## Description of entities

### Structure
![](./image/model-diagram.svg)



---
### **service** (*laplacian_arch.service_api_arch.model.Service*)
  service

#### Properties
* **name:** `String`
  The name of this service.
* **identifier:** `String?`
  The identifier of this service.
* **version:** `String`
  The version of this service.
* **api_version:** `String?`
  The api_version of this service.
* **endpoint:** `String?`
  The endpoint of this service.
* **host:** `String?`
  The host of this service.
* **port:** `Int?`
  The port of this service.
* **protocol:** `String?`
  The protocol of this service.
* **path:** `String?`
  The path of this service.
* **namespace:** `String?`
  The namespace of this service.
* **description:** `String?`
  The description of this service.
* **datasource_name:** `String`
  The datasource_name of this service.

#### Relationships
* **resource_entries:** `List<ResourceEntry>`
  resource_entries
* **resources:** `List<RestResource>`
  resources
* **datasource:** `Datasource`
  datasource
* **relating_entities:** `List<Entity>`
  relating_entities
* **relating_top_level_entities:** `List<Entity>`
  relating_top_level_entities
* **graphql_queries:** `List<GraphqlQuery>`
  graphql_queries




---
### **resource_entry** (*laplacian_arch.service_api_arch.model.ResourceEntry*)
  resource_entry

#### Properties
* **resource_name:** `String`
  The resource_name of this resource_entry.

#### Relationships
* **service:** `Service`
  service
* **resource:** `RestResource`
  resource




---
### **graphql_query** (*laplacian_arch.service_api_arch.model.GraphqlQuery*)
  graphql_query

#### Properties
* **name:** `String`
  The name of this graphql_query.
* **identifier:** `String?`
  The identifier of this graphql_query.
* **description:** `String?`
  The description of this graphql_query.
* **query:** `String`
  The query of this graphql_query.
* **multiple:** `Boolean?`
  Defines this graphql_query is multiple or not.
* **record_entity_name:** `String?`
  The record_entity_name of this graphql_query.
* **record_type:** `String?`
  The record_type of this graphql_query.
* **return_type:** `String?`
  The return_type of this graphql_query.

#### Relationships
* **service:** `Service`
  service
* **record_entity:** `Entity?`
  record_entity




---
### **rest_resource** (*laplacian_arch.service_api_arch.model.RestResource*)
  rest_resource

#### Properties
* **name:** `String`
  The name of this rest_resource.
* **identifier:** `String?`
  The identifier of this rest_resource.
* **namespace:** `String?`
  The namespace of this rest_resource.
* **path:** `String?`
  The path of this rest_resource.
* **description:** `String?`
  The description of this rest_resource.

#### Relationships
* **operations:** `List<RestOperation>`
  operations
* **relating_entities:** `List<Entity>`
  relating_entities
* **relating_top_level_entities:** `List<Entity>`
  relating_top_level_entities




---
### **rest_operation** (*laplacian_arch.service_api_arch.model.RestOperation*)
  rest_operation

#### Properties
* **method:** `String`
  The method of this rest_operation.
* **path:** `String?`
  The path of this rest_operation.
* **name:** `String?`
  The name of this rest_operation.
* **identifier:** `String?`
  The identifier of this rest_operation.
* **namespace:** `String`
  The namespace of this rest_operation.
* **description:** `String?`
  The description of this rest_operation.
* **response_body_type:** `String`
  The response_body_type of this rest_operation.

#### Relationships
* **resource:** `RestResource`
  resource
* **relating_entities:** `List<Entity>`
  relating_entities
* **relating_top_level_entities:** `List<Entity>`
  relating_top_level_entities
* **path_parameters:** `List<RestDataItem>`
  path_parameters
* **request_headers:** `List<RestDataItem>`
  request_headers
* **query_parameters:** `List<RestDataItem>`
  query_parameters
* **request_body:** `List<RestDataItem>`
  request_body
* **response_headers:** `List<RestDataItem>`
  response_headers
* **response_body:** `List<RestDataItem>`
  response_body
* **response_body_root:** `RestDataItem?`
  response_body_root