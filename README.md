# laplacian-arch:model:service-api-arch

A model that expresses the logical structure of service APIs run on servers.
This model consists of REST api model, GraphQL interface model,
and datasource connection interface model.
REST resource and entities stored on datasources are expressed by 'metamodel' model.



## The structure of the *service-api-arch* model

The following diagram summarizes the structure of the model:

![](./doc/image/model-diagram.svg)


As shown in above diagram, this model depends on the following external models.

- *metamodel* (laplacian.model.metamodel)



## Getting started

Firstly, you need to add the following entry to your `laplacian-module.yml` :

```yaml
project:
  group: ${your.project.group}
  name: ${your.project.name}
  type: project
  version: "1.0.0"
  models:
  ## ↓↓ ADD ↓↓ ##
  - group: laplacian-arch
    name: service-api-arch
    version: "1.0.0"
  ## ↑↑ ADD ↑↑ ##
```

To reflect the change, you need to type the following command in your console :
```bash
./gradlew lM
```

Then put some template files under the *./template* directory and type the following command to generate files:
```bash
./gradlew lG
```