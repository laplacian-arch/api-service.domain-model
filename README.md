# model.service-api

A model that expresses the logical structure of a service API.
This model consists of REST api model, GraphQL interface model, and datasource usage model.


<!-- @main-content@ -->
<!-- @main-content@ -->

## Model overview

The following diagram summarizes the structure of the model:

![](./doc/image/model-diagram.svg)

## Entities
### [GraphqlQuery](./doc/entities/GraphqlQuery.md)

graphql_query

### [RestDataItem](./doc/entities/RestDataItem.md)

rest_data_item

### [RestOperation](./doc/entities/RestOperation.md)

rest_operation

### [RestResource](./doc/entities/RestResource.md)

rest_resource

### [Service](./doc/entities/Service.md)

service

### [ResourceEntry](./doc/entities/ResourceEntry.md)

resource_entry



## Usage

Add the following entry to your project definition.

```yaml
project:
  models:
  - group: laplacian-arch
    name: model.service-api
    version: 1.0.0
```